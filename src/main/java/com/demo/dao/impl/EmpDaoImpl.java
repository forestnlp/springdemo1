package com.demo.dao.impl;

import com.demo.dao.EmpDao;

public class EmpDaoImpl implements EmpDao {
    @Override
    public int addEmp() {
        System.out.println("emp added");
        return 0;
    }

    public int addEmp(Integer empno,String ename,String job){
        System.out.println("empDao add ... ...");
        return 1;
    }
}
