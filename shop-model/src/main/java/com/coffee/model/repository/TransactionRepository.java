package com.coffee.model.repository;

import com.coffee.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, String> {
    
    Transaction findById(String id);
}
