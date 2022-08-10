package com.example.demo.services;

import com.example.demo.repository.FakultasRepo;
import com.example.demo.repository.MatkulRepo;
import com.example.demo.student.Fakultas;
import com.example.demo.student.Matkul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class MatkulService {
    @Autowired
    private MatkulRepo matkulRepo;

    public Matkul save(Matkul matkul){

        return  matkulRepo.save(matkul);
    }

    public Matkul findOne(Long id){
        Optional<Matkul> matkul = matkulRepo.findById(id);
        if (!matkul.isPresent()){
            return  null;
        }
        return matkul.get();
    }

    public Iterable<Matkul> findAll(){

        return matkulRepo.findAll();
    }

    public void removeOne(Long id){

        matkulRepo.deleteById(id);
    }
}
