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
public class Cuadrado extends Figura {
    
    private double longitud;
    
    public double perimetro(){
        return this.longitud * consultarLados(); 
    }
    
    public double area(){
        return this.longitud * this.longitud;
    }
    
    public Cuadrado(String elNombre, double lalongi){
        super(4,elNombre);
        this.longitud = lalongi;
        
    }
    
    
    
}
