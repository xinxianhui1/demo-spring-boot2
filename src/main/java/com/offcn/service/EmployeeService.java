package com.offcn.service;

import com.github.pagehelper.PageInfo;
import com.offcn.pojo.Employee;

public interface EmployeeService {
    public PageInfo<Employee> findEmployeeAll(int pageNum, int pageSize);
    public void saveOneEmployee(Employee employee);
}