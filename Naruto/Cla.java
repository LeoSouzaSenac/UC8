/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author Aluno
 */
// Classe abstrata base
public abstract class Cla {
    protected String nomeDoCla;  // Nome do clã
    protected String lider;       // Nome do líder atual do clã

    // Construtor
    public Cla(String nomeDoCla, String lider) {
        this.nomeDoCla = nomeDoCla;
        this.lider = lider;
    }

    // Método abstrato que deve ser implementado pelas subclasses
    public abstract void habilidadeEspecial();

    // Método concreto que exibe detalhes do clã
    public void exibirDetalhes() {
        System.out.println("Clã: " + nomeDoCla);
        System.out.println("Líder: " + lider);
    }
}
