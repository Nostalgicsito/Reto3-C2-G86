/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion1.ejemploQ;

/**
 *
 * @author Santiago
 */
public class Rombo extends Figura{
    
    private double longitud;
    private double altura;
    
    public double area(){
        return this.longitud * this.altura;
        
    }
    
    public double perimetro(){
        return this.longitud * 4;
 
    }
    public Rombo(String elNombre, double lalongi, double laAltura){
        super(4, elNombre);
        this.altura = laAltura;
        this.longitud = lalongi;
    }
    
}
