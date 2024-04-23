package com.example.CriminalDetection.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity(name = "Criminal Records")
public class CriminalRecords {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String gender;
    private String crime;
    @JsonFormat(pattern = "dd/mm/yyyy")
    private Date arrestDate;

    public CriminalRecords(int id, String name, int age, String gender, Date arrestDate, String crime) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.arrestDate = arrestDate;
        this.crime = crime;
    }

    public CriminalRecords() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getArrestDate() {
        return arrestDate;
    }

    public void setArrestDate(Date arrestDate) {
        this.arrestDate = arrestDate;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }
}
