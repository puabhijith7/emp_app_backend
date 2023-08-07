package com.ust.Employee.Repo;


import com.ust.Employee.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Emp_Repo extends JpaRepository<Employee,Integer> {

}
