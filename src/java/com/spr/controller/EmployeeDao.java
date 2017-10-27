/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.spr.controller;

import java.sql.Types;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
    
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
     public void insert(int eid,String ename,String street,String location)
    {
        //Inserting records into db
        int[] types={Types.INTEGER,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
        Object[] params={eid,ename,street,location};
        
        jdbcTemplate.update("insert into employees values(?,?,?,?)",params,types);
        System.out.print("Record Inserted");
    }
    
}
