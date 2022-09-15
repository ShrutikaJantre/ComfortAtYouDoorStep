package com.comfortatyourdoorstep.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.comfortatyourdoorstep.entities.CustomerSignup;

@Component
public interface CustomerRepository extends CrudRepository<CustomerSignup, Integer> {

}
