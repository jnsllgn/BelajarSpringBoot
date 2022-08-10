package com.example.demo.controller;


import com.example.demo.dto.MatkulData;
import com.example.demo.dto.ResponseData;
import com.example.demo.services.MatkulService;
import com.example.demo.student.Matkul;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/matkul")
public class MatkulController {

    @Autowired
    private MatkulService matkulService;

@Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<ResponseData<Matkul>> create(@Valid @RequestBody MatkulData matkulData, Errors errors
    ){
        ResponseData<Matkul> responseData = new ResponseData<>();
        if (errors.hasErrors()){
            for(ObjectError error : errors.getAllErrors()){
                System.err.println(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        Matkul matkul = modelMapper.map(matkulData, Matkul.class);

        responseData.setStatus(true);
        responseData.setPayload(matkulService.save(matkul));
        return ResponseEntity.ok(responseData);
    }
    @GetMapping
    public Iterable<Matkul> findAll(){
        return matkulService.findAll();
    }

    @GetMapping("/{id}")
    public Matkul findOne(@PathVariable("id") Long id){
        return matkulService.findOne(id);
    }

    @PutMapping
    public ResponseEntity<ResponseData<Matkul>> update(@Valid @RequestBody MatkulData matkulData, Errors errors
    ){
        ResponseData<Matkul> responseData = new ResponseData<>();
        if (errors.hasErrors()){
            for(ObjectError error : errors.getAllErrors()){
                System.err.println(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        Matkul matkul = modelMapper.map(matkulData, Matkul.class);

        responseData.setStatus(true);
        responseData.setPayload(matkulService.save(matkul));
        return ResponseEntity.ok(responseData);
    }

}
