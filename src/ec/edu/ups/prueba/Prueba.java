/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.*;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Prueba  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Jugador ju=new Jugador() {
           @Override
           public String goles() {
               return "Tiros al arco";
           }
       };
       
        Socio so=new Socio(){
           @Override
           public String cuentas() {
               return "Impuestos";
           }
            
        };
      
    Date fechacont1=new Date(2000, 5, 12);
    Arquero arq=new Arquero(20, 31, 2 , 50, 159, "0102469780",fechacont1, "Arquero", "Juan", "Arquero Titular", "Calle", 24); 
    Date fechaAbo=new Date(2001, 4, 10);
    Date fechaSoc1=new Date(1999, 2, 23);
    Abonado abo=new Abonado(123, 25.2, 1478, fechaAbo, "Directo" , 2045, "tres años", fechaSoc1,"Matias", "ventas", "Jimbo", 40);
    Date fechaSoc2=new Date(2000, 5, 9);
    Auspisiante aus=new Auspisiante(17895, "Pilsenar", 20000.12, "Iniformes","temporal", 3600,"cuatro años" , fechaSoc2,"Esteban", "Gerente","Encalada",36);
     Date fechacont2=new Date(1999, 5, 29);
    Delantero del=new Delantero(1, 2, 12, 50.12, 1021, "0106978457", fechacont2, "DelanteroIzquierdo", "Mario","Delantero Titular", "Carrion", 28);
    
        System.out.println(arq);
        System.out.println(abo);
        System.out.println(aus);
        System.out.println(del);
        
        System.out.println(ju.goles());
        System.out.println(so.cuentas());
    }
    
}
