/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author Aluno
 */
// Subclasse ClaUchiha
public class ClaUchiha extends Cla {
    public ClaUchiha(String lider) {
        super("Uchiha", lider);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: Sharingan.");
    }
}
