package com.coffee.model.repository;

import com.coffee.model.Transaction;
import com.coffee.model.User;
import com.coffee.model.config.PersistenceConfig;
import com.coffee.types.RoleType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
@ContextConfiguration(classes = {PersistenceConfig.class})
public class TransactionRepositoryTest {
    
    @Autowired
    TransactionRepository transactionRepository;
    
    @Autowired
    UserRepository userRepository;

    Transaction transaction;
    
    User user;
    
    @Before
    public void setUp(){
        user = new User();
        user.setUserName("janedoe");
        user.setFirstName("Jane");
        user.setLastName("Doe");
        user.setRole(RoleType.CUSTOMER);
        user.setActive(true);
        
        transaction = new Transaction();
        transaction.setTimeStamp(LocalDateTime.now());
        transaction.setPrice(new BigDecimal(100));
        transaction.setUser(user);
    }
    
    @Test
    public void save(){
        userRepository.save(user);
        transactionRepository.save(transaction);
    }
    
    @Test
    public void findById(){
        
    }
}
