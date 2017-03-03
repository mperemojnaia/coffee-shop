package com.coffee.model.mongo.repository;

import com.coffee.model.mongo.document.TransactionDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<TransactionDocument, Long> {
}
