package com.aurea;

/**
 * checking for this
 */

public class OtherClass {

    private A a = new A();

    public void call() {
        new Classes().c(a);
    }

    public void otherCall() {
        Classes c = new Classes();

        c.e();
    }
}
