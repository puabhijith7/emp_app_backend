package com.ust.Employee;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ust.Employee.Model.Employee;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class EmployeeApplication /*implements CommandLineRunner*/ {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
//	@Override
//	public void run(String[] args) throws IOException {
//
//		//create ObjectMapper instance
//		ObjectMapper objectMapper = new ObjectMapper();
//
//		//read JSON file and convert to a customer object
//		Employee[] e = objectMapper.readValue(new File("Employee.json"), Employee[].class);
//		//List<Car> listCar = objectMapper.readValue(jsonCarArray, new TypeReference<List<Car>>(){});
//		//print customer details
//		for (Employee employee : e) {
//			System.out.println(employee.toString());
//		}

	//}

}
