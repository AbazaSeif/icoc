/**  
* @Title: JsonUtil.java
* @Package com.icocpay.block.utils
* @Description: 
* @author  
* @version V1.0  
*/
package com.icocpay.block.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


/**
 * @ClassName: JsonUtil
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author icocpay@gmail.com
 *
 */
public class JsonUtil {
    public static String toJson(Object object){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
