package com.tiger.demo.learn.unit;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 常用的工具类
 * https://mp.weixin.qq.com/s?__biz=MzI4NDY5Mjc1Mg==&mid=2247491790&idx=2&sn=d192b71f9629d335b038373a16baeee2&chksm=ebf538b1dc82b1a77a9fef91546f8c8bee9199f6917f7499be52db62a41b58bb4e4e7fdc48fc&mpshare=1&scene=1&srcid=&sharer_sharetime=1589355750034&sharer_shareid=33090e042ece1f5ca7cf0b12bb80110c&key=234ddfccebaed6d38b22ece6171c12c85806c30a6e5a2d12f0c9ee2c2e91e4faf7aae5461fac8bf06c176302cfd2c38de34951130f9e838c3ed74384dd912520b27b31a7ec3886e11ba96added605d87&ascene=1&uin=MTYyODMxMTAwMQ%3D%3D&devicetype=Windows+10&version=62060833&lang=zh_CN&exportkey=AeG4E7KBGFGej1GO2yTnsis%3D&pass_ticket=Ht2CU%2BgNoboDpoMzKJuDCKz7FejpUpBAQ7JZJsb0%2FcK483DAXAldIp3aIjBkjJ2A
 */
public class CommonUtils {

    public static void main(String[] args) {


        test1();

    }



    private static void test1(){

        //字符串固定长度
        String testStr = "z";
        String z = StringUtils.leftPad(testStr, 3, "1");
        System.out.println(z);//11z

        //字符串拼接
        String [] testArray ={"a", "b", "c"};
        String join = StringUtils.join(testArray, ",");
        System.out.println(join);//a,b,c

        Map testMap = null;
//        Map testMap = new HashMap<>();
//        testMap.put("NB","zxl");
        if (MapUtils.isEmpty(testMap)) {
            System.out.println("testMap is empty");
        }else {
            System.out.println("testMap is not empty");
        }

        List<Integer> inList = new ArrayList<>();
//        inList.add(1);
        if (CollectionUtils.isNotEmpty(inList)){
            System.out.println(111111);
        }


        Integer zxl1 = 9999;
        int zxl2 = 9999;
        if (zxl1.equals(zxl2)){
            System.out.println(23333);
        }


    }

}
