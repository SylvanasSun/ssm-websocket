package com.sylvanas.websocket.test;

import org.apache.commons.codec.binary.Hex;
import org.junit.Test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by SylvanasSun on 2017/2/19.
 */
public class CommonTest {

    @Test
    public void test01() throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update("123456".getBytes());
        System.out.println(Hex.encodeHexString(md5.digest()));
    }

}
