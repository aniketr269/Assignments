package com.EmpDatabase.controller;

import com.EmpDatabase.domain.Employee;
import com.EmpDatabase.repository.EmpRepository;
import com.EmpDatabase.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    EmpRepository empRepository;

    @Autowired
    EmpService empService;

    @GetMapping("/allEmp")
    public List<Employee> getAllEmployee() {
        return empService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return empService.getEmployeeById(id);
    }

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return  empService.addEmployee(employee);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return empService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        return empService.deleteEmployee(id);
    }
    @RequestMapping(value = "/employeeByName/{name}",method = RequestMethod.GET)
    public List<Employee> getEmployeeByName(@PathVariable(value = "name") String name)
    {
        return  empService.getEmployeeByName(name);
    }
}
