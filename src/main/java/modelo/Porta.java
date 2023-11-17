/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Porta {
    public boolean aberta;
    public String cor;
    public double altura;
    public double comprimento;
    
    public Porta(double altura, double comprimento){
        this.aberta = false;
        this.altura = altura;
        this.comprimento = comprimento;
    }
    
    public void abrir(){
        this.aberta = true;
    }
    public void fechar(){
        this.aberta = false;
    }
        
    public void pintar(String c){
        this.cor = c;
    }

    public boolean estaAberta(){
        return aberta;
    }
    
}