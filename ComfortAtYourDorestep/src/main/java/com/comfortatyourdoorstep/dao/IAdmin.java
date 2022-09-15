package com.comfortatyourdoorstep.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.comfortatyourdoorstep.entities.Admin;

@Component
public interface IAdmin extends CrudRepository<Admin, Integer> {

	public Admin save(Admin admin);

	//public List<Admin> getAllAdmin();
	

}
