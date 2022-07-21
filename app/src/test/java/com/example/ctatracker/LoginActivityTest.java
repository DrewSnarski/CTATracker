package com.example.ctatracker;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LoginActivityTest {

    @Test
    public void testIsEmailValid() {
        String testEmail = " asnarski1@hawk.iit.edu";
        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), Utils.checkEmailForValidity(testEmail), is(true));
    }
}