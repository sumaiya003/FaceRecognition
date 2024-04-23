package com.example.CriminalDetection.Controller;

import com.example.CriminalDetection.Model.CriminalRecords;
import com.example.CriminalDetection.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordsController {

    @Autowired
    private Services services;

    @PostMapping("/upload")
    public ResponseEntity<String> upload(@RequestBody CriminalRecords criminalRecords){
             String uploadStatus =services.uploadData(criminalRecords);
             return new ResponseEntity<>(uploadStatus,HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<CriminalRecords>> getAll(){
       List<CriminalRecords> criminalRecordsList = services.getAllData();
        return new ResponseEntity<>(criminalRecordsList,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CriminalRecords> getById(@PathVariable int id){
        CriminalRecords criminalRecords = services.getDataById(id);
        return new ResponseEntity<>(criminalRecords,HttpStatus.OK);
    }

    @GetMapping("/{crime}")
    public ResponseEntity<List<CriminalRecords>> getbyCrime(@PathVariable String crime){
        List<CriminalRecords> criminalRecords = services.getCrime(crime);
        return new ResponseEntity<>(criminalRecords,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CriminalRecords> update(@PathVariable int id){
        CriminalRecords criminalRecords = services.updateById(id);
        return new ResponseEntity<>(criminalRecords,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable int id){
        String status = services.removeData(id);
        return new ResponseEntity<>(status,HttpStatus.OK);
    }
}
