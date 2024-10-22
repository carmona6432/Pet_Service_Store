package com.pets.store.dao;

import com.pets.store.model.Employee;
import com.pets.store.model.Grooming;
import org.springframework.stereotype.Component;

@Component
public class GroomingJdbcDAO implements GroomingDAO{
    @Override
    public Grooming displayAppointment(int id) {
        return null;
    }

    @Override
    public Employee lookupEmployee() {
        return null;
    }

    @Override
    public Grooming registerAppointment(Grooming grooming) {
        return null;
    }

    @Override
    public Grooming registerApptbyEmpId(Grooming grooming, int employee_id) {
        return null;
    }

    @Override
    public Grooming updateAppointment(Grooming updateAppointment) {
        return null;
    }

    @Override
    public void deleteAppointment(int id) {

    }
}
