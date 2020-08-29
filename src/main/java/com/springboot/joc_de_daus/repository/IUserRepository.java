package com.springboot.joc_de_daus.repository;

import com.springboot.joc_de_daus.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
    @Override
    List<User> findAll();
}
