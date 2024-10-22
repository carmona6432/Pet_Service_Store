package com.pets.store.dao;

import com.pets.store.model.Employee;
import com.pets.store.model.Grooming;

public interface GroomingDAO {
    public Grooming displayAppointment(int id);
    public Employee lookupEmployee();
    public Grooming registerAppointment(Grooming grooming);
    public Grooming registerApptbyEmpId(Grooming grooming, int employee_id);
    public Grooming updateAppointment (Grooming updateAppointment);
    public void deleteAppointment(int id);}
