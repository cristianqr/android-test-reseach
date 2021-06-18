package com.cristianqr.androidtestreseach;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
public class EmailValidatorTest {
    @Test
    public void emailShouldHaveCorrectFormat() {
        assertTrue(EmailValidator.isValidEmail("cristianqr@outlookcom"));
    }

    @Test
    public void emailShouldHaveInvalidFormat() {
        assertFalse(EmailValidator.isValidEmail("cristianqr@outlook"));
    }
}
