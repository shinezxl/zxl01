package com.tiger.demo.util;

/*import org.apache.commons.codec.binary.Hex;
import org.springframework.security.crypto.encrypt.BouncyCastleAesCbcBytesEncryptor;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.Key;
import java.security.Security;*/


import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;

import org.apache.commons.codec.binary.Hex;

public class TestDes {
    //定义一个要加密的字符串
    private static final String password = "gfscold";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        bcDES();
    }

    //JDK的实现
    public static void jdkDES() {
        try {
            //1.生成KEY
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");//Key的生成器
            keyGenerator.init(56);//指定keySize
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] bytesKey = secretKey.getEncoded();

            //2.KEY转换
            DESKeySpec desKeySpec = new DESKeySpec(bytesKey);//实例化DESKey秘钥的相关内容
            SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");//实例一个秘钥工厂，指定加密方式
            Key convertSecretKey = factory.generateSecret(desKeySpec);


            //3.加密    DES/ECB/PKCS5Padding--->算法/工作方式/填充方式
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");//通过Cipher这个类进行加解密相关操作
            cipher.init(Cipher.ENCRYPT_MODE, convertSecretKey);


            String aaa = "$10$wGEmWAQe3ATTAzOQdW7Tl.Ujrtq54/gM29oSHCKRmZ0768LC91t6.";
            byte[] result = cipher.doFinal(aaa.getBytes());//输入要加密的内容
            System.out.println("加密的结果：" + Hex.encodeHexString(result));

            //4.解密
            cipher.init(Cipher.DECRYPT_MODE, convertSecretKey);
            result = cipher.doFinal(result);
            System.out.println("解密结果：" + new String(result));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //BC的实现
    public static void bcDES() {
        try {
//            Security.addProvider(new BouncyCastleProvider());


            //1.生成KEY
            KeyGenerator keyGenerator = KeyGenerator.getInstance("DES","BC");
            keyGenerator.init(56);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] bytesKey = secretKey.getEncoded();

            //2.转换KEY
            DESKeySpec desKeySpec = new DESKeySpec(bytesKey);
            SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
            Key convertKey = factory.generateSecret(desKeySpec);

            //3.加密
            Cipher cipher = Cipher.getInstance("/DES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, convertKey);
            byte[] result = cipher.doFinal(password.getBytes());
            System.out.println(Hex.encodeHexString(result));

            //4.解密
            cipher.init(Cipher.DECRYPT_MODE,convertKey);
            result = cipher.doFinal(result);
            System.out.println(new String(result));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}

