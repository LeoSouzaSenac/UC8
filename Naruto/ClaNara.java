/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Naruto;

/**
 *
 * @author Aluno
 */
// Subclasse ClaNara
public class ClaNara extends Cla {
    public ClaNara(String lider) {
        super("Nara", lider);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial: Manipulação de Sombras.");
    }
}
