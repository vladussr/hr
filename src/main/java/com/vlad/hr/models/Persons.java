package com.vlad.hr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String snils;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getPasNumber() {
        return pasNumber;
    }

    public void setPasNumber(String pasNumber) {
        this.pasNumber = pasNumber;
    }

    public String getKemVidPas() {
        return kemVidPas;
    }

    public void setKemVidPas(String kemVidPas) {
        this.kemVidPas = kemVidPas;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    private String pasNumber;
    private String kemVidPas;
    private String adress;
    private String position;
    private String birthday;
    private String tax;

    public Persons(String name, String birthday, String tax, String snils, String pasNumber, String kemVidPas, String adress, String position) {
        this.name = name;
        this.snils = snils;
        this.pasNumber = pasNumber;
        this.kemVidPas = kemVidPas;
        this.adress = adress;
        this.position = position;
        this.birthday = birthday;
        this.tax = tax;
    }

    public Persons() {
    }
}
