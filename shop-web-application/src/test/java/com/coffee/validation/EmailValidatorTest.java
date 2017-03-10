package com.coffee.validation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mperemojnaia on 3/10/2017.
 */
public class EmailValidatorTest {

    public static final String VALID_EMAIL = "janedoe@mail.com";
    public static final String INVALID_EMAIL = "janedoemail.com";

    EmailValidator emailValidator;
    
    @Before
    public void setup(){
        emailValidator = new EmailValidator();
    }
    
    @Test
    public void isValid() throws Exception {
        assertTrue(emailValidator.isValid(VALID_EMAIL, null));

    }

    @Test
    public void isNotValid() throws Exception {
        assertFalse(emailValidator.isValid(INVALID_EMAIL, null));

    }
}