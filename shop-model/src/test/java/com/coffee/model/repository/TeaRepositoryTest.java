package com.coffee.model.repository;

import com.coffee.model.Tea;
import com.coffee.types.Flavouring;
import com.coffee.types.SizeType;
import com.coffee.types.TeaType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@EnableAutoConfiguration
public class TeaRepositoryTest {

    @Autowired
    private TeaRepository teaRepository;
    
    @Before
    public void setUp(){
        insertTeaPurchases();
    }    
    
    @Test
    public void findAll(){
        
        assertNotNull(teaRepository.findAll());
        
        assertEquals(2, teaRepository.findAll().size());
    }

    private void insertTeaPurchases(){
        Tea tea1 = new Tea();
        tea1.setId(1L);
        tea1.setTeaType(TeaType.CHAMOMILE);
        tea1.setFlavour(Flavouring.CINNAMON);
        tea1.setSize(SizeType.MID);
        teaRepository.save(tea1);

        Tea tea2 = new Tea();
        tea2.setId(2L);
        tea2.setTeaType(TeaType.CHAMOMILE);
        tea2.setFlavour(Flavouring.LEMON);
        tea2.setSize(SizeType.BIG);
        teaRepository.save(tea2);
    }
}