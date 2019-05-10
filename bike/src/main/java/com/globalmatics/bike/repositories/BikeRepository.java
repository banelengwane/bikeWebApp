package com.globalmatics.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globalmatics.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
