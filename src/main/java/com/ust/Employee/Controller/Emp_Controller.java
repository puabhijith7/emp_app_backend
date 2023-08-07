package com.ust.Employee.Controller;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.Employee.Model.Employee;
import com.ust.Employee.Service.Emp_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/emp")
public class Emp_Controller  {
    @Autowired
    private Emp_Service empService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getall() {
        return empService.getall();
    }





    @GetMapping("/{id}")
    public ResponseEntity<Employee> getone(@PathVariable Integer id)
    {
        return empService.getone(id);
    }
    @PostMapping("/add")
    public ResponseEntity<Employee> addemp(@RequestBody Employee e)
    {
        return empService.add(e);
    }
    @PutMapping("/update")
    public ResponseEntity<Employee> add(@RequestBody Employee e)
    {
        return empService.update(e);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> delete(@PathVariable int id)
    {
        return empService.delete(id);
    }



    @GetMapping("/jsonall")
    public List<Employee> jsonall() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        //read JSON file and convert to a customer object
        Employee[] e = objectMapper.readValue(new File("Employee.json"), Employee[].class);
        //List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
        //print customer details
        List<Employee> e1=new ArrayList<>();
        for (Employee employee : e) {
            e1.add(employee);
        }
        return e1;
    }
}
