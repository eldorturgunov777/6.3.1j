package com.example.a631j.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.a631j.dao.EmployeeDao;
import com.example.a631j.entity.Employee;

/**
 * Created by Eldor Turgunov on 22.06.2022.
 * 6.3.1j
 * eldorturgunov777@gmail.com
 */

@Database(entities = {Employee.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract EmployeeDao employeeDao();
}
