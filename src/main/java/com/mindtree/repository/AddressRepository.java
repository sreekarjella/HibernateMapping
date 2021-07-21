package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.oto.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer>{
}
