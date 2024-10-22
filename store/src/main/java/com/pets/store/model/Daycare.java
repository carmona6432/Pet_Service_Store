package com.pets.store.model;

import java.time.LocalTime;

public class Daycare {
    private int id;
    private LocalTime dropoff_time;
    private LocalTime pickup_time;
    private int pet_id;
    private boolean full_day_visit;
    private String special_instruction;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getDropoff_time() {
        return dropoff_time;
    }

    public void setDropoff_time(LocalTime dropoff_time) {
        this.dropoff_time = dropoff_time;
    }

    public LocalTime getPickup_time() {
        return pickup_time;
    }

    public void setPickup_time(LocalTime pickup_time) {
        this.pickup_time = pickup_time;
    }

    public int getPet_id() {
        return pet_id;
    }

    public void setPet_id(int pet_id) {
        this.pet_id = pet_id;
    }

    public boolean isFull_day_visit() {
        return full_day_visit;
    }

    public void setFull_day_visit(boolean full_day_visit) {
        this.full_day_visit = full_day_visit;
    }

    public String getSpecial_instruction() {
        return special_instruction;
    }

    public void setSpecial_instruction(String special_instruction) {
        this.special_instruction = special_instruction;
    }
}
