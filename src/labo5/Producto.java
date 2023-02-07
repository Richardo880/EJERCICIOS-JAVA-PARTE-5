/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo5;

public class Producto {
    private int numproducto;
    private int cantidadvendida;
    private int precio;

    public Producto(int numproducto, int cantidadvendida) {
        this.numproducto = numproducto;
        this.cantidadvendida = cantidadvendida;
        
        switch(numproducto){
            case 1:
                this.precio = cantidadvendida * 10000;
                break;
            case 2:
                this.precio = cantidadvendida * 15000;
                break;
            case 3:
                this.precio = cantidadvendida * 20000;
                break;
            case 4:
                this.precio = cantidadvendida * 25000;
                break;
            case 5:
                this.precio = cantidadvendida * 30000;
                break;
        }
    }

    public int getNumproducto() {
        return numproducto;
    }

    public int getCantidadvendida() {
        return cantidadvendida;
    }

    public int getPrecio() {
        return precio;
    }
    
    
    
    
    
}
