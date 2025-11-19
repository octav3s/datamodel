package com.example.datamodel.Repository;

import org.springframework.data.repository.CrudRepository;
import com.example.datamodel.Models.product_model;

public interface ProductRepository extends CrudRepository<product_model,Integer> {

}