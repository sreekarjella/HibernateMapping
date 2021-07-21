package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.mtm.AddressMTM;

@Repository
public interface AddressMTMRepository extends JpaRepository<AddressMTM, Integer> {

}
