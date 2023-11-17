/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadecasa;

import modelo.*;

public class Principal {

    public static void main(String[] args) {
        Porta p1 = new Porta(2, 2);
        Porta p2 = new Porta(3, 3);
        p1.abrir();
        
        Casa casa = new Casa(p1, p2);
        casa.pintar("Vermelho");
        
        System.out.println(casa.quantPortasAbertas());
        
        p2.abrir();
        System.out.println(casa.quantPortasAbertas());
        
    }
    
}