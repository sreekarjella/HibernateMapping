package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.entity.otm.EmployeeOTM;

@Repository
public interface EmployeeOTMRepository extends JpaRepository<EmployeeOTM, Integer>{

}
