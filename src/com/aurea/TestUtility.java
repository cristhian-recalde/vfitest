package com.aurea;

import com.sun.org.apache.bcel.internal.classfile.Utility;

public class TestUtility extends Utility {

    public void test() {
        System.out.println(signatureToString("this is a test string", true));
    }

}
