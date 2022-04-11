package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.RolModel;

@Repository
public interface RolRepository extends CrudRepository<RolModel, Long> {

}
