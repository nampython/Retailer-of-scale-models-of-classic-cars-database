package org.example.dao.offices;

import com.example.Excercise1.entities.Offices;

import java.util.List;

public interface OfficeDao {
    public abstract List<Offices> getAllOffice();
    public abstract void saveListOfOffice(Offices offices);
}
