package com.coffee.model.repository;

import com.coffee.model.Tea;
import com.coffee.types.TeaType;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TeaRepository extends MongoRepository<Tea, Long> {
    
    List<Tea> findByTeaType(TeaType teaType);
    
}
