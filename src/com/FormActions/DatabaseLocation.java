/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.FormActions;

/**
 *
 * @author Work
 */
public class DatabaseLocation {
    
    private String dotDBFileLocation = "C:\\Users\\Valorant\\Documents\\UM Files\\DTR and Payroll Management System\\src\\com\\Database\\Database.db";
    
    private String location = "jdbc:sqlite:/" + dotDBFileLocation;
    
    public String getDatabaseLocation(){
        return location;
    }
    
    
    
}
