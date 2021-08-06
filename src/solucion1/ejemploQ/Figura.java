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

public class Figura {
    
    
    
    
    private int lados;
    private String nombre;
    
    public void asignarLados(int numLados){
        this.lados = numLados;
       
    }
    
    public int consultarLados(){
        return this.lados;
    }
    
    public void asignarNombre(String newNombre){
        this.nombre = newNombre;
    }
    
    public String consultarNombre(){
        return this.nombre;
    }
    
    public Figura(int numLados, String elNombre){
        this.lados = numLados;
        this.nombre = elNombre;
    } 

  
    }
        
    
