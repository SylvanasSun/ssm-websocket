package com.sylvanas.websocket.test;

import org.junit.Test;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by SylvanasSun on 2017/2/19.
 */
public class CommonTest {

    @Test
    public void testMd5() throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("md5");
        md5.update("Hello,World!".getBytes());
        System.out.println(new BigInteger(1,md5.digest()).toString(16));
    }

}
