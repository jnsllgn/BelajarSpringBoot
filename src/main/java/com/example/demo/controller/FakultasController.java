package com.example.demo.controller;

import com.example.demo.dto.FakultasData;
import com.example.demo.dto.ResponseData;
import com.example.demo.services.FakultasService;
import com.example.demo.student.Fakultas;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/fakultas")
public class FakultasController {
    @Autowired
    private FakultasService fakultasService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<ResponseData<Fakultas>> create(@Valid @RequestBody FakultasData fakultasData, Errors errors
    ){
        ResponseData<Fakultas> responseData = new ResponseData<>();
        if (errors.hasErrors()){
            for(ObjectError error : errors.getAllErrors()){
                System.err.println(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        Fakultas fakultas = modelMapper.map(fakultasData, Fakultas.class);

        responseData.setStatus(true);
        responseData.setPayload(fakultasService.save(fakultas));
        return ResponseEntity.ok(responseData);
    }

    @GetMapping
    public Iterable<Fakultas> findAll(){
        return fakultasService.findAll();
    }

    @GetMapping("/{id}")
    public Fakultas findOne(@PathVariable("id") Long id){
        return fakultasService.findOne(id);
    }

    @PutMapping
    public ResponseEntity<ResponseData<Fakultas>> update(@Valid @RequestBody FakultasData fakultasData, Errors errors
    ){
        ResponseData<Fakultas> responseData = new ResponseData<>();
        if (errors.hasErrors()){
            for(ObjectError error : errors.getAllErrors()){
                System.err.println(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        Fakultas fakultas = modelMapper.map(fakultasData, Fakultas.class);

        responseData.setStatus(true);
        responseData.setPayload(fakultasService.save(fakultas));
        return ResponseEntity.ok(responseData);
    }


}
