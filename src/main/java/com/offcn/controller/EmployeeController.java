package com.offcn.controller;

import com.github.pagehelper.PageInfo;
import com.offcn.pojo.Employee;
import com.offcn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/findEmployeeAll")
    public PageInfo<Employee> findEmployeeAll(
            @RequestParam(name="pageNum",required=false,defaultValue="1") int pageNum,
            @RequestParam(name="pageSize",required=false,defaultValue="10") int pageSize){

        PageInfo<Employee> employeeAll =
                employeeService.findEmployeeAll(pageNum, pageSize);
        return employeeAll;
    }

    @PostMapping("/saveOneEmployee")
    public void saveOneEmployee(Employee employee){
        employeeService.saveOneEmployee(employee);
    }
}