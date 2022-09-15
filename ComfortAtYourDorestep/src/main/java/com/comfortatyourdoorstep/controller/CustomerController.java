package com.comfortatyourdoorstep.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comfortatyourdoorstep.dao.CustomerDao;
import com.comfortatyourdoorstep.entities.Admin;
import com.comfortatyourdoorstep.entities.CustomerSignup;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class CustomerController {
	
	@Autowired
	private CustomerDao CustomerDao ;
	
	@GetMapping("/customers")
    public ResponseEntity<List<CustomerSignup>> getCustomerDetails() {

        List<CustomerSignup> list = CustomerDao.getAllCustomers();
        if (list.size() <= 0) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }

}
