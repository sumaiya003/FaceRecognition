package com.example.CriminalDetection.Service;

import com.example.CriminalDetection.Model.CriminalRecords;
import com.example.CriminalDetection.Repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImp implements Services{


    @Autowired
    private Repo repo;
    @Override
    public String uploadData(CriminalRecords criminalRecords) {
        repo.save(criminalRecords);
        return "Uploaded";
    }

    @Override
    public List<CriminalRecords> getAllData() {
        return repo.findAll();
    }
    @Override
    public CriminalRecords getDataById(int id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Invalid id"));
    }

    @Override
    public CriminalRecords updateById(int id) {
        return repo.findById(id).orElseThrow(()-> new RuntimeException("Invalid id"));
    }

    @Override
    public String removeData(int id) {
         repo.deleteById(id);
         return "criminal record deleted";
    }

    @Override
    public List<CriminalRecords> getCrime(String crime) {
      return repo.getCrime(crime);
    }
}
