package com.coffee.model.repository;

import com.coffee.model.Beverage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeverageRepository extends MongoRepository<Beverage, Long> {
}
