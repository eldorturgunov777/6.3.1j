package com.example.a631j.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by Eldor Turgunov on 22.06.2022.
 * 6.3.1j
 * eldorturgunov777@gmail.com
 */

@Entity
public class Employee {
    @PrimaryKey(autoGenerate = true)
    public long id;
    public String name;
}
