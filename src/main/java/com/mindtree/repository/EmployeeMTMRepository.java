package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.mtm.EmployeeMTM;

@Repository
public interface EmployeeMTMRepository extends JpaRepository<EmployeeMTM, Integer> {

}
