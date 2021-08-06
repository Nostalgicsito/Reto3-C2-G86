/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion1.ejemploQ;
import java.util.Scanner;
       
/**
 *
 * @author Santiago
 */
public class Menu {
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
    
        
public static void main(String[] args) throws Exception {
    Menu oper = new Menu();
    
    System.out.println("\n Figura geometrica Cuadrado.");
    double num1 = oper.leerNumeroCU("Digite la medida de los lados del cuadrado: ");
    
    Cuadrado rtaC = new Cuadrado("Cuadrado", num1);
    Double valAreaC = rtaC.area();
    System.out.println("\n - El area del " +rtaC.consultarNombre()+" es "+valAreaC);
    System.out.println("\n ");
    
    System.out.println("\n Figura geometrica Triangulo.");
    double num2 = oper.leerNumeroCU("Digite la medida de la base del triangulo: ");
    double num3 = oper.leerNumeroCU("Digite la medida de la altura del triangulo: ");
    double num4 = oper.leerNumeroCU("Digite la medida de los lados del triangulo: ");
        
    Triangulo rtaT = new Triangulo("Triangulo", num2, num3, num4);
    Double valAreaT = rtaT.area();
    Double valPerimT = rtaT.perimetro();
    System.out.println("\n - El area del " +rtaT.consultarNombre()+" es "+valAreaT);
    System.out.println("\n - El perimetro del " +rtaT.consultarNombre()+ " es " +valPerimT);
    System.out.println("\n");
    
    System.out.println("\n Figura geometrica Rombo.");
    double num5 = oper.leerNumeroCU("Digite la medida de los lados del Rombo: ");
    double num6 = oper.leerNumeroCU("Digite la medida de la altura del Rombo: ");
    
    Rombo rtaR = new Rombo("Rombo", num5, num6);
    Double valAreaR = rtaR.area();
    Double valPerimR = rtaR.perimetro();
    System.out.println("\n - El area del " +rtaR.consultarNombre()+" es "+valAreaR);
    System.out.println("\n - El perimetro del " +rtaR.consultarNombre()+ " es " +valPerimR);
    System.out.println("\n");
    
    System.out.println("\n Figura geometrica Romboide. ");
    double num7 = oper.leerNumeroCU("Digite la medida de la base del Romboide: ");
    double num8 = oper.leerNumeroCU("Digite la medida de la altura del Romboide: ");
    double num9 = oper.leerNumeroCU("Digite la medida de los lados inferior y superior del Romboide: ");
    double num10 = oper.leerNumeroCU("Digite la medida de los lados laterales del Romboide: ");
    
    Romboide rtaRo = new Romboide("Romboide", num7, num8, num9, num10);
    Double valAreaRo = rtaRo.area();
    Double valPerimRo = rtaRo.perimetro();
    System.out.println("\n - El area del " +rtaRo.consultarNombre()+" es "+valAreaRo);
    System.out.println("\n - El perimetro del " +rtaRo.consultarNombre()+ " es " +valPerimRo);
    System.out.println("\n");
        
}
}
