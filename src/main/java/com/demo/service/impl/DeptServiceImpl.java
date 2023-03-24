package com.demo.service.impl;

import com.demo.dao.DeptDao;
import com.demo.entity.Department;
import com.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public int[] deptBatchAdd(List<Department> depts) {
        return deptDao.deptBatchAdd(depts);
    }

    @Override
    public int[] deptBatchUpdate(List<Department> depts) {
        return deptDao.deptBatchUpdate(depts);
    }

    @Override
    public int[] deptBatchDelete(List<Integer> deptnos) {
        return deptDao.deptBatchDelete(deptnos);
    }
}
