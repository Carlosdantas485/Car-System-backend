package com.dantas.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dantas.demo.entities.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}

