/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6;

/**
 *
 * @author klemavilanova
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta cuenta1 = new Conta("Pedro","27C8397k30",1290);
        Conta cuenta2 = new Conta("Alvaro","AG7830383839", 140);
        cuenta1.ingresar(120);
        System.out.println(cuenta1.getSaldo());
        
        cuenta1.reintegrar(2000);
        System.out.println(cuenta1.mostrardatos());
        
        cuenta1.transferencia(cuenta2, 160);
        System.out.println(cuenta1.mostrardatos());
        System.out.println(cuenta2.mostrardatos());

    }
    
}
