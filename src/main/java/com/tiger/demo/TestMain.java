package com.tiger.demo;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.qimen.api.request.EntryorderCreateRequest;
import com.tiger.demo.domain.BigObject;
import com.tiger.demo.domain.SmallObject;
import com.tiger.demo.domain.User;
import com.tiger.demo.learn.express.A;
import com.tiger.demo.learn.express.B;
import com.tiger.demo.learn.express.C;
import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.session.mgt.eis.RandomSessionIdGenerator;
import org.springframework.beans.BeanUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.util.Base64Utils;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Pattern;

public class TestMain {
    public static final String AREA_TYPE_LK1 = "LK1";
    public static final String AREA_TYPE_LK2 = "LK2";
    public static final String AREA_TYPE_LK3 = "LK3";
    public static final String AREA_TYPE_CW1 = "CW1";

    public static final ExecutorService es = Executors.newFixedThreadPool(6);

    public static final ThreadLocal<User> threadLocal = new ThreadLocal<>();

    public static final Map<String,String> wcsAreaTypeMap = new HashMap();
    static {
        wcsAreaTypeMap.put(AREA_TYPE_LK1,"1-");
        wcsAreaTypeMap.put(AREA_TYPE_LK2,"2-");
        wcsAreaTypeMap.put(AREA_TYPE_LK3,"3-");
        wcsAreaTypeMap.put(AREA_TYPE_CW1,"4-");

    }
    public static String testConstant = testConstant();
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

       /* System.out.println(new BigDecimal(15%5).floatValue());
        double a = 91;
        double b = 10;
        double c = a%b;
        System.out.println(c);*/

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

        String zxl = new String("zxl");
        System.out.println(zxl);
        System.out.println(aaa.toUpperCase());


        String a1 ="Able";
        String s = firstWorldToUp(a1);
        System.out.println(s);

        String test1 = "第一次";
        String test2 = "第二次";
        String test3 = "测试stash";


        /*String ff="ff";

        int a = 10;
        int b = 3;
        int c = a / b ;
        System.out.println(c);//3
        double d =  Math.ceil(a / b);
        System.out.println(d);*/


       /* InventoryEntity inventoryEntity = new InventoryEntity();

        inventoryEntity.setWarehouseAreaCode("111111");
        buildLimitInventory(inventoryEntity);
        System.out.println(inventoryEntity.toString());*/

        /*List<User> users = new ArrayList<>();
        User user1 = new User(1);
        users.add(user1);
        for (User user2 : users) {
            user2 = new User(2);
        }

        System.out.println(users.get(0).getId());//1*/

        /*if (Constant.testMap == Constant.testMap){
            System.out.println(23333);
        }

        long ittest =(long) 60 * 60 * 24 * 7;
        System.out.println(ittest);

        String testNUll = null;
        System.out.println(testNUll.trim());*/


        /*String dataBaseStr = "a_b_c";

        String s1 = UnderlineToHump(dataBaseStr);

        System.out.println(s1);*/

        String now1 = "2018-01-02";
        String now2 = "2019-01-01";
        /*if (now1.compareTo( now2 ) >= 0 ){
            System.out.println("fjsaldfjsald");
        }

        Set<String> expireProductCode = new HashSet<>();
        expireProductCode.add("1fjalsfjda");
        expireProductCode.add("2fjalsfjda");

        String msg = String.format("过期库存无法分配！产品码：%s，若要分配过期库存，请指定过期日期！",expireProductCode.toString());
        System.out.println(msg);*/


       /* Integer a = null ;
        Integer b = 1 ;
        if (a == b){

            System.out.println(111);

        }

        if (a != b){

            System.out.println(222);

        }*/
        /*System.out.println("start");
        LinkedList<Integer> returnList = new LinkedList<>();
        for (int i = 1; i < 21; i++) {
            returnList.add(i);
        }
        Integer pageSize = 21;
        int size = returnList.size();
        if (null != pageSize && size > pageSize.intValue()){
            for (int i = size; i >= 0 ; i--) {
                if (i == pageSize){
                    break;
                }
                returnList.remove(i-1);
            }
        }
        System.out.println("end");*/

        /*Integer a =200;
        int b =2;
        Integer c = Integer.valueOf(200);
        Integer d = new Integer(2);
        Integer e =2;
        System.out.println(a == b);//true
        System.out.println(a == c);//true
        System.out.println(c == d);//false
        System.out.println(b == d);//true
        System.out.println(a == d);//false
        System.out.println(a == e);//true
        System.out.println(c == e);//true*/

        /*BigObject bigObject = new BigObject();
        bigObject.setA("a");
        bigObject.setB("b");
        bigObject.setC("c");
        bigObject.setD("d");

        Field a = bigObject.getClass().getDeclaredField("a");
        a.setAccessible(true);
        Object o = a.get(bigObject);

        SmallObject smallObject = new SmallObject();
        smallObject.setA("sa");
        smallObject.setB("sb");
        smallObject.setC("sc");

        *//*String s1 = JSON.toJSONString(smallObject);
        JSON.parseObject(s1, SmallObject.class);*//*


        BeanUtils.copyProperties(smallObject,bigObject);
        System.out.println(bigObject.toString());

        String nacos = new BCryptPasswordEncoder().encode("gfs123456");
        System.out.println(nacos);

        String encode = new BCryptPasswordEncoder().encode("gfs123456");
        System.out.println(encode);*/



        /*for (int i = 0; i < 3; i++) {
            System.out.println(1111);
            String a111 = testConstant;

        }*/
       /* Class childClass = getRedisKeysClass();
        System.out.println(111);*/


        /*String test233= "1-";
        if ("01-333".startsWith(test233)){
            System.out.println("zxl1111");
        }

        Set<String> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            String orderId = getOrderId();
            set.add(orderId);
            System.out.println(orderId);
        }

        System.out.println(set.size());


        *//*Map<String,List<Object>> wcsMap = new HashMap<>();
        for (String lpnCode : wcsMap.keySet()) {
            List<Object> wcsModelVos = wcsMap.get(lpnCode);
        }

        String.format("确认上架开始!托盘码：%s，操作人：%s","sss","fff");*//*
        if (!wcsAreaTypeMap.containsValue("5-")){
            System.out.println("hahahahahahahahahahaha");
        }*/

       /* String productNumber = "1-2019";
        String warehouseAreaPrefix = "";
        for (String key : wcsAreaTypeMap.keySet()) {
            if (wcsAreaTypeMap.get(key).equals(productNumber.substring(0,2))){
                warehouseAreaPrefix = key;
            }
        }
        System.out.println(warehouseAreaPrefix);


        String aa = "¬í\u0005sr\u001Bcom.gfscold.gfsmq.dto.Order Á§áÊù\u0082\u009D\u0002\u0005L\u0007aDoublet\u0012Ljava/lang/Double;L\u0003aget\u0013Ljava/lang/Integer;L\u0002idt\u0012Ljava/lang/String;L\u0006objectt\u0012Ljava/lang/Object;L\u000BorderNumberq~\u0003xppppsq~pppsq~pppsq~sr\u0010java.lang.Double\u0080³ÂJ)kû\u0004\u0002\u0001D\u0005valuexr\u0010java.lang.Number\u0086¬\u0095\u001D\u000B\u0094à\u008B\u0002xp@6sr\u0011java.lang.Integer\u0012â ¤÷\u0081\u00878\u0002\u0001I\u0005valuexq~\n" +
                "\u0003t\u0002idpt\u0013orderNumber*&^$%#$@ppp";
//        byte[] decode = Base64Utils.decodeFromString(aa);
        Object deserialize = SerializationUtils.deserialize(aa.getBytes());
        System.out.println(deserialize.toString());*/
        String productNumber = "1-2019";

        String substring = productNumber.substring(1);
        System.out.println(substring);


        /*String paramCode=String.format("%s&password=%s","gift001","c02121b4-b6ea-4f5d-874d-0a2715b19d3c");
        char[] chars = paramCode.toCharArray();
        String paramCode1 ="";
        String paramCode2 ="";
        String paramCode3 ="";
        String paramCode4 ="";
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (i<20){
                paramCode1 = paramCode1 + String.valueOf(aChar);
            }else if (20 <= i && i < 40){
                paramCode2 = paramCode2 + String.valueOf(aChar);
            }else if (40 <= i && i < 60){
                paramCode3 = paramCode3 + String.valueOf(aChar);
            }else {
                paramCode4 = paramCode4 + String.valueOf(aChar);
            }

        }
        Map<String,String> paramMap =new HashMap<>();
        paramMap.put("paramCode1",paramCode1);
        paramMap.put("paramCode2",paramCode2);
        paramMap.put("paramCode3",paramCode3);
        paramMap.put("paramCode4",paramCode4);*/
        /*String templateParam = JSON.toJSON(paramMap).toString();
        System.out.println(templateParam);

        String cdKey = "W001451";
        String cdKey2 = "W001451";

        if (cdKey.startsWith("W")){
            String cdKey1 = cdKey.substring(1);
            int number = Integer.valueOf(cdKey1).intValue();
            if (number >= 2 && number <= 1451 ){
                System.out.println("普洛斯");
            }
        }

        System.out.println("W001452".compareTo(cdKey2));

        System.out.println("0010".compareTo(cdKey2));

        String slfPickupFlag = "N";

        if (StringUtils.isNotEmpty(slfPickupFlag) && "N".equals(slfPickupFlag.trim())){
            System.out.println(1111111111);
        }


        Integer q1 = 2;
        Integer q2 = 1;
        if (q1.intValue() != q2){
            System.out.println(12408);
        }*/


        Pattern compile = Pattern.compile("^[0-9]+([.]{1}[0-9]+){0,1}$");
        boolean matches = compile.matcher("280").matches();
        System.out.println(matches);


        /*List<String> list1 = new ArrayList<>();
        list1.add("a");

        String [] list2 = new String[1];

        String[] strings = list1.toArray(list2);

        System.out.println(list2);


        int i = 1000+(-2147483648 % 10);
        System.out.println(i);*/

        /*Integer aaab = 1;

        BigDecimal rate = new BigDecimal(100);
        BigDecimal bigDecimal = new BigDecimal(aaab);
        BigDecimal result = bigDecimal.divide(rate,2,BigDecimal.ROUND_HALF_UP);
        System.out.println(result.doubleValue());


        List<Integer> pick01 = new ArrayList<>();
        List<Integer> pick02 = new ArrayList<>();
        List<Integer> pick03 = new ArrayList<>();

        pick02.add(1);
        pick02.add(2);
        pick03.add(3);*/

        /*int size1 = pick01.size();
        int size2 = pick02.size();
        int size3 = pick03.size();
        for (int i = 0; i < 2; i++) {
            Integer integer = pick02.get(i);
            System.out.println(integer);

            Integer integer1 = pick01.get(i);
            System.out.println(integer1);

        }*/

       /* Map<String,Integer> map = new LinkedHashMap<>();
        map.put("1",1);
        map.put("3",3);
        map.put("2",2);

        map.put("4",4);
        map.put("5",5);
        map.put("6",6);
        System.out.println(map.toString());*/


//        System.out.println(new BCryptPasswordEncoder().encode("gfsit1024"));



        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        testListName(list);
        System.out.println(list);



        /*int a2 = list.indexOf("a");
        int a3 = list.indexOf("b");
        int a4 = list.indexOf("c");
        int a5 = list.indexOf("d");
        int a6 = list.indexOf("e");
        int a7 = list.indexOf("f");
        System.out.println(1);

        A a2 = new A();
        a2.setA(1);
        a2.setB("b");
        List<A> l1 = new ArrayList<>();
        l1.add(a2);

        B b = new B();
        b.setA(11);
        b.setB("bb");
        List<B> l2 = new ArrayList<>();
        l2.add(b);

        C c = new C();
        c.setA(l1);
        c.setB(l2);


        A a3 = new A();
        a3.setA(1);
        a3.setB("b");
        List<A> ll1 = new ArrayList<>();
        ll1.add(a3);

        B bb = new B();
        bb.setA(11);
        bb.setB("bb");
        List<B> ll2 = new ArrayList<>();
        ll2.add(bb);

        C cc = new C();
        cc.setA(ll1);
        cc.setB(ll2);


        boolean equals = cc.equals(c);
        System.out.println(equals);


        double pow = 10000 * Math.pow(1.01, 365);//10757.23  20749.29
        System.out.println(pow);*/


        /*Integer orderTableNumberStart = 6;
        Integer orderTableNumberEnd = 11;
        // 必须在同一层
        int startCell = orderTableNumberStart / 7;
        int endCell = orderTableNumberEnd / 7;
        if (startCell != endCell){
            System.out.println(1111);
        }

        Double aDoublea = Double.valueOf(25);
        if (aDoublea == 0){
            System.out.println(111111111);
        }else {
            System.out.println(222222222);
        }*/

        /*long l = System.currentTimeMillis();
        System.out.println(l);
        //1588910365481
        //1588910393972
        //1588163389984
        long timeStamp = 1588163389984l;

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//这个是你要转成后的时间的格式
        String sd = sdf.format(new Date(timeStamp));
        System.out.println(sd);

        Date parse = sdf.parse("2020-05-05 16:55:40");
        long time = parse.getTime();
        System.out.println(time);*/

        /*Double zxl1 = Double.valueOf(1);

        Double zxl2 = Double.valueOf(1);

        if (zxl1 == zxl2){
            System.out.println("=====");
        }
        if (zxl1 < zxl2){
            System.out.println("<<<<<<");
        }
        if (zxl1 > zxl2){
            System.out.println(">>>>>>");
        }*/


        /*Future<Integer> future = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                int STATUS = 0;
                try {
                    System.out.println("zxlnb");
                } catch (Exception e) {
                    STATUS = 1;
                }
                return STATUS;
            }
        });*/

        /*User user1 = new User();
        user1.setId(1);
        user1.setUserName("zxl");
        threadLocal.set(user1);
        User user2 = threadLocal.get();
        System.out.println(user2);*/




//        String a2020 = "{\"createTime\":\"2020-06-20 16:14:33\",\"orderCount\":71,\"orderList\":[{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440213597\",\"orderDetailList\":[{\"orderDetailId\":407013,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":407014,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":407015,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101920,\"orderNumber\":\"ASBR2020062016124071\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440213667\",\"orderDetailList\":[{\"orderDetailId\":407010,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":407011,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":407012,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101919,\"orderNumber\":\"ASBR2020062016124070\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440213790\",\"orderDetailList\":[{\"orderDetailId\":407007,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":407008,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":407009,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101918,\"orderNumber\":\"ASBR2020062016124069\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440213806\",\"orderDetailList\":[{\"orderDetailId\":407004,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":407005,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":407006,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101917,\"orderNumber\":\"ASBR2020062016124068\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440214112\",\"orderDetailList\":[{\"orderDetailId\":407001,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":407002,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":407003,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101916,\"orderNumber\":\"ASBR2020062016124067\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440214537\",\"orderDetailList\":[{\"orderDetailId\":406998,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406999,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":407000,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101915,\"orderNumber\":\"ASBR2020062016124066\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440214582\",\"orderDetailList\":[{\"orderDetailId\":406995,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406996,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406997,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101914,\"orderNumber\":\"ASBR2020062016124065\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440214652\",\"orderDetailList\":[{\"orderDetailId\":406992,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406993,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406994,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101913,\"orderNumber\":\"ASBR2020062016124064\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440215287\",\"orderDetailList\":[{\"orderDetailId\":406989,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406990,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406991,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101912,\"orderNumber\":\"ASBR2020062016124063\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440215296\",\"orderDetailList\":[{\"orderDetailId\":406986,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406987,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406988,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101911,\"orderNumber\":\"ASBR2020062016124062\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440215499\",\"orderDetailList\":[{\"orderDetailId\":406983,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406984,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406985,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101910,\"orderNumber\":\"ASBR2020062016124061\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440215514\",\"orderDetailList\":[{\"orderDetailId\":406980,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406981,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406982,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101909,\"orderNumber\":\"ASBR2020062016124060\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440215639\",\"orderDetailList\":[{\"orderDetailId\":406977,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406978,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406979,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101908,\"orderNumber\":\"ASBR2020062016124059\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440215920\",\"orderDetailList\":[{\"orderDetailId\":406974,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406975,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406976,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101907,\"orderNumber\":\"ASBR2020062016124058\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440216102\",\"orderDetailList\":[{\"orderDetailId\":406971,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406972,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406973,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101906,\"orderNumber\":\"ASBR2020062016124057\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440216209\",\"orderDetailList\":[{\"orderDetailId\":406968,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406969,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406970,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101905,\"orderNumber\":\"ASBR2020062016124056\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440216272\",\"orderDetailList\":[{\"orderDetailId\":406965,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406966,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406967,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101904,\"orderNumber\":\"ASBR2020062016124055\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440216290\",\"orderDetailList\":[{\"orderDetailId\":406962,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406963,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406964,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101903,\"orderNumber\":\"ASBR2020062016124054\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440216590\",\"orderDetailList\":[{\"orderDetailId\":406959,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406960,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406961,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101902,\"orderNumber\":\"ASBR2020062016124053\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440216872\",\"orderDetailList\":[{\"orderDetailId\":406956,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406957,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406958,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101901,\"orderNumber\":\"ASBR2020062016124052\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440217064\",\"orderDetailList\":[{\"orderDetailId\":406953,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406954,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406955,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101900,\"orderNumber\":\"ASBR2020062016124051\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440217222\",\"orderDetailList\":[{\"orderDetailId\":406950,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406951,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406952,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101899,\"orderNumber\":\"ASBR2020062016124050\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440217647\",\"orderDetailList\":[{\"orderDetailId\":406947,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406948,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406949,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101898,\"orderNumber\":\"ASBR2020062016124049\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440217656\",\"orderDetailList\":[{\"orderDetailId\":406944,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406945,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406946,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101897,\"orderNumber\":\"ASBR2020062016124048\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440218022\",\"orderDetailList\":[{\"orderDetailId\":406941,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406942,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406943,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101896,\"orderNumber\":\"ASBR2020062016124047\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440218095\",\"orderDetailList\":[{\"orderDetailId\":406938,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406939,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406940,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101895,\"orderNumber\":\"ASBR2020062016124046\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440218129\",\"orderDetailList\":[{\"orderDetailId\":406935,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406936,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406937,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101894,\"orderNumber\":\"ASBR2020062016124045\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440218396\",\"orderDetailList\":[{\"orderDetailId\":406932,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406933,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406934,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101893,\"orderNumber\":\"ASBR2020062016124044\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440218544\",\"orderDetailList\":[{\"orderDetailId\":406929,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406930,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406931,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101892,\"orderNumber\":\"ASBR2020062016124043\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440218614\",\"orderDetailList\":[{\"orderDetailId\":406926,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406927,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406928,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101891,\"orderNumber\":\"ASBR2020062016124042\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440218862\",\"orderDetailList\":[{\"orderDetailId\":406923,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406924,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406925,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101890,\"orderNumber\":\"ASBR2020062016124041\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440219337\",\"orderDetailList\":[{\"orderDetailId\":406920,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406921,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406922,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101889,\"orderNumber\":\"ASBR2020062016124040\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440219382\",\"orderDetailList\":[{\"orderDetailId\":406917,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406918,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406919,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101888,\"orderNumber\":\"ASBR2020062016124039\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440219655\",\"orderDetailList\":[{\"orderDetailId\":406914,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406915,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406916,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101887,\"orderNumber\":\"ASBR2020062016124038\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440219812\",\"orderDetailList\":[{\"orderDetailId\":406911,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406912,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406913,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101886,\"orderNumber\":\"ASBR2020062016124037\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440219867\",\"orderDetailList\":[{\"orderDetailId\":406908,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406909,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406910,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101885,\"orderNumber\":\"ASBR2020062016124036\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440219885\",\"orderDetailList\":[{\"orderDetailId\":406905,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406906,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406907,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101884,\"orderNumber\":\"ASBR2020062016124035\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440220091\",\"orderDetailList\":[{\"orderDetailId\":406902,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406903,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406904,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101883,\"orderNumber\":\"ASBR2020062016124034\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440220161\",\"orderDetailList\":[{\"orderDetailId\":406899,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406900,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406901,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101882,\"orderNumber\":\"ASBR2020062016124033\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440220347\",\"orderDetailList\":[{\"orderDetailId\":406896,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406897,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406898,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101881,\"orderNumber\":\"ASBR2020062016124032\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440220470\",\"orderDetailList\":[{\"orderDetailId\":406893,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406894,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406895,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101880,\"orderNumber\":\"ASBR2020062016124031\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440220531\",\"orderDetailList\":[{\"orderDetailId\":406890,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406891,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406892,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101879,\"orderNumber\":\"ASBR2020062016124030\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440220595\",\"orderDetailList\":[{\"orderDetailId\":406887,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406888,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406889,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101878,\"orderNumber\":\"ASBR2020062016124029\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440220725\",\"orderDetailList\":[{\"orderDetailId\":406884,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406885,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406886,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101877,\"orderNumber\":\"ASBR2020062016124028\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221041\",\"orderDetailList\":[{\"orderDetailId\":406881,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406882,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406883,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101876,\"orderNumber\":\"ASBR2020062016124027\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221111\",\"orderDetailList\":[{\"orderDetailId\":406878,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406879,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406880,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101875,\"orderNumber\":\"ASBR2020062016124026\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221263\",\"orderDetailList\":[{\"orderDetailId\":406875,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406876,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406877,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101874,\"orderNumber\":\"ASBR2020062016124025\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221281\",\"orderDetailList\":[{\"orderDetailId\":406872,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406873,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406874,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101873,\"orderNumber\":\"ASBR2020062016124024\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221679\",\"orderDetailList\":[{\"orderDetailId\":406869,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406870,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406871,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101872,\"orderNumber\":\"ASBR2020062016124023\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221697\",\"orderDetailList\":[{\"orderDetailId\":406866,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406867,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406868,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101871,\"orderNumber\":\"ASBR2020062016124022\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221809\",\"orderDetailList\":[{\"orderDetailId\":406863,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406864,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406865,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101870,\"orderNumber\":\"ASBR2020062016124021\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221818\",\"orderDetailList\":[{\"orderDetailId\":406860,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406861,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406862,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101869,\"orderNumber\":\"ASBR2020062016124020\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440221845\",\"orderDetailList\":[{\"orderDetailId\":406857,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406858,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406859,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101868,\"orderNumber\":\"ASBR2020062016124019\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222133\",\"orderDetailList\":[{\"orderDetailId\":406854,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406855,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406856,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101867,\"orderNumber\":\"ASBR2020062016124018\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222285\",\"orderDetailList\":[{\"orderDetailId\":406851,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406852,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406853,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101866,\"orderNumber\":\"ASBR2020062016124017\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222364\",\"orderDetailList\":[{\"orderDetailId\":406848,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406849,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406850,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101865,\"orderNumber\":\"ASBR2020062016124016\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222406\",\"orderDetailList\":[{\"orderDetailId\":406845,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406846,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406847,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101864,\"orderNumber\":\"ASBR2020062016124015\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222460\",\"orderDetailList\":[{\"orderDetailId\":406842,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406843,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406844,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101863,\"orderNumber\":\"ASBR2020062016124014\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222682\",\"orderDetailList\":[{\"orderDetailId\":406839,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406840,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406841,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101862,\"orderNumber\":\"ASBR2020062016124013\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222788\",\"orderDetailList\":[{\"orderDetailId\":406836,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406837,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406838,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101861,\"orderNumber\":\"ASBR2020062016124012\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222821\",\"orderDetailList\":[{\"orderDetailId\":406833,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406834,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406835,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101860,\"orderNumber\":\"ASBR2020062016124011\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222946\",\"orderDetailList\":[{\"orderDetailId\":406830,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406831,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406832,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101859,\"orderNumber\":\"ASBR2020062016124010\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440222955\",\"orderDetailList\":[{\"orderDetailId\":406827,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406828,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406829,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101858,\"orderNumber\":\"ASBR202006201612409\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440223165\",\"orderDetailList\":[{\"orderDetailId\":406824,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406825,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406826,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101857,\"orderNumber\":\"ASBR202006201612408\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440223217\",\"orderDetailList\":[{\"orderDetailId\":406821,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406822,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406823,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101856,\"orderNumber\":\"ASBR202006201612407\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440223526\",\"orderDetailList\":[{\"orderDetailId\":406818,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406819,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406820,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101855,\"orderNumber\":\"ASBR202006201612406\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440223623\",\"orderDetailList\":[{\"orderDetailId\":406815,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406816,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406817,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101854,\"orderNumber\":\"ASBR202006201612405\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440223632\",\"orderDetailList\":[{\"orderDetailId\":406812,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406813,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406814,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101853,\"orderNumber\":\"ASBR202006201612404\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440223669\",\"orderDetailList\":[{\"orderDetailId\":406809,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406810,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406811,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101852,\"orderNumber\":\"ASBR202006201612403\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440223862\",\"orderDetailList\":[{\"orderDetailId\":406806,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406807,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406808,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101851,\"orderNumber\":\"ASBR202006201612402\",\"orderSequence\":0,\"orderStatus\":5},{\"boxSize\":\"C23\",\"consumableMaterialList\":[{\"boxFlag\":false,\"consumableMaterialCode\":\"2BWD\",\"consumableMaterialId\":21,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"二号保温袋\",\"consumableMaterialQuantity\":2.0,\"noteCode\":\"2BWD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"3KDD\",\"consumableMaterialId\":24,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"三号快递袋\",\"consumableMaterialQuantity\":1.0,\"noteCode\":\"3KDD\"},{\"boxFlag\":false,\"consumableMaterialCode\":\"GB250\",\"consumableMaterialId\":28,\"consumableMaterialLevel\":1,\"consumableMaterialName\":\"干冰250G\",\"consumableMaterialQuantity\":12.0,\"noteCode\":\"GB250\"}],\"expressNumber\":\"SF1025440224150\",\"orderDetailList\":[{\"orderDetailId\":406803,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067937698\",\"productCnName\":\"沃洛格达可可饼干筒奶油冰淇淋\",\"productNumber\":\"4607067937698\"},{\"orderDetailId\":406804,\"orderQuantity\":3.0,\"pickQuantity\":3.0,\"productBarCode\":\"4607067938091\",\"productCnName\":\"沃洛格达饼干可可奶油冰淇淋\",\"productNumber\":\"4607067938091\"},{\"orderDetailId\":406805,\"orderQuantity\":4.0,\"pickQuantity\":4.0,\"productBarCode\":\"4607067938114\",\"productCnName\":\"沃洛格达可可饼干奶油冰淇淋\",\"productNumber\":\"4607067938114\"}],\"orderId\":101850,\"orderNumber\":\"ASBR202006201612401\",\"orderSequence\":0,\"orderStatus\":5}],\"pallets\":[\"LPN0000002258\"],\"status\":12,\"waveCode\":\"WP202006200080\",\"waveStatusName\":\"拣货完成\"}";

//        System.out.println(a2020.length());

        String i = RandomStringUtils.randomNumeric(5);
        System.out.println(i);

        /*Set set = new HashSet();
        for (int j = 0; j < 1000; j++) {

            String uniqueCode = getUniqueCodeByUuidAndRandomNumber();
            set.add(uniqueCode);

        }
        System.out.println("set长度为："+set.size());*/

       /* Date currentDate = getCurrentDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(currentDate);
        System.out.println(format);*/

        String orderType = " ";
        String orderNumber = "zxl";
        String operator = "zxl";
        boolean anyBlank = StringUtils.isAnyBlank(orderType, orderNumber, operator);
        System.out.println(anyBlank);


       /* Double aDouble = Double.valueOf(1.01);
        Double bDouble = Double.valueOf(1.01);
        if (aDouble.compareTo(bDouble)!=0){
            System.out.println("STOP");
        }*/

//        getAreaTypeLk1();
        HashSet<String> strings = Sets.newHashSet("1", "2");
        System.out.println(strings);


    }


    public static void getAreaTypeLk1(){
        EntryorderCreateRequest req = new EntryorderCreateRequest();
        req.setCustomerId("stub-cust-code");
        req.setVersion("2.0");
        EntryorderCreateRequest.EntryOrder obj1 = new EntryorderCreateRequest.EntryOrder();
        obj1.setEntryOrderCode("E1234");
        obj1.setOwnerCode("O1234");
        obj1.setPurchaseOrderCode("C123455");
        obj1.setWarehouseCode("W1234");
        obj1.setOrderCreateTime("2016-09-09 12:00:00");
        obj1.setOrderType("SCRK");
//        EntryorderCreateRequest.RelatedOrder obj2 = new EntryorderCreateRequest.RelatedOrder();
//        obj2.setRemark("备注");
       /* obj2.setOrderType("CG");
        obj2.setOrderCode("G1234");*/
//        obj1.setRelatedOrders(obj2);
        obj1.setExpectStartTime("2015-09-09 12:00:00");
        obj1.setExpectEndTime("2015-09-09 12:00:00");
        obj1.setLogisticsCode("SF");
        obj1.setLogisticsName("顺丰");
        obj1.setExpressCode("Y1234");
        obj1.setSupplierCode("G1234");
        obj1.setSupplierName("GN1234");
        obj1.setOperatorCode("ON1234");
        obj1.setOperatorName("老王");
        obj1.setOperateTime("2017-09-09 12:00:00");
        EntryorderCreateRequest.SenderInfo obj3 = new EntryorderCreateRequest.SenderInfo();
        obj3.setFax("奇门仓储字段,说明,string(50),,");
        obj3.setBirthDate("奇门仓储字段,说明,string(50),,");
        obj3.setCareer("奇门仓储字段,说明,string(50),,");
        obj3.setNick("奇门仓储字段,说明,string(50),,");
        obj3.setIdType("奇门仓储字段,说明,string(50),,");
        obj3.setIdNumber("奇门仓储字段,说明,string(50),,");
        obj3.setCountryCodeCiq("奇门仓储字段,说明,string(50),,");
        obj3.setCountryCodeCus("奇门仓储字段,说明,string(50),,");
        obj3.setGender("奇门仓储字段,说明,string(50),,");
//        obj3.setRemark("备注");
        obj3.setCompany("淘宝");
        obj3.setName("老王");
        obj3.setZipCode("043300");
        obj3.setTel("81020340");
        obj3.setMobile("13214567869");
        obj3.setEmail("345@gmail.com");
        obj3.setCountryCode("051532");
        obj3.setProvince("浙江省");
        obj3.setCity("杭州");
        obj3.setArea("余杭");
        obj3.setTown("横加桥");
        obj3.setDetailAddress("杭州市余杭区989号");
        obj3.setId("temp");
        obj3.setCarNo("temp");
        obj1.setSenderInfo(obj3);
        EntryorderCreateRequest.ReceiverInfo obj4 = new EntryorderCreateRequest.ReceiverInfo();
        obj4.setFax("奇门仓储字段,说明,string(50),,");
        obj4.setBirthDate("奇门仓储字段,说明,string(50),,");
        obj4.setCareer("奇门仓储字段,说明,string(50),,");
        obj4.setNick("奇门仓储字段,说明,string(50),,");
        obj4.setCountryCodeCiq("奇门仓储字段,说明,string(50),,");
        obj4.setCountryCodeCus("奇门仓储字段,说明,string(50),,");
        obj4.setGender("奇门仓储字段,说明,string(50),,");
//        obj4.setRemark("备注");
        obj4.setCompany("淘宝");
        obj4.setName("老王");
        obj4.setZipCode("043300");
        obj4.setTel("808786543");
        obj4.setMobile("13423456785");
        obj4.setIdType("1");
        obj4.setIdNumber("12345");
        obj4.setEmail("878987654@qq.com");
        obj4.setCountryCode("045565");
        obj4.setProvince("浙江省");
        obj4.setCity("杭州");
        obj4.setArea("余杭");
        obj4.setTown("横加桥");
        obj4.setDetailAddress("杭州市余杭区989号");
        obj4.setId("temp");
        obj4.setCarNo("temp");
        obj1.setReceiverInfo(obj4);
        obj1.setRemark("备注信息");
        obj1.setContractCode("temp");
        obj1.setPlanArrivalTime("temp");
        obj1.setStatus("temp");
        obj1.setSizeDetail("temp");
        obj1.setIsCheck("temp");
        obj1.setIsNudePackage("temp");
        obj1.setOrderSource("temp");
        obj1.setExtOrderCode("temp");
        obj1.setConsignId("temp");
        obj1.setBusinessId("temp");
        obj1.setLogisticsContactName("temp");
        obj1.setLogisticsContactNo("temp");
        obj1.setLogisticsContactPhone("temp");
        obj1.setSupplierZipCode("temp");
        obj1.setSupplierTel("temp");
        obj1.setSupplierPhone("temp");
        obj1.setSupplierProvince("temp");
        obj1.setSupplierCity("temp");
        obj1.setSupplierArea("temp");
        obj1.setSupplierTown("temp");
        obj1.setSupplierAddress("temp");
        obj1.setSupplierEmail("temp");
        obj1.setOutBizCode("temp");
        obj1.setConfirmType("temp");
       /* obj1.setTotalOrderLines("12");
        obj1.setWarehouseName("E1234");
        obj1.setSourceWarehouseCode("E1234");
        obj1.setSourceWarehouseName("E1234");*/
        req.setEntryOrder(obj1);
        EntryorderCreateRequest.OrderLine obj5 = new EntryorderCreateRequest.OrderLine();
        obj5.setProductCode("奇门仓储字段,说明,string(50),,");
        obj5.setStockInQty("奇门仓储字段,说明,string(50),,");
        obj5.setStockOutQty("奇门仓储字段,说明,string(50),,");
        EntryorderCreateRequest.Batch obj6 = new EntryorderCreateRequest.Batch();
        obj6.setBatchCode("奇门仓储字段,说明,string(50),,");
        obj6.setProductDate("奇门仓储字段,说明,string(50),,");
        obj6.setExpireDate("奇门仓储字段,说明,string(50),,");
        obj6.setProduceCode("奇门仓储字段,说明,string(50),,");
        obj6.setInventoryType("奇门仓储字段,说明,string(50),,");
        obj6.setActualQty("奇门仓储字段,说明,string(50),,");
        obj6.setQuantity("奇门仓储字段,说明,string(50),,");
      /*  obj6.setRemark("备注");
        obj5.setBatchs(obj6);*/
        obj5.setTaobaoItemCode("奇门仓储字段,说明,string(50),,");
        obj5.setDiscountPrice("奇门仓储字段,说明,string(50),,");
        obj5.setColor("奇门仓储字段,说明,string(50),,");
        obj5.setSize("奇门仓储字段,说明,string(50),,");
        obj5.setStandardPrice("奇门仓储字段,说明,string(50),,");
        obj5.setReferencePrice("奇门仓储字段,说明,string(50),,");
        obj5.setDiscount("奇门仓储字段,说明,string(50),,");
        obj5.setStandardAmount("奇门仓储字段,说明,string(50),,");
        obj5.setSettlementAmount("奇门仓储字段,说明,string(50),,");
        obj5.setLocationCode("奇门仓储字段,说明,string(50),,");
        obj5.setAmount("奇门仓储字段,说明,string(50),,");
        obj5.setMoveOutLocation("奇门仓储字段,说明,string(50),,");
        obj5.setMoveInLocation("奇门仓储字段,说明,string(50),,");
        obj5.setExceptionQty("奇门仓储字段,说明,string(50),,");
//        obj5.setRemark("备注");
        obj5.setOutBizCode("O123");
        obj5.setOrderLineNo("EL123");
        obj5.setOwnerCode("O123");
        obj5.setItemCode("I123");
        obj5.setItemId("CI123");
        obj5.setItemName("IN123");
        obj5.setPlanQty(12L);
        obj5.setSkuProperty("属性");
        obj5.setPurchasePrice("12.0");
        obj5.setRetailPrice("12.0");
        obj5.setInventoryType("ZP");
        obj5.setProductDate("2017-09-09");
        obj5.setExpireDate("2017-09-09");
        obj5.setProduceCode("P1234");
        obj5.setBatchCode("PCODE123");
        obj5.setOrderSourceCode("temp");
        obj5.setSubSourceCode("temp");
        obj5.setActualQty("temp");
        obj5.setSourceOrderCode("temp");
        obj5.setSubSourceOrderCode("temp");
        obj5.setExtCode("temp");
        obj5.setActualPrice("temp");
        obj5.setDiscountAmount("temp");
        obj5.setQuantity("temp");
        obj5.setWarehouseCode("temp");
        obj5.setDeliveryOrderId("temp");
        obj5.setStatus("temp");
        obj5.setQrCode("temp");
        obj5.setPayNo("temp");
        obj5.setSubDeliveryOrderId("temp");
//        obj5.setUnit("个/盒/箱/柜等");
       /* SnList obj7 = new SnList();
        obj7.setSn("");
        obj5.setSnList(obj7);*/
        ArrayList<EntryorderCreateRequest.OrderLine> objects = Lists.newArrayList();
        objects.add(obj5);
        req.setOrderLines(objects);
        EntryorderCreateRequest.Item obj8 = new EntryorderCreateRequest.Item();
        List<EntryorderCreateRequest.Item> jjjj = new ArrayList();
        jjjj.add(obj8);
        obj8.setQuantity("奇门仓储字段,说明,string(50),,");
        obj8.setNormalQty("奇门仓储字段,说明,string(50),,");
        obj8.setDefectiveQty("奇门仓储字段,说明,string(50),,");
        obj8.setReceiveQty("奇门仓储字段,说明,string(50),,");
        obj8.setExCode("奇门仓储字段,说明,string(50),,");
        obj8.setDiscountPrice("奇门仓储字段,说明,string(50),,");
        obj8.setInventoryType("奇门仓储字段,说明,string(50),,");
        obj8.setPlanQty("奇门仓储字段,说明,string(50),,");
        obj8.setSourceOrderCode("奇门仓储字段,说明,string(50),,");
        obj8.setSubSourceOrderCode("奇门仓储字段,说明,string(50),,");
        obj8.setProduceCode("奇门仓储字段,说明,string(50),,");
        obj8.setOrderLineNo("奇门仓储字段,说明,string(50),,");
        obj8.setActualQty("奇门仓储字段,说明,string(50),,");
        obj8.setAmount("奇门仓储字段,说明,string(50),,");
        obj8.setUnit("奇门仓储字段,说明,string(50),,");
        obj8.setWarehouseCode("奇门仓储字段,说明,string(50),,");
        obj8.setLockQuantity("奇门仓储字段,说明,string(50),,");
        obj8.setOrderCode("奇门仓储字段,说明,string(50),,");
        obj8.setOrderType("奇门仓储字段,说明,string(50),,");
        obj8.setOutBizCode("奇门仓储字段,说明,string(50),,");
        obj8.setProductCode("奇门仓储字段,说明,string(50),,");
        obj8.setPaperQty("奇门仓储字段,说明,string(50),,");
        obj8.setDiffQuantity("奇门仓储字段,说明,string(50),,");
        obj8.setExtCode("奇门仓储字段,说明,string(50),,");
        obj8.setLackQty("奇门仓储字段,说明,string(50),,");
        obj8.setReason("奇门仓储字段,说明,string(50),,");
        obj8.setSnCode("奇门仓储字段,说明,string(50),,");
        /*Batch obj9 = new Batch();
        obj9.setBatchCode("奇门仓储字段,说明,string(50),,");
        obj9.setProductDate("奇门仓储字段,说明,string(50),,");
        obj9.setExpireDate("奇门仓储字段,说明,string(50),,");
        obj9.setProduceCode("奇门仓储字段,说明,string(50),,");
        obj9.setInventoryType("奇门仓储字段,说明,string(50),,");
        obj9.setActualQty("奇门仓储字段,说明,string(50),,");
        obj9.setQuantity("奇门仓储字段,说明,string(50),,");
        obj9.setRemark("备注");
        obj8.setBatchs(obj9);*/
        obj8.setGoodsCode("奇门仓储字段,说明,string(50),,");
        obj8.setStandardPrice("奇门仓储字段,说明,string(50),,");
        obj8.setReferencePrice("奇门仓储字段,说明,string(50),,");
        obj8.setDiscount("奇门仓储字段,说明,string(50),,");
        obj8.setActualAmount("奇门仓储字段,说明,string(50),,");
       /* PriceAdjustment obj10 = new PriceAdjustment();
        obj10.setType("奇门仓储字段,说明,string(50),,");
        obj10.setStandardPrice("奇门仓储字段,说明,string(50),,");
        obj10.setDiscount("奇门仓储字段,说明,string(50),,");
        obj10.setStartDate("奇门仓储字段,说明,string(50),,");
        obj10.setEndDate("奇门仓储字段,说明,string(50),,");
        obj10.setRemark("备注");*/
//        obj8.setPriceAdjustment(obj10);
        obj8.setLatestUpdateTime("奇门仓储字段,说明,string(50),,");
        obj8.setChangeTime("奇门仓储字段,说明,string(50),,");
        obj8.setTempRequirement("奇门仓储字段,说明,string(50),,");
        obj8.setChannelCode("奇门仓储字段,说明,string(50),,");
        obj8.setOriginCode("奇门仓储字段,说明,string(50),,");
//        obj8.setRemark("备注");
        obj8.setOwnerCode("temp");
        obj8.setTitle("temp");
        obj8.setItemCode("temp");
        obj8.setItemId("temp");
        obj8.setItemName("temp");
        obj8.setEnglishName("temp");
        obj8.setShortName("temp");
        obj8.setCategoryId("temp");
        obj8.setCategoryName("temp");
        obj8.setSkuProperty("temp");
        obj8.setItemType("temp");
        obj8.setTagPrice("temp");
        obj8.setRetailPrice("temp");
        obj8.setCostPrice("temp");
        obj8.setPurchasePrice("temp");
        obj8.setSupplierCode("temp");
        obj8.setSupplierName("temp");
        obj8.setSeasonCode("temp");
        obj8.setSeasonName("temp");
        obj8.setBrandCode("temp");
        obj8.setBrandName("temp");
        obj8.setSn("temp");
        obj8.setIsSNMgmt("temp");
        obj8.setBarCode("temp");
        obj8.setColor("temp");
        obj8.setSize("temp");
        obj8.setLength("temp");
        obj8.setWidth("temp");
        obj8.setHeight("temp");
        obj8.setVolume("temp");
        obj8.setGrossWeight("temp");
        obj8.setNetWeight("temp");
        obj8.setTareWeight("temp");
        obj8.setSafetyStock("temp");
        obj8.setStockUnit("temp");
        obj8.setStockStatus("temp");
        obj8.setProductDate("temp");
        obj8.setExpireDate("temp");
        obj8.setIsShelfLifeMgmt("temp");
        obj8.setShelfLife("temp");
        obj8.setRejectLifecycle("temp");
        obj8.setLockupLifecycle("temp");
        obj8.setAdventLifecycle("temp");
        obj8.setBatchCode("temp");
        obj8.setBatchRemark("temp");
        obj8.setIsBatchMgmt("temp");
        obj8.setPackCode("temp");
        obj8.setPcs("temp");
        obj8.setOriginAddress("temp");
        obj8.setApprovalNumber("temp");
        obj8.setIsFragile("temp");
        obj8.setIsHazardous("temp");
        obj8.setPricingCategory("temp");
        obj8.setIsSku("temp");
        obj8.setPackageMaterial("temp");
        obj8.setPrice("temp");
        obj8.setIsAreaSale("temp");

        req.setItems(jjjj);
        System.out.println("----------------------------------------");
        System.out.println(JSON.toJSONString(req));
    }

    public static String getUniqueCodeByUuidAndRandomNumber() {
        return UUID.randomUUID().toString() + RandomStringUtils.randomNumeric(5);
    }

    public static Date getCurrentDate() {
        Calendar c = new GregorianCalendar();
        return c.getTime();
    }

    private static void testListName(List<String> list) {

        list = null;
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

    private static String firstWorldToUp(String a) {
        byte[] bytes = a.getBytes();
        bytes[0]+=32;
        return new String(bytes);
    }

    public static Object buildLimitInventory(Object object) {
        try {
            Class<?> clazz = object.getClass();
            Field dateOfManufacture = clazz.getDeclaredField("dateOfManufacture");
            dateOfManufacture.setAccessible(true);
            dateOfManufacture.set(object, "lot1");
            Field dateOfExpiration = clazz.getDeclaredField("dateOfExpiration");
            dateOfExpiration.setAccessible(true);
            dateOfExpiration.set(object, "lot2");
            Field dateOfInWarehouse = clazz.getDeclaredField("dateOfInWarehouse");
            dateOfInWarehouse.setAccessible(true);
            dateOfInWarehouse.set(object, "lot3");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return object;
    }

    public static String UnderlineToHump(String para) {
        StringBuilder result = new StringBuilder();
        String a[] = para.split("_");
        for (String s : a) {
            if (!para.contains("_")) {
                result.append(s);
                continue;
            }
            if (result.length() == 0) {
                result.append(s.toLowerCase());
            } else {
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }


    public static String testConstant(){

        System.out.println("testConstant testConstant");
        return "testConstant";
    }

    private static Class getChildClass(Class clazz){
        ParameterizedType pt = (ParameterizedType) clazz.getGenericSuperclass();
        Class childClazz = (Class) pt.getActualTypeArguments()[0];
        return childClazz;
    }

    private static Class getRedisKeysClass(){
        WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
        Object redisKeys = wac.getBean("redisKeysConfig");

        if (null == redisKeys){
            throw new RuntimeException("请创建redisKeysConfig");
        }
        return redisKeys.getClass();
    }


    private static String getOrderId(){
        return String.valueOf(UUID.randomUUID());
    }


}
