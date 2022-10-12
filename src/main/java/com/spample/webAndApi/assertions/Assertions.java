package com.spample.webAndApi.assertions;

public interface Assertions {

    void equals(String actual, String expected,String message);
    void equals(Boolean actual, Boolean expected,String message);
    void equals(Object actual, Object expected,String message);
    void notNull(Object actual,String message);
}
