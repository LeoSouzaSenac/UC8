/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author Aluno
 */
// Subclasse ClaAkimichi
public class ClaAkimichi extends Cla {
    public ClaAkimichi(String lider) {
        super("Akimichi", lider);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: Ampliação Corporal.");
    }
}
