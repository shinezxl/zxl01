package com.tiger.demo.learn.crawlers;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.HttpClientUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class TestMain {
    public static void main(String[] args) {
        //1.生成httpclient，相当于该打开一个浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        //2.创建get请求，相当于在浏览器地址栏输入 网址
        HttpGet request = new HttpGet("https://mp.weixin.qq.com/mp/profile_ext?action=home&__biz=MzU4MTgzMDcyOA==&scene=123&uin=MTYyODMxMTAwMQ%3D%3D&key=2dfd68df0f968e759c3b8e3c098bb1d6b5ed6777b017671f56b90f1ca5ed33c90c53913a3cfa967141a0b9693b2fd020c9a37ab928f5d99ff785772cc410b26bb144b9bc3040554e55dce2a2092090ef&devicetype=Windows+10&version=62060833&lang=zh_CN&a8scene=1&pass_ticket=McbhnJ78a%2BRax%2BJQyPZswydxD7waE7Ay4G0sA7iKcvO1ml6NgZxojdAYUMTyKkE9");
        request.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.36");
        try {
            //3.执行get请求，相当于在输入地址栏后敲回车键
            response = httpClient.execute(request);

            //4.判断响应状态为200，进行处理
            if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //5.获取响应内容
                HttpEntity httpEntity = response.getEntity();
                String html = EntityUtils.toString(httpEntity, "utf-8");
                System.out.println(html);





                /**
                 * 下面是Jsoup展现自我的平台
                 */
                //6.Jsoup解析html
                Document document = Jsoup.parse(html);
                //像js一样，通过标签获取title
                //像js一样，通过id 获取文章列表元素对象
                Element postList = document.getElementById("js_history_list");
                //像js一样，通过class 获取列表下的所有博客
                Elements postItems = postList.getElementsByClass("post_item");
                //循环处理每篇博客
                for (Element postItem : postItems) {
                    //像jquery选择器一样，获取文章标题元素
                    Elements titleEle = postItem.select(".post_item_body a[class='titlelnk']");
                    System.out.println("文章标题:" + titleEle.text());;
                    System.out.println("文章地址:" + titleEle.attr("href"));
                    //像jquery选择器一样，获取文章作者元素
                    Elements footEle = postItem.select(".post_item_foot a[class='lightblue']");
                    System.out.println("文章作者:" + footEle.text());;
                    System.out.println("作者主页:" + footEle.attr("href"));
                    System.out.println("*********************************");
                }
            } else {
                //如果返回状态不是200，比如404（页面不存在）等，根据情况做处理，这里略
                System.out.println("返回状态不是200");
                System.out.println(EntityUtils.toString(response.getEntity(), "utf-8"));
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭
            HttpClientUtils.closeQuietly(response);
            HttpClientUtils.closeQuietly(httpClient);
        }
    }


}
