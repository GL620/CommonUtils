package com.persagy.ems.common.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * JSONObject对象按某字段固定排序
 * @author drx
 *
 */
public class CustomSortUtil {
	 /**
     * List<JSONObject>类型Long字段排序
     * @param array
     * @param field  排序的字段
     * @param order      -1:倒序  1:正序
     * @return
     */
    public static List<JSONObject> sortLongByField(List<JSONObject> array, final String field, final int order){
        if(array != null && array.size() > 1){
            Collections.sort(array, new Comparator<JSONObject>(){
    			@Override
                public int compare(JSONObject obj1, JSONObject obj2){
                    Long value1 = obj1.getLong(field);
                    Long value2 = obj2.getLong(field);
                    if(null == value1 && null == value2){
                        return 0;
                    }
                	if(null == value1) {
                		return -1 * order;
                	}
                	if(null == value2) {
                		return order;
                	}
                    return value1.compareTo(value2) * order;
                }
            });
        }
        return array;
    }
    
    /**
     * List<JSONObject>类型Double字段排序
     * @param array
     * @param field  排序的字段
     * @param order      -1:倒序  1:正序
     * @return
     */
    public static List<JSONObject> sortDoubleByField(List<JSONObject> array, final String field, final int order){
    	if(array != null && array.size() > 1){
    		Collections.sort(array, new Comparator<JSONObject>(){
    			@Override
    			public int compare(JSONObject obj1, JSONObject obj2){
    				Double value1 = obj1.getDouble(field);
    				Double value2 = obj2.getDouble(field);
                    if(null == value1 && null == value2){
                        return 0;
                    }
                	if(null == value1) {
                		return -1 * order;
                	}
                	if(null == value2) {
                		return order;
                	}
    				return value1.compareTo(value2) * order;
    			}
    		});
    	}
    	return array;
    }
    
    /**
     * List<JSONObject>类型String字段排序
     * @param array
     * @param field  排序的字段
     * @param order      -1:倒序  1:正序
     * @return
     */
    public static List<JSONObject> sortStringByField(List<JSONObject> array, final String field, final int order){
    	if(array != null && array.size() > 1){
    		Collections.sort(array, new Comparator<JSONObject>(){
    			@Override
    			public int compare(JSONObject obj1, JSONObject obj2){
    				String value1 = obj1.getString(field);
    				String value2 = obj2.getString(field);
                    if(null == value1 && null == value2){
                        return 0;
                    }
                	if(null == value1) {
                		return -1 * order;
                	}
                	if(null == value2) {
                		return order;
                	}
    				return value1.compareTo(value2) * order;
    			}
    		});
    	}
    	return array;
    }
    
    /**
     * JSONArray类型按照String字段排序
     * @param array
     * @param field  排序的字段
     * @param order      -1:倒序  1:正序
     * @return
     */
    public static JSONArray sortByStringField(JSONArray array, String field, int order){
    	if(array != null && array.size() > 1){
    		Collections.sort(array, new Comparator<Object>(){
    			@Override
    			public int compare(Object str1, Object str2){
    				JSONObject obj1 = JSONObject.parseObject(str1.toString());
    				JSONObject obj2 = JSONObject.parseObject(str2.toString());
    				String value1 = obj1.getString(field);
    				String value2 = obj2.getString(field);
                    if(null == value1 && null == value2){
                        return 0;
                    }
                	if(null == value1) {
                		return -1 * order;
                	}
                	if(null == value2) {
                		return order;
                	}
    				return value1.compareTo(value2) * order;
    			}
    		});
    	}
    	return array;
    }
    
    /**
     * JSONArray类型按照Double字段排序
     * @param array
     * @param field  排序的字段
     * @param order      -1:倒序  1:正序
     * @return
     */
    public static JSONArray sortByDoubleField(JSONArray array, String field, int order){
    	if(array != null && array.size() > 1){
    		Collections.sort(array, new Comparator<Object>(){
    			@Override
    			public int compare(Object str1, Object str2){
    				JSONObject obj1 = JSONObject.parseObject(str1.toString());
    				JSONObject obj2 = JSONObject.parseObject(str2.toString());
    				Double value1 = obj1.getDouble(field);
    				Double value2 = obj2.getDouble(field);
                    if(null == value1 && null == value2){
                        return 0;
                    }
                	if(null == value1) {
                		return -1 * order;
                	}
                	if(null == value2) {
                		return order;
                	}
    				return value1.compareTo(value2) * order;
    			}
    		});
    	}
    	return array;
    }
    
    
    /**
     * JSONArray类型按照Long字段排序
     * @param array
     * @param field  排序的字段
     * @param order      -1:倒序  1:正序
     * @return
     */
    public static JSONArray sortByLongField(JSONArray array, String field, int order){
    	if(array != null && array.size() > 1){
    		Collections.sort(array, new Comparator<Object>(){
    			@Override
    			public int compare(Object str1, Object str2){
    				JSONObject obj1 = JSONObject.parseObject(str1.toString());
    				JSONObject obj2 = JSONObject.parseObject(str2.toString());
    				Long value1 = obj1.getLong(field);
    				Long value2 = obj2.getLong(field);
                    if(null == value1 && null == value2){
                        return 0;
                    }
                	if(null == value1) {
                		return -1 * order;
                	}
                	if(null == value2) {
                		return order;
                	}
    				return value1.compareTo(value2) * order;
    			}
    		});
    	}
    	return array;
    }
    
    public static LinkedList<Integer> orderInt(List<String> orderList) {
		LinkedList<Integer> orderInt = new LinkedList<Integer>();
		if (orderList != null && orderList.size() > 0) {
			for (String string : orderList) {
				orderInt.add(Integer.valueOf(string));
			}
			Collections.sort(orderInt);
		}
		return orderInt;

	}
	
	
	//匿名内部类实现排序
	public static LinkedList<String> orderStr(LinkedList<String> orderList) {
		Collections.sort(orderList, new Comparator<String>() {
			@Override
			public int compare(String floorOrder1, String floorOrder2) {
				if(StringUtils.isBlank(floorOrder1) && StringUtils.isNotBlank(floorOrder2)){
	        		return 1;
	        	}else if(StringUtils.isNotBlank(floorOrder1) && StringUtils.isBlank(floorOrder2)){
	        		return -1;
	        	}else if(StringUtils.isBlank(floorOrder1) && StringUtils.isBlank(floorOrder2)){
	        		return 0;
	        	}else{
	        		 return Integer.valueOf(floorOrder1).compareTo(Integer.valueOf(floorOrder2));
	        	}
			}
		});
		return orderList;
	}
	
	

    /**
     * 支持两个字段排序
     * @param result
     * @param order
     * @param orderType
     * @param twoOrder 第二排序字段
     * @param twoType 第二排序顺序
     * @return
     * @author drx
     */
    public static List<Map<String, Object>> resultOrder(List<Map<String, Object>> result,  final String orderKey, final Integer orderType, 
    		final String twoOrder, final Integer twoType){

        if(result == null || orderType == null){
            return result;
        }

        Collections.sort(result, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                return commonOrder(orderKey, orderType, o1, o2, twoOrder, twoType);
            }
        });
        return result;
    }
    
    /**
     * 支持两个字段排序
     * @param result(List<JSONObject>)
     * @param order
     * @param orderType
     * @param twoOrder 第二排序字段
     * @param twoType 第二排序顺序
     * @return
     * @author drx
     */
    public static List<JSONObject> resultOrderJSONObject(List<JSONObject> result,  final String orderKey, final Integer orderType, 
    		final String twoOrder, final Integer twoType){
    	
    	if(result == null || orderType == null){
    		return result;
    	}
    	
    	Collections.sort(result, new Comparator<Object>() {
    		@Override
    		public int compare(Object o1, Object o2) {
    			return commonOrder(orderKey, orderType, o1, o2, twoOrder, twoType);
    		}
    	});
    	return result;
    }
    /**
     * 支持两个字段排序
     * @param result(List<JSONObject>)
     * @param order
     * @param orderType
     * @param twoOrder 第二排序字段
     * @param twoType 第二排序顺序
     * @return
     * @author drx
     */
    public static JSONArray resultOrderJSONArray(JSONArray result,  final String orderKey, final Integer orderType, 
    		final String twoOrder, final Integer twoType){
    	
    	if(result == null || orderType == null){
    		return result;
    	}
    	
    	Collections.sort(result, new Comparator<Object>() {
    		@Override
    		public int compare(Object o1, Object o2) {
    			return commonOrder(orderKey, orderType, o1, o2, twoOrder, twoType);
    		}
    	});
    	return result;
    }

    /**
     * 公共的排序部分
     * @param orderKey
     * @param oType
     * @param obj1
     * @param obj2
     * @param twoOrder
     * @param twoType
     * @return
     */
    public static Integer commonOrder(final String orderKey, final Integer oType, Object obj11, Object obj21, String twoOrder, Integer twoType) {
        //重点注意
        if(null == obj11 && null == obj21){
            return 0;
        }
    	if(null == obj11) {
    		return Math.abs(oType);
    	}
    	if(null == obj21) {
    		return -Math.abs(oType);
    	}
    	
    	JSONObject json1 = JSONObject.parseObject(obj11.toString());
    	JSONObject json2 = JSONObject.parseObject(obj21.toString());
    	
    	Object obj1 = json1.get(orderKey);
    	Object obj2 = json2.get(orderKey);
    	if(obj1 instanceof Date && obj2 instanceof Date){
    		//日期排序
    		Date date1 = (Date)obj1;
    		Date date2 = (Date)obj2;
    		return longCompare(oType, date1.getTime(), date2.getTime(), obj11, obj21, twoOrder, twoType);
    	}else if(obj1 instanceof String && obj2 instanceof String){
    		//字符串排序
    		String str1 = obj1.toString();
    		String str2 = obj2.toString();
    		
    		if(str1.compareTo(str2) == 0){
    			if(twoOrder != null && twoType != null){
    				//相等就使用第二字段排序
    				return commonOrder(twoOrder, twoType, obj1, obj2, null, null);
    			}
    			//相同的是否进行交互
    			return 0;
    		}
    		return str1.compareTo(str2) * oType;
    	}else if((obj1 instanceof Double || obj1 instanceof Float) && (obj2 instanceof Double || obj2 instanceof Float)){
    		//浮点型排序
    		return doubleCompare(oType, obj1, obj2, obj11, obj21, twoOrder, twoType);
    	}else if((obj1 instanceof Long || obj1 instanceof Integer || obj1 instanceof Short || obj1 instanceof Byte) && 
    			(obj2 instanceof Long || obj2 instanceof Integer || obj2 instanceof Short || obj2 instanceof Byte)){
    		//整数型排序
    		return longCompare(oType, obj1, obj2, obj11, obj21, twoOrder, twoType);
    	}else if((obj1.getClass() != obj2.getClass()) && (obj1 instanceof Number && obj2 instanceof Number)){
    		//这种情况可能是，既有整数又有浮点数
    		return doubleCompare(oType, obj1, obj2, obj11, obj21, twoOrder, twoType);
    	}
    	return 0;

    }

    /**
     * 整形比较大小
     * @param oType
     * @param obj1
     * @param obj2
     * @param twoOrder
     * @param twoType
     * @return
     */
    private static int longCompare(final Integer oType, Object obj1, Object obj2, Object obj11, Object obj21, String twoOrder, Integer twoType) {
    	Long d1 = Long.parseLong(obj1.toString());
    	Long d2 = Long.parseLong(obj2.toString());
        if(d1.compareTo(d2) == 0){
            if(twoOrder != null && twoType != null){
                //相等就使用第二字段排序
                return commonOrder(twoOrder, twoType, obj11, obj21, null, null);
            }
            //相同的是否进行交互
            return 0;
        }
        return d1.compareTo(d2) * oType;
    }

    /**
     * 浮点型比较大小
     * @param oType
     * @param obj1
     * @param obj2
     * @return
     */
    private static int doubleCompare(final Integer oType, Object obj1, Object obj2, Object obj11, Object obj21, String twoOrder, Integer twoType) {
    	Double d1 = Double.parseDouble(obj1.toString());
    	Double d2 = Double.parseDouble(obj2.toString());
        if(d1.compareTo(d2) == 0){
            if(twoOrder != null && twoType != null){
                //相等就使用第二字段排序
                return commonOrder(twoOrder, twoType, obj11, obj21, null, null);
            }
            return 0;
        }
        return d1.compareTo(d2) * oType;
    }
}
