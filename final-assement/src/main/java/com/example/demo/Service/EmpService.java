package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Emp;

public interface EmpService {

    //for add
    public void addEmp (Emp Employee);

    // for delete
    public void deleteEmp(int empId);

    // for select all data
    List<Emp> getAllEmps();
}
