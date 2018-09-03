package com.offcn.dao;


import com.offcn.pojo.Employee;
import java.util.List;

public interface EmployeeDao {
    public List<Employee> findEmployeeAll(int pageNum, int pageSize);
    public void saveOneEmployee(Employee employee);
}