package com.demo.service;

import com.demo.entity.Emp;
import com.demo.entity.Employee;

import java.util.List;

public interface EmpService {
    int findEmpCount();
    Employee findByEmpno(int empno);
    List<Employee> findByDeptno(int deptno);
    int  addEmp(Employee emp);
    int updateEmp(Employee emp);
    int deleteEmp( int empno);
}
