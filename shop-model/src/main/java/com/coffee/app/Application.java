package com.coffee.app;

import com.coffee.model.Tea;
import com.coffee.model.repository.TeaRepository;
import com.coffee.types.Flavouring;
import com.coffee.types.SizeType;
import com.coffee.types.TeaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@EnableAutoConfiguration
@SpringBootApplication
public class Application implements CommandLineRunner{

    @Autowired
    TeaRepository teaRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    
    public void run(String... args) throws Exception {
        insertTeaPurchases();
        List<Tea> teaList = teaRepository.findAll();
        teaList.forEach(teaType -> System.out.println(teaType));
        
    }

    private void insertTeaPurchases(){
        Tea tea;
        tea = new Tea();
        tea.setId(1L);
        tea.setTeaType(TeaType.CHAMOMILE);
        tea.setFlavour(Flavouring.CINNAMON);
        tea.setSize(SizeType.MID);
        teaRepository.save(tea);
    }
}

