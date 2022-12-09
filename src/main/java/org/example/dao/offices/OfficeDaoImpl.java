package org.example.dao.offices;

import com.example.Excercise1.entities.Offices;
import com.example.Excercise1.repository.Dao;
import com.example.Excercise1.repository.DaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

@Repository
public class OfficeDaoImpl implements OfficeDao{

    private final Dao dao;

    @Autowired
    public OfficeDaoImpl(Dao dao) {
        this.dao = dao;
    }

    private static final String sql = "select * from offices";

    @Override
    public List<Offices> getAllOffice() {
        return dao.getListOfValueObject(sql, Offices.class);
    }

    @Override
    public void saveListOfOffice(Offices offices) {
        try {
            dao.setValueObject(offices);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
