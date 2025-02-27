/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemapagamento;

/**
 *
 * @author Professor
 */
public class SistemaPagamento {

    public static void main(String[] args) {
        CartaoDeCredito card = new CartaoDeCredito("1234567891234567");
        Paypal pay = new Paypal("shaolin_pig_killer@hotmail.com");
        
        card.processarPagamento(999.59);
        pay.processarPagamento(42.00);
    }
}
