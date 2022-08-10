package com.example.demo.repository;

import com.example.demo.student.Matkul;
import org.springframework.data.repository.CrudRepository;

public interface MatkulRepo extends CrudRepository<Matkul, Long> {
    
}
