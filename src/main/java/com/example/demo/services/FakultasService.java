package com.example.demo.services;

import com.example.demo.repository.FakultasRepo;
import com.example.demo.student.Fakultas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.TransactionScoped;
import java.util.Optional;

@Service
@TransactionScoped
public class FakultasService {

    @Autowired
    private FakultasRepo fakultasRepo;

    public Fakultas save(Fakultas fakultas){
        return  fakultasRepo.save(fakultas);
    }

    public Fakultas findOne(Long id){
        Optional<Fakultas> fakultas = fakultasRepo.findById(id);
        if (!fakultas.isPresent()){
            return  null;
        }
        return fakultas.get();
    }

    public Iterable<Fakultas> findAll(){
        return fakultasRepo.findAll();
    }

    public void removeOne(Long id){
        fakultasRepo.deleteById(id);
    }


}
