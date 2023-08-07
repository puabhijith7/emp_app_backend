package com.ust.Employee.Service;

import com.ust.Employee.Model.Employee;
import com.ust.Employee.Repo.Emp_Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class Emp_Service {
    @Autowired
    private Emp_Repo empRepo;

    public ResponseEntity<List<Employee>> getall() {
        return ResponseEntity.ok().body(empRepo.findAll());
    }

    public ResponseEntity<Employee> getone(Integer id) {
        Optional<Employee> e=empRepo.findById(id);
        if(e.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(e.get());
        }
    }

    public ResponseEntity<Employee> add(Employee e) {

        empRepo.save(e);
        return ResponseEntity.ok().body(e);
    }

    public ResponseEntity<Employee> update(Employee e) {
        Optional<Employee> emp=empRepo.findById(e.getEmp_id());
        if(emp.isEmpty())
        {

            return ResponseEntity.notFound().build();
        }
        else {
            return ResponseEntity.ok().body(empRepo.save(e));
        }
    }

    public ResponseEntity<Employee> delete(int e) {
        Optional<Employee> emp=empRepo.findById(e);
        if(emp.isEmpty())
        {
            return ResponseEntity.notFound().build();
        }
        else {
            empRepo.deleteById(e);
            return ResponseEntity.ok().body(emp.get());
        }
    }
}
