/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapagamento;

/**
 *
 * @author Professor
 */
public class CartaoDeCredito implements Pagamento{
    private String numeroCartao;
    private int codigoSeguranca;

    public CartaoDeCredito (String numCard) {
       this.numeroCartao = numCard;
    }
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado no cartão de final " + this.obterDetalhes() + ".");
    }

    @Override
    public String obterDetalhes() {
        return numeroCartao.substring(numeroCartao.length() - 4);
    }
    
    
}
