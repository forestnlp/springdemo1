package com.demo.service;

import com.demo.entity.Department;

import java.util.List;

public interface DeptService {
    int[] deptBatchAdd(List<Department> depts);

    int[] deptBatchUpdate(List<Department> depts);

    int[] deptBatchDelete(List<Integer> deptnos);
}
