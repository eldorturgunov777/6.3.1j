package com.example.a631j.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.a631j.entity.Employee;

import java.util.List;

/**
 * Created by Eldor Turgunov on 22.06.2022.
 * 6.3.1j
 * eldorturgunov777@gmail.com
 */
@Dao
public interface EmployeeDao {
    @Query("select *from employee")
    List<Employee> getAll();

    @Query("SELECT * FROM employee WHERE id = :id")
    Employee getById(long id);

    @Insert
    void insert(Employee employee);

    @Update
    void update(Employee employee);

    @Delete
    void delete(Employee employee);
}
