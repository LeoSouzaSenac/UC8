/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Batalha;

/**
 *
 * @author Aluno
 */

import java.util.Scanner;

public class JogoBatalha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criar personagens
        System.out.println("Escolha o nome do seu Guerreiro:");
        String nomeGuerreiro = scanner.nextLine();
        Guerreiro guerreiro = new Guerreiro(nomeGuerreiro);
        

        System.out.println("Escolha o nome do seu Mago:");
        String nomeMago = scanner.nextLine();
        Mago mago = new Mago(nomeMago);

        System.out.println("Escolha o nome do seu Arqueiro:");
        String nomeArqueiro = scanner.nextLine();
        Arqueiro arqueiro = new Arqueiro(nomeArqueiro);

        // Loop de batalha
        while (guerreiro.estaVivo() && mago.estaVivo() && arqueiro.estaVivo()) {
            System.out.println("\nEscolha o personagem para atacar:");
            System.out.println("1. Guerreiro");
            System.out.println("2. Mago");
            System.out.println("3. Arqueiro");
            int escolha = scanner.nextInt();

            System.out.println("Escolha o oponente (1. Guerreiro, 2. Mago, 3. Arqueiro):");
            int oponenteEscolha = scanner.nextInt();

            Personagem atacante = null;
            Personagem oponente = null;

            // Determinar quem ataca
            switch (escolha) {
                case 1:
                    atacante = guerreiro;
                    break;
                case 2:
                    atacante = mago;
                    break;
                case 3:
                    atacante = arqueiro;
                    break;
            }

            // Determinar quem é o oponente
            switch (oponenteEscolha) {
                case 1:
                    oponente = guerreiro;
                    break;
                case 2:
                    oponente = mago;
                    break;
                case 3:
                    oponente = arqueiro;
                    break;
            }

            if (atacante != oponente) {
                atacante.atacar(oponente);
                System.out.println("Vida do " + oponente.nome + ": " + oponente.vida);
            } else {
                System.out.println("Escolha inválida.");
            }

            if (!oponente.estaVivo()) {
                System.out.println(oponente.nome + " foi derrotado!");
                break;
            }
        }
        scanner.close();
    }
}

