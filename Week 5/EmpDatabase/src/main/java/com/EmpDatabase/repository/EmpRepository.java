package com.EmpDatabase.repository;

import com.EmpDatabase.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpRepository extends JpaRepository<Employee,Integer> {


    List<Employee> findAllByName(String name);


}
