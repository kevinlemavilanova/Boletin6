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
public class Conta {
    private String nomeCliente;
    private String numeroConta;
    private double saldo;
    
    public Conta(){}
    
    public Conta(String nomeCliente, String numeroConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public void setCliente(String nome){
        nomeCliente = nome;
    }
    public void setNumeroCuenta(String ncuenta){
        numeroConta = ncuenta;
    }
    public void setSaldo(double saldos){
        saldo = saldos;
    }
    public String getNomeCliente(){
        return nomeCliente;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean ingresar(double cantidad){
        boolean valido = false;
        if(cantidad>0){
            saldo+= cantidad;
            valido = true;
        }
        return valido;
    }
    public boolean reintegrar(double cantidad){
        boolean valido = false;
        if((saldo-cantidad)> 0){
            saldo-= cantidad;
            valido = true;
        }
        return valido;
    }
    public String mostrardatos(){
        return "Nombre "+ nomeCliente +"; Numero conta "+ numeroConta +"; Saldo "+ saldo;
    }
    public void transferencia(Conta cuenta, double cantidade){
        if (cantidade < saldo){
            saldo-= cantidade;
            double saldocuenta = cuenta.getSaldo();
            cuenta.setSaldo(saldocuenta + cantidade);
        }
    }
}
