package com.sam.carwash.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sam.carwash.entity.DepartmentEntity;
import com.sam.carwash.model.*;
import com.sam.carwash.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;

@Service
public class DepartmentService {
@Autowired
private DepartmentRepository departmentRepository;
@Autowired
private ModelMapper modelMapper;

public List<Department> getdepartments(){
    List<Department> departments = new ArrayList<Department>();
    List<DepartmentEntity> dpent = departmentRepository.findAll();
    for (DepartmentEntity departmentEntity : dpent) {
        Department dpt= modelMapper.map(departmentEntity, Department.class);
        departments.add(dpt);
    }
    return departments;
}
public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity){
    return departmentRepository.save(departmentEntity);
}
    
}
