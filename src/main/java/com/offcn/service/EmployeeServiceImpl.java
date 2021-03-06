package com.offcn.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.offcn.dao.EmployeeDao;
import com.offcn.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value = "employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao;//这里会报错，但不影响运行

    /*
     * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
     * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
     * pageNum 开始页数
     * pageSize 每页显示的数据条数
     * */
    @Override
    public PageInfo<Employee> findEmployeeAll(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<Employee>employeeAll=employeeDao.findEmployeeAll(pageNum,pageSize);
        PageInfo result = new PageInfo(employeeAll);
        return result;
    }

    @Override
    public void saveOneEmployee(Employee employee) {
        employeeDao.saveOneEmployee(employee);
    }
}