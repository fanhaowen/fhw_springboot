package com.example.fhw_springboot.Service;



import java.util.*;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gcy
 * @Date: 2021/11/18/9:35
 * @Description:
 */
public class  test {
    public static void main(String[] args) {

        Sign sign = SecureUtil.sign(SignAlgorithm.SHA256withRSA);
        String url = "321";
        byte[] signed = sign.sign(url);
        boolean verify = sign.verify(url.getBytes(), signed);
        System.out.println(verify);
    }


    public static JSONObject sendPost(String url,JSONObject param){
        //定义接收数据
        JSONObject result = new JSONObject();
        HttpPost httpPost = new HttpPost(url);
        CloseableHttpClient client = HttpClients.createDefault();
        //请求参数转JOSN字符串
        StringEntity entity = new StringEntity(param.toJSONString(), "UTF-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);

        try {
            HttpResponse response = client.execute(httpPost);
            if (response.getStatusLine().getStatusCode() == 200) {
                result = JSON.parseObject(EntityUtils.toString(response.getEntity(), "UTF-8"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            result.put("error", "连接错误！");
        }
        return result;
    }


}
