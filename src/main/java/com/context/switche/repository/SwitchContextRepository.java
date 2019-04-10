package com.context.switche.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.context.switche.domain.SwitchContext;

public interface  SwitchContextRepository extends MongoRepository<SwitchContext, String> {

    public Optional<SwitchContext> findById(String firstName);

}