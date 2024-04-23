package com.example.CriminalDetection.Repo;

import com.example.CriminalDetection.Model.CriminalRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repo extends JpaRepository<CriminalRecords, Integer> {

    @Query(value = "Select * from Criminal Records WHERE crime = ?", nativeQuery = true)
    public List<CriminalRecords> getCrime(String crime);
}
