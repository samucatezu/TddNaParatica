package com.example.tdd.model;

import java.time.LocalDate;

public class BookingModel {

    private String id;
    private String reserveName;
    private LocalDate cheIn;
    private LocalDate checkOut;
    private int numberGuests;

    public BookingModel(String id, String reserveName, LocalDate cheIn, LocalDate checkOut, int numberGuests) {
        this.id = id;
        this.reserveName = reserveName;
        this.cheIn = cheIn;
        this.checkOut = checkOut;
        this.numberGuests = numberGuests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReserveName() {
        return reserveName;
    }

    public void setReserveName(String reserveName) {
        this.reserveName = reserveName;
    }

    public LocalDate getCheIn() {
        return cheIn;
    }

    public void setCheIn(LocalDate cheIn) {
        this.cheIn = cheIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumberGuests() {
        return numberGuests;
    }

    public void setNumberGuests(int numberGuests) {
        this.numberGuests = numberGuests;
    }
}
