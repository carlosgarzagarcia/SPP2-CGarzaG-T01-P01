/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.cgarza.act1;
 import java.util.*;
/**
 *
 * @author Carlos Rafael
 */
public class SPPCGarzaAct1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

      double cal1,cal2,cal3,cal4,cal5,prom;
      String res;
      Scanner entrada= new Scanner(System.in);//Ingresar los datos 
       System.out.println("Ingrese la calificación 1");
        cal1= entrada.nextDouble();
       System.out.println("Ingrese la calificación 2");
        cal2= entrada.nextDouble();
       System.out.println("Ingrese la calificación 3");
        cal3= entrada.nextDouble();
       System.out.println("Ingrese la calificación 4");
        cal4= entrada.nextDouble();
       System.out.println("Ingrese la calificación 5");
        cal5= entrada.nextDouble();
        
        //Calcular el promedio
        prom=(cal1+cal2+cal3+cal4+cal5)/5;
        //If para que me diga el resultado
          if(prom>=7){
           res=("APROBADO");
              System.out.println("Estas: " + res);
          }
          else{
           res=("REPROBADO");
              System.out.println("Estas: " + res);
          }
          
          
    }
    
}

    