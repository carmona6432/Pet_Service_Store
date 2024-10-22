package com.pets.store.dao;

import com.pets.store.model.Daycare;
import org.springframework.stereotype.Component;

@Component
public class DaycareJdbcDAO implements DaycareDAO{
    @Override
    public Daycare displayAppointment(int id) {
        return null;
    }

    @Override
    public Daycare registerAppointment(Daycare daycare) {
        return null;
    }

    @Override
    public Daycare updateAppointment(Daycare updateAppointment) {
        return null;
    }

    @Override
    public Daycare updateSpecialInstruction() {
        return null;
    }

    @Override
    public boolean updateFullDayVisit() {
        return false;
    }

    @Override
    public void deleteAppointment(int id) {

    }
}
