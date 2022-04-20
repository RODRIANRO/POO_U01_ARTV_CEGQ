/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.animal;
import java.time.LocalDate;

/**
 *
 * @author NOTEBOOK
 */
public class Animal {
private String nombre;
    private int yearNacimiento;
    private String color;
    protected String raza;
    
    public int calcularEdad(){
        return LocalDate.now().getYear()-this.yearNacimiento;
    }
    
    
    
    //Getters & Setters
    
    public int getYearNacimiento(){
        return this.yearNacimiento;
    }
    
    public void setYearNacimiento(int yearNacimiento){
        this.yearNacimiento=yearNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}