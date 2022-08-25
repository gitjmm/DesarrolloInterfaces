/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jorge Martínez
 * Prueba con fechas
 */
public class Fechas {
    
    
    public static void main(String args[]) throws ParseException{
        //La clase SimpleDateFormat nos permite dar formato a una fecha
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy"); //MM para no confundir con mm de minutos
        Date d = new Date(); // d contiene fecha actual
        System.out.println(fecha.format(d));
        
        String s = "15-10-2021";
        d = fecha.parse(s);
        System.out.println(d.toString());
        
    }
}
