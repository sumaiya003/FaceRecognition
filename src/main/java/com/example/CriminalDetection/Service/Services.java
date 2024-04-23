package com.example.CriminalDetection.Service;

import com.example.CriminalDetection.Model.CriminalRecords;

import java.util.List;

public interface Services {

    public String uploadData(CriminalRecords criminalRecords);
    public List<CriminalRecords> getAllData();
    public CriminalRecords getDataById(int id);
    public CriminalRecords updateById(int id);
    public String removeData(int id);
    public List<CriminalRecords> getCrime(String crime);

}
