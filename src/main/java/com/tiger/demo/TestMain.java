package com.tiger.demo;

import com.tiger.demo.domain.User;
import com.tiger.demo.serviceimpl.TestServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) throws Exception{

        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        thread.start();*/

       /* ApplicationContext aop = new ClassPathXmlApplicationContext("bean.xml");
        TestServiceImpl bean = aop.getBean(TestServiceImpl.class);
        Map map = new HashMap();
        map.put("name","able");
        map.put("age","26");
        map.put("sex","男");

        bean.getString1(map);
        bean.getString2();*/

       /*double a = 1;

       Double b = Double.valueOf(1);

       Double c = Double.valueOf(2);

       if (b>0){
           System.out.println(1);
       }*/

        /*System.out.println("---------start---------");
        Thread.sleep(1000*10);
        User user = new User();
        System.out.println(user.getUserName());

        System.out.println("---------end---------");*/

        /*User user1 = new User(1);
        User user2 = new User(1);
        User user3 = new User(1);
        User user4 = new User(1);
        User user5 = new User(1);
        User user6 = new User(2);
        *//*user.setUserName("zxl");
        user1.setUserName(user.getUserName());
//        String s1 = user.getUserName();
        user.setUserName("ml");
*//*
        System.out.println(user1.getUserName());


        List<User> pickList = new ArrayList<>();//真的
        List<User> pickList1 = new ArrayList<>();//要进行遍历的

        pickList1.add(user1);
        pickList1.add(user5);
        pickList1.add(user3);
        pickList1.add(user4);
        pickList1.add(user6);
        pickList1.add(user2);

        pickList.addAll(pickList1);
        //去重复
        for (int i = 0; i < pickList1.size() - 1; i++) {
            for (int j = pickList1.size() - 1; j > i; j--) {
                if (pickList1.get(j).getId().intValue() == pickList1.get(i).getId().intValue()) {
                    pickList1.remove(j);
                }
            }
        }
        System.out.println(pickList1.size());
        System.out.println(JSONArray.fromObject(pickList1).toString());
        Integer iii = 1;
        System.out.println(String.format("value is %d",iii));*/

       /* int a =1;
        String b = "1";
        User c = new User(1);

        test1(a);
        test2(b);
        test3(c);
        System.out.println(a);//1
        System.out.println(b);//12
        System.out.println(c.getId());//2*/

        System.out.println(new BigDecimal(15%5).floatValue());
        double a = 91;
        double b = 10;
        double c = a%b;
        System.out.println(c);

        /*List<User> packList = new ArrayList<>();
        packList.add(new User(1));
        packList.add(new User(2));
        packList.add(new User(3));
        User pack = packList
                .stream()
                .min((p, p2) -> (p.getId()-p2.getId()))
                .get();
        System.out.println(pack.toString());*/

        /*BigDecimal bg = BigDecimal.valueOf(a);
        BigDecimal om2 = BigDecimal.valueOf(b);
        BigDecimal remainder = bg.divideAndRemainder(om2)[1];//取余
        System.out.println(remainder);*/
        User user = new User(1);
        Integer id = user.getId();
//        User clone = user.clone();
        user.setId(2);
        System.out.println(id);//1
//        System.out.println(clone.toString());

        /*Double aDouble = Double.valueOf(2.10d);
        Double bDouble = Double.valueOf(2.1d);
        int i = aDouble.compareTo(bDouble);
        System.out.println(i);*/

        String aaa = "aAgg";

        System.out.println(aaa.toUpperCase());


    }

    private static void test3(User c) {
        c.setId(2);
    }


    private static void test2(String b) {
        b=b+"2";
    }

    private static void test1(int a) {
        a++;
    }
}
