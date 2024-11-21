/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalha;

/**
 *
 * @author Aluno
 */
class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 25);
    }

    public void lançarFeitico(Personagem oponente) {
        oponente.vida -= this.ataque * 2;
        System.out.println(this.nome + " lançou um feitiço em " + oponente.nome + " e causou " + (this.ataque * 2) + " de dano!");
    }
}
