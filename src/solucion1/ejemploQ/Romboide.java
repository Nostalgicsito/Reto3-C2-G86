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
public class Romboide extends Figura{
    
    private double base;
    private double altura;
    private double longilado1;
    private double longilado2;
    
    public double area(){
        return this.base * this.altura;
    }
    
    public double perimetro(){
        return (this.longilado1 *2) + (this.longilado2 * 2);  
    }
    
    public Romboide(String elNombre, double laBase, double laAltura, double lalongi1, double lalongi2){
        super(4, elNombre);
        this.base = laBase;
        this.altura = laAltura;
        this.longilado1 = lalongi1;
        this.longilado2 = lalongi2;
    }
    
}
