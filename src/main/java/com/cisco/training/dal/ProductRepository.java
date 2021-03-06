package com.cisco.training.dal;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.cisco.training.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}