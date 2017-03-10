package com.coffee.validation;

import com.coffee.dto.UserDto;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by mperemojnaia on 3/10/2017.
 */
public class PasswordMatchesValidatorTest {
    
    UserDto user;
    
    PasswordMatchesValidator validator;
    
    @Before
    public void setup(){
        validator = new PasswordMatchesValidator();
        
        user = new UserDto();
        user.setEmail("janedoe@mail.com");
        user.setFirstName("Jane");
        user.setLastName("Doe");
        user.setPassword("12345");
    }
    
    @Test
    public void passwordMatches(){
        user.setMatchingPassword("12345");
        
        assertTrue(validator.isValid(user, null));
    }

    @Test
    public void passwordDoesntMatch(){
        user.setMatchingPassword("1234");

        assertFalse(validator.isValid(user, null));
    }

}