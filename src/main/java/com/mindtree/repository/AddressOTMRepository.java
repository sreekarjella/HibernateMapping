package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.otm.AddressOTM;

@Repository
public interface AddressOTMRepository extends JpaRepository<AddressOTM, Integer> {

}
