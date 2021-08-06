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
public class Triangulo extends Figura{
    private double base;
    private double altura;
    private double longiLado;
    
    public double area(){
        return (this.base * this.altura)/2;    
    }
    
    public double perimetro(){
        return this.longiLado * 3;
        
    }
    
    public Triangulo(String elNombre, double laBase, double laAltura, double lalongila){
        super(3, elNombre);
        this.base = laBase;
        this.altura = laAltura;
        this.longiLado = lalongila;
    }
    
}
