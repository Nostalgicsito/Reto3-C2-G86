package solucion1;

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
public class Princip {
    public static void main(String[] args) {
       Scanner lector = new Scanner(System.in);
        System.out.println("Menú principal:");
        System.out.println("1. Sumar enteros positivos.");
        System.out.println("2. Sumar cualquier número");
        System.out.println("3. Restar.");
        System.out.println("4. Multiplicar.");
        System.out.println("5. Potenciar");
        System.out.println("6. Sacar Raiz");
        System.out.println("7. Salir");
        System.out.print("Digite su opcion: ");
        int opcion = lector.nextInt();
        if (opcion == 1){
            System.out.println("Opcion 1. Sumar enteros positivos.");
            Operaciones oper = new Operaciones();
            int numero1 =  oper.leerNumeroSoloInt("Digite el numero (1) o vuelva a ingresarlo: ");
            int numero2 =  oper.leerNumeroSoloInt("Digite el numero (2) o vuelva a ingresarlo: ");
            int  resul = oper.sumar(numero1, numero2);
            System.out.println("El resultado de sumar " + numero1 + " + " + numero2 + " es = " + resul);
            }
        if (opcion == 2);{
            System.out.println("Opcion 2.  Sumar cualquier número");
            Operaciones oper = new Operaciones();
            double numero1 =  oper.leerNumeroCU("Digite el numero (1) o vuelva a ingresarlo: ");
            double numero2 =  oper.leerNumeroCU("Digite el numero (2) o vuelva a ingresarlo: ");
            double  resul = oper.sumar2(numero1, numero2);
            System.out.println("El resultado de sumar " + numero1 + " + " + numero2 + " es = " + resul);
                }
        if (opcion == 3);{
            System.out.println("Opcion 3.  Restar");
            Operaciones oper = new Operaciones();
            double numero1 =  oper.leerNumeroCU("Digite el numero (1) o vuelva a ingresarlo: ");
            double numero2 =  oper.leerNumeroCU("Digite el numero (2) o vuelva a ingresarlo: ");
            double  resul = oper.restar(numero1, numero2);
            System.out.println("El resultado de restar " + numero1 + " - " + numero2 + " es = " + resul);
            }           
        if (opcion == 4);{
            System.out.println("Opcion 4. Multiplicar");
            Operaciones oper = new Operaciones();
            double numero1 =  oper.leerNumeroCU("Digite el numero (1) o vuelva a ingresarlo: ");
            double numero2 =  oper.leerNumeroCU("Digite el numero (2) o vuelva a ingresarlo: ");
            double  resul = oper.multiplicar(numero1, numero2);
            System.out.println("El resultado de multiplicar " + numero1 + " * " + numero2 + " es = " + resul);
            }
        if (opcion == 5);{
            System.out.println("Opcion 5. Potenciar");
            Operaciones oper = new Operaciones();
            double numero1 =  oper.leerNumeroCU("Digite el numero base o vuelva a ingresarlo: ");
            double numero2 =  oper.leerNumeroCU("Digite el numero exponente o vuelva a ingresarlo: ");
            double resul = oper.potenciar(numero1, numero2);
            System.out.println("El resultado de potenciar "+numero1+ " a la "+numero2+ " es = " +resul);}
        if (opcion == 6);{
            System.out.println("Opcion 6. Raíz");
            Operaciones oper = new Operaciones();
            int numero1 =  oper.leerNumeroSoloInt("Digite el numero al cual desea sacarle raíz o vuelva a ingresarlo: ");
            int resul = (int) oper.raiz(numero1);
            System.out.println("La raíz de " + numero1 + " es = " + resul);    
        }
       
    
            }
            
            
    }
            
  