package com.spample.webAndApi.assertions;


import org.testng.Assert;

public class TestNGAssertions  implements Assertions {
    @Override
    public void equals(String actual, String expected,String message) {
        Assert.assertEquals(actual,expected,message);
    }

    @Override
    public void equals(Boolean actual, Boolean expected,String message) {
        Assert.assertEquals(actual,expected,message);

    }

    @Override
    public void equals(Object actual, Object expected,String message) {
        Assert.assertEquals(actual,expected,message);
    }

    @Override
    public void notNull(Object actual,String message) {
        Assert.assertNotNull(actual,message);
    }
}
