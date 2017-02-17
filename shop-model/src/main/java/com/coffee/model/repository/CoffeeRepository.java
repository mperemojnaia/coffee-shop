package com.coffee.model.repository;

import com.coffee.model.Coffee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoffeeRepository extends MongoRepository<Coffee, Long> {
}
