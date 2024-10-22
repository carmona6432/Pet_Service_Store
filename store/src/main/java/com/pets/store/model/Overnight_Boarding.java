package com.pets.store.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Overnight_Boarding {
    private int id;
    private LocalDate checkin_date;
    private LocalTime checkin_time;
    private LocalDate checkout_date;
    private LocalTime checkout_time;
    private String additional_information;
    private  int pet_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getCheckin_date() {
        return checkin_date;
    }

    public void setCheckin_date(LocalDate checkin_date) {
        this.checkin_date = checkin_date;
    }

    public LocalTime getCheckin_time() {
        return checkin_time;
    }

    public void setCheckin_time(LocalTime checkin_time) {
        this.checkin_time = checkin_time;
    }

    public LocalDate getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(LocalDate checkout_date) {
        this.checkout_date = checkout_date;
    }

    public LocalTime getCheckout_time() {
        return checkout_time;
    }

    public void setCheckout_time(LocalTime checkout_time) {
        this.checkout_time = checkout_time;
    }

    public String getAdditional_information() {
        return additional_information;
    }

    public void setAdditional_information(String additional_information) {
        this.additional_information = additional_information;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }
}
