/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ricar
 */
public class Labo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Ingrese el numero de producto del 1 al 5, 0 para terminar: ");
        Scanner leer=new Scanner(System.in);
        int num=leer.nextInt();
        while(num<1 || num>5){
            System.out.print("Error, Numero Invalido. Ingrese el numero de producto del 1 al 5, 0 para terminar: ");
            num=leer.nextInt();
        }
        System.out.print("Ingrese su cantidad: ");
        Scanner leer2 =new Scanner(System.in);
        int cantidad =leer2.nextInt();
        int total = 0;
        ArrayList<Producto> Productos = new ArrayList<>();
        
        do{
            Producto pro  = new Producto(num, cantidad);
            total = total + pro.getPrecio();
            Productos.add(pro);
            
            System.out.print("Ingrese el numero de producto del 1 al 5, 0 para terminar: ");
            num=leer.nextInt();
            while(num<0 || num>5){
            System.out.print("Error, Numero Invalido. Ingrese el numero de producto del 1 al 5, 0 para terminar: ");
            num=leer.nextInt();
            }
            System.out.print("Ingrese su cantidad: ");
            cantidad =leer2.nextInt();
            
            
        }while(num != 0);
        
        
        System.out.println("\n\nLista de Productos: ");
        for(int i = 0;i< Productos.size();i++){
            System.out.println("Producto numero: "+(i+1));
            System.out.println("Producto tipo: "+Productos.get(i).getNumproducto());
            System.out.println("Cantidad: "+Productos.get(i).getCantidadvendida());
            System.out.println("Precio en Gs. : "+Productos.get(i).getPrecio());
            System.out.println();
        }
        System.out.println("El total a pagar es: "+total+" GS.");
    }
    
}
