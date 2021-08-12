package com.EmpDatabase.service;

import com.EmpDatabase.domain.Employee;
import com.EmpDatabase.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
@Autowired
private EmpRepository empRepository;

public List<Employee> getAllEmployee(){
    return empRepository.findAll();
}

public Employee getEmployeeById(int id)
{
    return  empRepository.findById(id).orElse(null);
}

public Employee addEmployee(Employee employee)
{
    return  empRepository.save(employee);
}

public Employee updateEmployee(Employee employee){
    Employee existingemployee=empRepository.findById(employee.getId()).orElse(null);
    existingemployee.setEmail(employee.getEmail());
    existingemployee.setName(employee.getName());
    return empRepository.save(existingemployee);
}

public String deleteEmployee(int id){
    empRepository.deleteById(id);
    return "Product has been been removed";
}

public List<Employee> getEmployeeByName(String name)
{
    List<Employee> e=empRepository.findAllByName(name);
    final List<Employee> e1 = e;
    return e1;
}


}
