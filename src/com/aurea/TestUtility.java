package com.aurea;

// test for auto
// checking

import com.sun.org.apache.bcel.internal.classfile.Utility;

public class TestUtility extends Utility {

    public void test(int b) {
        System.out.println(signatureToString("this is a test string", true));

        int m = (int) Math.pow(b, 2) / 2 + 7;
        switch (b) {
            case 0:
            case 1:
                System.out.println("Invalid");
                return;

            case 2:
                switch (m) {
                    case 9:
                        System.out.println("nince");
                        return;
                    case 10:
                        System.out.println("TEN!");
                        break;
                    default:
                        System.out.println("really weird number");
                        break;
                }
                break;
            case 3:
                System.out.println("Nothing to do");
                break;
        }
    }

}
