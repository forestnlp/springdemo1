package com.demo.dao;

import com.demo.entity.Department;
import com.demo.entity.Dept;

import java.util.List;

public interface DeptDao {
    int[] deptBatchAdd(List<Department> depts);
    int[] deptBatchUpdate(List<Department> depts);
    int[] deptBatchDelete(List<Integer> deptnos);
}
