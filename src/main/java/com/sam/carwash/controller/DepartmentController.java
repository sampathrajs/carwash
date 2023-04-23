package com.sam.carwash.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.carwash.entity.DepartmentEntity;
import com.sam.carwash.model.Department;
import com.sam.carwash.service.DepartmentService;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired
    private DepartmentService _deparmentService; 

    @GetMapping("/list")
    public List<Department> getdepartments(){
       return  _deparmentService.getdepartments();
    }
    @PostMapping("/save")
    public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity departmentEntity){
        return _deparmentService.saveDepartment(departmentEntity);
    }
}
