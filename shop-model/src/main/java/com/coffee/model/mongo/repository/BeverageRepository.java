package com.coffee.model.mongo.repository;

import com.coffee.model.mongo.document.BeverageDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeverageRepository extends MongoRepository<BeverageDocument, Long> {
}
