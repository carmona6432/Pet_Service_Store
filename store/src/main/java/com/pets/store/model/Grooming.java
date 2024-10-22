package com.pets.store.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Grooming {
    private int id;
    private LocalDate date;
    private LocalTime time;
    private String additional_product;
    private int pet_id;
    private int employee_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getAdditional_product() {
        return additional_product;
    }

    public void setAdditional_product(String additional_product) {
        this.additional_product = additional_product;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }
}
