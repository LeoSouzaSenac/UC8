/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compras;

/**
 *
 * @author Aluno
 */
public class Livro implements Produto {
    private String nome;
    private double preco;
    
    public Livro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public String getNome() { 
        return nome; 
    }
    
    @Override
    public double getPreco() { 
        return preco; 
    }
}
