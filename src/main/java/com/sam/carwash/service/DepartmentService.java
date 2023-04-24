package com.sam.carwash.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sam.carwash.entity.Department;
import com.sam.carwash.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;

@Service
public class DepartmentService {
@Autowired
private DepartmentRepository departmentRepository;
@Autowired
private ModelMapper modelMapper;

public List<Department> getdepartments(){
    return  departmentRepository.findAll();
}
public Department saveDepartment(Department departmentEntity){
    return departmentRepository.save(departmentEntity);
}
    
}
