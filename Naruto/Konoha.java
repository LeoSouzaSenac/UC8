/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author Aluno
 */
// Classe principal Konoha
public class Konoha {
    public static void main(String[] args) {
        // Criando instâncias de cada clã
        Cla uchiha = new ClaUchiha("Sasuke Uchiha");
        Cla hyuga = new ClaHyuga("Hinata Hyuga");
        Cla nara = new ClaNara("Shikamaru Nara");
        Cla akimichi = new ClaAkimichi("Choji Akimichi");

        // Chamando os métodos habilidadeEspecial() e exibirDetalhes() para cada clã
        Cla[] clanList = {uchiha, hyuga, nara, akimichi};

        for (Cla clan : clanList) {
            clan.exibirDetalhes();
            clan.habilidadeEspecial();
            System.out.println();  // Adiciona uma linha em branco para melhor legibilidade
        }
    }
}
