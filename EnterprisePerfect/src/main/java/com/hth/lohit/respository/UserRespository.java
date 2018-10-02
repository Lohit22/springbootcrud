package com.hth.lohit.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hth.lohit.model.client;


@Repository
public interface UserRespository extends JpaRepository<client, String>{

}
