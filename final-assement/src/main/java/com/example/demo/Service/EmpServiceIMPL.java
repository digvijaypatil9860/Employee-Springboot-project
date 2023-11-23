package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Emp;
import com.example.demo.repository.Emprepo;

@Service
public class EmpServiceIMPL implements EmpService {

    @Autowired
    Emprepo obj;

    @Override
    public void addEmp(Emp Employee) {
        obj.save(Employee);
     
    }

    @Override
    public void deleteEmp(int empId) {
      obj.deleteById(empId);
    }

    @Override
    public List<Emp> getAllEmps() {
     return obj.findAll();
    }


}

