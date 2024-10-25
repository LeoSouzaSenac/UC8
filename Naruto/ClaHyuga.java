/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author Aluno
 */

// Subclasse ClaHyuga
public class ClaHyuga extends Cla {
    public ClaHyuga(String lider) {
        super("Hyuga", lider);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: Byakugan.");
    }
}
