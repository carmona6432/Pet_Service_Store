package com.pets.store.dao;

import com.pets.store.model.Daycare;

public interface DaycareDAO {
    public Daycare displayAppointment (int id);
    public Daycare registerAppointment(Daycare daycare);
    public Daycare updateAppointment (Daycare updateAppointment);
    public Daycare updateSpecialInstruction();
    public boolean updateFullDayVisit();
    public void deleteAppointment(int id);
}
