package com.demo.service.impl;

import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;
import com.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmployeeDao empDao;
    @Override
    public int findEmpCount() {
        return empDao.findEmpCount();
    }
    @Override
    public Employee findByEmpno(int empno) {
        return empDao.findByEmpno( empno);
    }
    @Override
    public List<Employee> findByDeptno(int deptno) {
        return empDao.findByDeptno( deptno);
    }
    @Override
    public int addEmp(Employee emp) {
        return empDao.addEmp(emp);
    }
    @Override
    public int updateEmp(Employee emp) {
        return empDao.updateEmp(emp);
    }
    @Override
    public int deleteEmp(int empno) {
        return empDao.deleteEmp(empno);
    }
}
