package solucion1;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago
 */
public class Operaciones {
    public int leerNumeroSoloInt(String mensaje){
        Scanner lector = new Scanner(System.in);
        int numero1;
        do{
            System.out.print(mensaje);
            try {
                numero1 = lector.nextInt();
            }catch(InputMismatchException e){
                System.out.println("se devuelve un cero por no ser entero.");
                numero1= 0;
            }finally{
                System.out.println("");
            }
            
        }while(numero1<0);
        return numero1;
    }
    public double leerNumeroCU(String mensaje){
        Scanner lector = new Scanner(System.in);
        Double num1 = null;
        String valorleido;
        do{
            System.out.print(mensaje);
            try {
                valorleido = lector.next();
                num1 = Double.parseDouble(valorleido);

            }catch(NumberFormatException mismsalkd){
                num1 = null;
            }
        }while(num1 == null);
        return num1;
    
    }
    
    public int sumar(int numero1, int numero2){
        return numero1 + numero2;
    }
        

    public double sumar2(double numero1, double numero2){
        return numero1 + numero2;
    }
        
    public double restar(double numero1, double numero2){
        return numero1 - numero2;
    }
    
    public double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }
    
    public double potenciar(double numero1, double numero2){
        double x = Math.pow(numero1 ,numero2);
        return x;
    }
    public double raiz (int numero1){
        int y = (int) Math.sqrt(numero1);
        return y;
    }  
 
    }
