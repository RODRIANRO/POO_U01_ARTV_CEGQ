/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author NOTEBOOK
 */
public class PrincipalHerencia {
     public static void main(String [] args){
    
        var gatoMama = new Gato();
        gatoMama.setColor("plomo");
        gatoMama.setNombre("Mishi");
        gatoMama.setRaza("Mestizo");
        gatoMama.setYearNacimiento(2017);
        gatoMama.setPropietario("Angel");
        gatoMama.setNumeroAccidentesFatales(3);
        gatoMama.setNumeroVidas(9);
        
        System.out.println(gatoMama.getNombre());
        System.out.println(gatoMama.calcularVidasRestantes());
         System.out.println(gatoMama.getPropietario);
        
        
    }
}
    
