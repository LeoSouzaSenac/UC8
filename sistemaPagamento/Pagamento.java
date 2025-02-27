/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.sistemapagamento;

/**
 *
 * @author Professor
 */
public interface Pagamento {
    void processarPagamento(double valor);
    String obterDetalhes();
}
