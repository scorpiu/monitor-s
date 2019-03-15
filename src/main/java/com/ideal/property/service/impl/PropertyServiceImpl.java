package com.ideal.property.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ideal.property.dto.*;
import com.ideal.property.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.ideal.filter.DifferentDays;
import com.ideal.property.dto.CustomerServiceDto;
import com.ideal.property.dto.DictionaryDto;
import com.ideal.property.dto.OfferInstDto;
import com.ideal.property.dto.OfferInstRelDto;
import com.ideal.property.dto.OfferProdInstRelDto;
import com.ideal.property.dto.ProdInstAttrDto;
import com.ideal.property.dto.ProdInstDto;
import com.ideal.property.dto.ProductDto;
import com.ideal.property.dto.UserInfoDto;
import com.ideal.property.mapper.DictionaryMapper;
import com.ideal.property.mapper.OfferInstMapper;
import com.ideal.property.mapper.OfferInstRelMapper;
import com.ideal.property.mapper.OfferProdInstRelMapper;
import com.ideal.property.mapper.ProdInstAttrMapper;
import com.ideal.property.mapper.ProdInstMapper;
import com.ideal.property.mapper.ProductMapper;
import com.ideal.property.mapper.PropertyMapper;
import com.ideal.property.mapper.UserInfoMapper;


@Service
public class PropertyServiceImpl {

	@Autowired
	private UserInfoMapper userInfoMapper;

	@Autowired
	private OfferInstMapper offerInstMapper;

	@Autowired
	private OfferProdInstRelMapper offerProdInstRelMapper;

	@Autowired
	private ProdInstMapper prodInstMapper;

	@Autowired
	private ProdInstAttrMapper prodInstAttrMapper;

	@Autowired
	private DictionaryMapper dictionaryMapper;

	@Autowired
	private ProductMapper productMapper;

	@Autowired
	private OfferInstRelMapper offerInstRelMapper;

	@Autowired
	private PropertyMapper propertyMapper;

	@Autowired
	private CustomerMapper customerMapper;

	public List<Map> getPropertiesForPage(String phoneNum){
		List<Map> list_data = new ArrayList<Map>();

		List<Map> list_product = new ArrayList<Map>();

		String username = phoneNum;


//		UserInfoDto userInfo = userInfoMapper.getUserInfo(phoneNum);
//		String username = userInfo.getUser_name(); //获取用户
//
//		if(null == userInfo){
//
//		}

		List<OfferInstDto> offerInsts = offerInstMapper.getOfferInst(username);

		for(OfferInstDto offerInst_dad : offerInsts){


			int sale_dadId = offerInst_dad.getOFFER_INST_ID();//父销售品id
			List<OfferInstRelDto> offerInstRels = offerInstRelMapper.getOfferInstRel(sale_dadId);
			List<OfferInstRelDto> offerInstRelBySon_list = offerInstRelMapper.getOfferInstRelBySonId(sale_dadId);

			//1.29_alan_添加基础销售品
			if(offerInstRels.size()==0){

				//1.29_alan_验证添加销售品实例表增加的子销售品逻辑
				/*int flag = 1;
				for(OfferInstRelDto verification : offerInstRelBySon_list){
					if(!StringUtils.isEmpty(verification)){
						flag = 0;
						break;
					}
				}
				if(flag==1){*/
				if(offerInstRelBySon_list.size()==0){

					Map<String,Object> map_sale_jichu = new HashMap<String,Object>();
					List<Map> list_product_jichu = new ArrayList<Map>();


					String saleName = offerInst_dad.getOFFER_INST_NAME();//销售品名
//					map_sale.put("propertyid", sale_dadId);
//					map_sale.put("propertyName", saleName);
					map_sale_jichu.put("propertyid", sale_dadId);
					map_sale_jichu.put("propertyName", saleName);


					int saleId = sale_dadId;//单销售品id



					List<OfferProdInstRelDto> offerProdInsts = offerProdInstRelMapper.getOfferProdInstRel(saleId);
					for(OfferProdInstRelDto offerProdInst : offerProdInsts){
						Map<String,Object> map_product_jichu = new HashMap<String,Object>();
						//TODO 联系人  getContactUser(用户名,产品id) return List<用户>

						//产品id
						int product_inst_id = offerProdInst.getPROD_INST_ID();
						ProdInstDto prodInst2 = prodInstMapper.getProdInstByProInsId(product_inst_id);
						int productId = prodInst2.getPROD_ID();

						ProdInstDto prodInst = prodInstMapper.getProdInst(product_inst_id, username);
//						ProdInstDto prodInst = prodInst_list.get(0);

						//通过PROD_INST_ID 主键
						/*ProdInstDto prodInst = prodInstMapper.getProdInst(productId);*/

						//alan_2.27_添加product_instid
						//map_product_jichu.put("productid", productId);//产品id
						map_product_jichu.put("productid", prodInst.getPROD_INST_ID());//产品id
						map_product_jichu.put("title", prodInst.getPROD_INST_NAME());//产品名称

						List<ProdInstAttrDto> prodInstAttrs = prodInstAttrMapper.getProdInstAttr(productId);

						//产品属性--缩略图地址,产品状态,联系人
						List<String> contactUser_list = new ArrayList<String>();
						for(ProdInstAttrDto prodInstAttr : prodInstAttrs){
							Integer dictionaryId = prodInstAttr.getATTR_ID(); //属性编码
							String attr_VAL = prodInstAttr.getATTR_VAL();//属性值

							DictionaryDto dictionary = dictionaryMapper.getDictionary(dictionaryId);
							String attr_NAME = dictionary.getATTR_NAME();
							if("缩略图地址".equals(attr_NAME)){
								map_product_jichu.put("thumb", attr_VAL);
							}else if("产品状态".equals(attr_NAME)){
								map_product_jichu.put("isinstall", attr_VAL);
							}else if("联系人".equals(attr_NAME)){
								contactUser_list.add(attr_NAME);
							}else if("图片地址".equals(attr_NAME)){

							}else{
								try {
									throw new Exception("字典表未定义~");
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							map_product_jichu.put("contact", contactUser_list);
						}

						//产品属性--产品类型,产品描述
						ProductDto product = productMapper.getProduct(productId);
						String producttype = product.getPROD_TYPE();
						String productdesc = product.getPROD_DESC();
						if("M".equals(producttype)){
							map_product_jichu.put("producttype", "监控类");
						}else if("A".equals(producttype)){
							map_product_jichu.put("producttype", "加装包类");
						}
						map_product_jichu.put("desc", productdesc);
						//是否安装,生效--------------
						map_product_jichu.put("isinstall", 0);

						list_product_jichu.add(map_product_jichu);
						System.out.println("list_product_jichu:"+list_product_jichu);
				}
					//System.out.println("map_sale_jichu:"+map_sale_jichu);
					//System.out.println("map_sale_jichu--size:"+map_sale_jichu.size());
					map_sale_jichu.put("product", list_product_jichu);
					list_data.add(map_sale_jichu);

				}


			}else{
				Map<String,Object> map_sale = new HashMap<String,Object>();
				String saleName = offerInst_dad.getOFFER_INST_NAME();//销售品名
				map_sale.put("propertyid", sale_dadId);
				map_sale.put("propertyName", saleName);

				for(OfferInstRelDto offerInstRel : offerInstRels){
//					Map<String,Object> map_sale = new HashMap<String,Object>();
					int saleId = offerInstRel.getOFFER_INST_ID();//单销售品id
					//map_sale.put("propertyid", saleId);

					List<OfferProdInstRelDto> offerProdInsts = offerProdInstRelMapper.getOfferProdInstRel(saleId);
					for(OfferProdInstRelDto offerProdInst : offerProdInsts){
						Map<String,Object> map_product = new HashMap<String,Object>();
						//TODO 联系人  getContactUser(用户名,产品id) return List<用户>

						//产品id
						int product_inst_id = offerProdInst.getPROD_INST_ID();
						ProdInstDto prodInst2 = prodInstMapper.getProdInstByProInsId(product_inst_id);
						int productId = prodInst2.getPROD_ID();

						ProdInstDto prodInst = prodInstMapper.getProdInst(product_inst_id, username);
//						ProdInstDto prodInst = prodInst_list.get(0);

						//通过PROD_INST_ID 主键
						/*ProdInstDto prodInst = prodInstMapper.getProdInst(productId);*/

						//alan_2.27_添加product_instid
//						map_product.put("productid", productId);//产品id 
						map_product.put("productid", prodInst.getPROD_INST_ID());//产品id
						map_product.put("title", prodInst.getPROD_INST_NAME());//产品名称

						List<ProdInstAttrDto> prodInstAttrs = prodInstAttrMapper.getProdInstAttr(productId);

						//产品属性--缩略图地址,产品状态,联系人
						List<String> contactUser_list = new ArrayList<String>();
						for(ProdInstAttrDto prodInstAttr : prodInstAttrs){
							Integer dictionaryId = prodInstAttr.getATTR_ID(); //属性编码
							String attr_VAL = prodInstAttr.getATTR_VAL();//属性值

							DictionaryDto dictionary = dictionaryMapper.getDictionary(dictionaryId);
							String attr_NAME = dictionary.getATTR_NAME();
							if("缩略图地址".equals(attr_NAME)){
								map_product.put("thumb", attr_VAL);
							}else if("产品状态".equals(attr_NAME)){
								map_product.put("isinstall", attr_VAL);
							}else if("联系人".equals(attr_NAME)){
								contactUser_list.add(attr_NAME);
							}else if("图片地址".equals(attr_NAME)){

							}else{
								try {
									throw new Exception("字典表未定义~");
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
							map_product.put("contact", contactUser_list);
						}

						//产品属性--产品类型,产品描述
						ProductDto product = productMapper.getProduct(productId);
						String producttype = product.getPROD_TYPE();
						String productdesc = product.getPROD_DESC();
						if("M".equals(producttype)){
							map_product.put("producttype", "监控类");
						}else if("A".equals(producttype)){
							map_product.put("producttype", "加装包类");
						}
						map_product.put("desc", productdesc);
						//是否安装,生效--------------
						map_product.put("isinstall", 0);

						list_product.add(map_product);
				}

			}
				map_sale.put("product", list_product);
				list_data.add(map_sale);
			}




		//List<OfferInstDto> offerInsts = offerInstMapper.getOfferInst(username);
		/*for(OfferInstDto offerInst : offerInsts){
			Map<String,Object> map_sale = new HashMap<String,Object>();
			int saleId = offerInst.getOFFER_ID();//单销售品id
			String saleName = offerInst.getOFFER_INST_NAME();//销售品名
			map_sale.put("propertyid", saleId);
			map_sale.put("propertyName", saleName);

			List<OfferProdInstRelDto> offerProdInsts = offerProdInstRelMapper.getOfferProdInstRel(saleId);
			for(OfferProdInstRelDto offerProdInst : offerProdInsts){
				Map<String,Object> map_product = new HashMap<String,Object>();
				//TODO 联系人  getContactUser(用户名,产品id) return List<用户>

				//产品id
				int productId = offerProdInst.getPROD_ID();

				List<ProdInstDto> prodInst_list = prodInstMapper.getProdInst(productId, username);
				ProdInstDto prodInst = prodInst_list.get(0);
				map_product.put("productid", productId);//产品id
				map_product.put("title", prodInst.getPROD_INST_NAME());//产品名称

				List<ProdInstAttrDto> prodInstAttrs = prodInstAttrMapper.getProdInstAttr(productId);

				//产品属性--缩略图地址,产品状态,联系人
				List<String> contactUser_list = new ArrayList<String>();
				for(ProdInstAttrDto prodInstAttr : prodInstAttrs){
					Integer dictionaryId = prodInstAttr.getATTR_ID(); //属性编码
					String attr_VAL = prodInstAttr.getATTR_VAL();//属性值

					DictionaryDto dictionary = dictionaryMapper.getDictionary(dictionaryId);
					String attr_NAME = dictionary.getATTR_NAME();
					if("缩略图地址".equals(attr_NAME)){
						map_product.put("thumb", attr_VAL);
					}else if("产品状态".equals(attr_NAME)){
						map_product.put("isinstall", attr_VAL);
					}else if("联系人".equals(attr_NAME)){
						contactUser_list.add(attr_NAME);
					}else if("图片地址".equals(attr_NAME)){

					}else{
						try {
							throw new Exception("字典表未定义~");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					map_product.put("contact", contactUser_list);
				}

				//产品属性--产品类型,产品描述
				ProductDto product = productMapper.getProduct(productId);
				String producttype = product.getPROD_TYPE();
				String productdesc = product.getPROD_DESC();
				if("M".equals(producttype)){
					map_product.put("producttype", "监控类");
				}else if("A".equals(producttype)){
					map_product.put("producttype", "加装包类");
				}
				map_product.put("desc", productdesc);
				//是否安装,生效--------------
				map_product.put("isinstall", 0);

				list_product.add(map_product);
			}*/



			/*map_sale.put("product", list_product);
			list_data.add(map_sale);*/
		}
		return list_data;
	}


//	public static void main(String args[]){
//		List list = new ArrayList();
//		for(int i=0; i<3; i++){
//			Map<String, String> map = new HashMap<String, String>();
//			map.put(i+"", i*111+"");
//
//			System.out.println(map.hashCode());
//			list.add(map);
//		}
//		System.out.println("list:"+list);
//
//	}

	//预约查询资源占用
	public List<Map<String, Object>> queryPropertyResource(String pROD_INST_ID) throws ParseException {
		// TODO Auto-generated method stub

		List<Map<String , Object>> resourcesMap = new ArrayList<Map<String , Object>>();
		SimpleDateFormat nowSimple = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeSimple = new SimpleDateFormat("HH:mm:ss");
		String nowDate = nowSimple.format(new Date());
		int days = 7;
		for (int i = 1; i <= days; i++) {
			String plusDay = DifferentDays.plusDay(i, nowDate);
			String startTime = "08:00:00";
			long time = timeSimple.parse(startTime).getTime();
			for (int j = 0; j < 5; j++) {
				Map<String,Object> dateMap = new HashMap<String,Object>();
				time += (j*7200*1000);
				String format = timeSimple.format(new Date(time));
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("PROD_INST_ID", pROD_INST_ID);
				map.put("START_TIME", format);
				map.put("START_DATE", plusDay);
				int sum = propertyMapper.queryPropertyResources(map);
//				dateMap.put(nowSimple.parse(plusDay).getTime()+timeSimple.parse(format).getTime()+"", 5-sum);
				dateMap.put("timeStamp",nowSimple.parse(plusDay).getTime()+timeSimple.parse(format).getTime());
				dateMap.put("state",5-sum); 

				resourcesMap.add(dateMap);
			}
		}
		return resourcesMap;
	}


	public Object addPropertyResource(String oFFER_INST_ID, String uSER_NAME, String sTART_TIME) {
		// TODO Auto-generated method stub
		String msg = "等待管理员确认";
		try {
			Map<String, Object> map = new HashMap<String, Object>();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat dateSimple = new SimpleDateFormat("yyyy-MM-dd");
			SimpleDateFormat timeSimple = new SimpleDateFormat("HH:mm:ss");
			String date = dateSimple.format(new Date(Long.parseLong(sTART_TIME)));
			String starttime = timeSimple.format(new Date(Long.parseLong(sTART_TIME)));
			String endtime = timeSimple.format(new Date(Long.parseLong(sTART_TIME)+7200*1000));
			map.put("OFFER_INST_ID", oFFER_INST_ID);
			map.put("DATE", date);
			map.put("STARTTIME", starttime);
			map.put("ENDTIME", endtime);
			propertyMapper.addPropertyResource(map);
		} catch (Exception e) {
			// TODO: handle exception
			msg = "预约失败";
		}

		return msg;
	}


	public List<String> getContact(String userName){
		return propertyMapper.getContact(userName);
	}


	public String addCustomerService(String prodInstId,String userName, String contactName, long time){
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddHHmmss");
		String serial = sdf.format(new Date());

		SimpleDateFormat dateSimple = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeSimple = new SimpleDateFormat("HH:mm:ss");
		String reservationDate = dateSimple.format(new Date(time*1000));
		String reservationTime = timeSimple.format(new Date(time*1000));
		System.out.println( "-------------serial-------" +  serial);
		System.out.println( "-------------date-------" +  reservationDate);
		System.out.println( "-------------starttime-------" +  reservationTime);

		Map<String,String> param = new HashMap<>();
		param.put("serial", serial);
		param.put("userName", userName);
		param.put("prodInstId", prodInstId);
		param.put("contactName", contactName);
		param.put("reservationDate", reservationDate);
		param.put("reservationTime", reservationTime);
		param.put("status", "0");//状态为0，标识未确认

		propertyMapper.addCustomerService(param);
		return serial;
	}


	public List acquireCustomerEstate(String userName) {

		List<CustomerOfferInst> customerOfferInstList = customerMapper.acquireCustomerOfferInst(userName);
		Map<String, Object> resultMap = new HashMap<>();


		Map offerresultMap = new HashMap();
		List offerList = new ArrayList();

		//组装商品返回实例
		for(CustomerOfferInst customerOfferInst : customerOfferInstList){
			//商品实例对象
			Map offerMap = (Map) offerresultMap.get(customerOfferInst.getOfferInstId());
			CustomerOffer customerOffer = (CustomerOffer) resultMap.get(customerOfferInst.getOfferInstId());
			if(null == customerOffer){
				offerMap = new HashMap();
				customerOffer = new CustomerOffer();
				customerOffer.setOfferId(customerOfferInst.getOfferId());
				customerOffer.setOfferInstId(customerOfferInst.getOfferInstId());
				customerOffer.setOfferName(customerOfferInst.getOfferName());
				customerOffer.setStartDate(customerOfferInst.getStartDate());
				customerOffer.setEndDate(customerOfferInst.getEndDate());
				customerOffer.setUserName(customerOfferInst.getUserName());
				customerOffer.setOrderSerial(customerOfferInst.getOrderSerial());
				customerOffer.setChildMap(new HashMap());

				offerMap.put("propertyName", customerOfferInst.getOfferName());
				offerMap.put("propertyid", customerOfferInst.getOfferInstId());
				offerMap.put("startDate", customerOfferInst.getStartDate().substring(0,10));
				offerMap.put("endDate", customerOfferInst.getEndDate().substring(0,10));
				offerMap.put("product", new ArrayList<>());



			}

			String childOfferInstId = customerOfferInst.getChildOfferInstId();
			if(null != childOfferInstId && !"".equals(childOfferInstId)){
				//含有子商品，添加子商品列表,并查看包含的产品
				CustomerOffer childCustomerOffer = new CustomerOffer();
				childCustomerOffer.setOfferId(customerOfferInst.getChildOfferId());
				childCustomerOffer.setOfferInstId(customerOfferInst.getChildOfferInstId());
				childCustomerOffer.setOfferName(customerOfferInst.getChildOfferInstName());
				childCustomerOffer.setStartDate(customerOfferInst.getChildStartDate());
				childCustomerOffer.setEndDate(customerOfferInst.getChildEndDate());
				CustomerProd customerProd =packageCustomerProd(customerOfferInst, customerOfferInst.getChildOfferInstId());
				Map prodMap = new HashMap();
				prodMap.put(customerProd.getProdInstId(),customerProd);
				childCustomerOffer.setChildMap(prodMap);
				customerOffer.getChildMap().put(childOfferInstId, childCustomerOffer);



				List prodList = (List) offerMap.get("product");
				prodList.add(customerProd);
				offerMap.put("product", prodList);


			}else {
				//不含有子商品。查看所包含的产品
				CustomerProd customerProd =packageCustomerProd(customerOfferInst, customerOfferInst.getChildOfferInstId());
				if(null !=customerProd){

					customerOffer.getChildMap().put(customerProd.getProdInstId(), customerProd);
					List prodList = (List) offerMap.get("product");
					prodList.add(customerProd);
					offerMap.put("product", prodList);
				}
			}

			offerresultMap.put(customerOfferInst.getOfferInstId(), offerMap);
			resultMap.put(customerOfferInst.getOfferInstId(), customerOffer);

		}


		for (Object s : offerresultMap.keySet()){
			offerList.add(offerresultMap.get(s));
		}


		return offerList;
	}

	public CustomerProd packageCustomerProd(CustomerOfferInst customerOfferInst, String OfferInstId){
		//查看包含的产品
		List<CustomerProdInst> CustomerProdInstList = customerMapper.acquireCustomerProdInst(OfferInstId);
		System.out.println("OfferInstId : "+OfferInstId);
		if(CustomerProdInstList.size() == 0){
			return null;
		}
		//包装产品实例
		CustomerProdInst customerProdInst = CustomerProdInstList.get(0);
		if(null != customerProdInst){
			CustomerProd customerProd = new CustomerProd();
			customerProd.setOrderSerial(customerOfferInst.getOrderSerial());
			customerProd.setUserName(customerOfferInst.getUserName());
			customerProd.setProdId(customerProdInst.getProdId());
			customerProd.setProdInstId(customerProdInst.getProdInstId());
			customerProd.setProdName(customerProdInst.getProdInstName());
			customerProd.setProdType(customerProdInst.getProdInstType());
			customerProd.setStartDate(customerOfferInst.getChildStartDate());
			customerProd.setEndDate(customerOfferInst.getChildEndDate());
			customerProd.setProdDesc(customerProdInst.getProdDesc());
			List<Map> attrList =  customerMapper.acquireCustomerProdInstAttr(customerProdInst.getProdInstId());

			for (Map attrs : attrList){
				Integer attrId = (Integer) attrs.get("ATTR_ID");
				if(1001 == attrId){
					String breviary = (String) attrs.get("ATTR_VAL");
					customerProd.setThumb(breviary);
				}
				if (1003 == attrId){
					Integer status = (Integer) attrs.get("ATTR_VAL");
					if(status != null){
						customerProd.setStatus(status);
					}else {
						customerProd.setStatus(0);
					}
				}else {
					customerProd.setStatus(0);
				}


			}


			return customerProd;
		}
		return null;
	}
	
		public Map<String, String> queryYuyue(String productInstId){
		Map<String, String> map_yuyue = new HashMap<String, String>();
		CustomerServiceDto queryYuYue = propertyMapper.queryYuYue(Integer.parseInt(productInstId));
		if(!StringUtils.isEmpty(queryYuYue)){
			String contact_yuyue = queryYuYue.getContact_name();
			String time_yuyue = queryYuYue.getReservation_date()+" "+queryYuYue.getReservation_time();
			map_yuyue.put("contactUser", contact_yuyue);
			map_yuyue.put("yuyueTime", time_yuyue);
		}else{
			map_yuyue.put("contactUser", "-请选择-");
			map_yuyue.put("yuyueTime", "-请选择-");
		}
		
		return map_yuyue;
	}



}
