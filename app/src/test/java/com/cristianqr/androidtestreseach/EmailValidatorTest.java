package com.cristianqr.androidtestreseach;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class EmailValidatorTest {
    @Test
    public void email_isValid() {
        assertTrue(EmailValidator.isValidEmail("cristianqr@outlook.com"));
    }
}
