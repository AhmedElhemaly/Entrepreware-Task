package com.hemaly.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hemaly.demo.model.Numbers;

public interface NumberRepository extends JpaRepository<Numbers, Integer>{

}
