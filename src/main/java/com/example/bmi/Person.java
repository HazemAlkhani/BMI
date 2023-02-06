package com.example.bmi;

public class Person {
    private final int ID;
    private String Navn;
    private String Køn;
    private int Alder;
    public Person(int ID, String Navn, String Køn, int Alder) {
        this.ID = ID;
        this.Navn = Navn;
        this.Køn = Køn;
        this.Alder = Alder;
}
    public int getId() {
        return ID;
    }

    public String getNavn() {
        return Navn;
    }

    public String getKøn() {
        return Køn;
    }

    public int getAlder() { return Alder;}

    @Override
    public String toString() {
        return String.format(String.valueOf(ID), Navn, Køn,Alder);
    }
    }

