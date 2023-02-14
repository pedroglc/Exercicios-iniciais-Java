/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioidade;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class ExercicioIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double idade,dias;
        String nome;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        nome = entrada.next();
        System.out.println("Digite a idade: ");
        idade = entrada.nextDouble();
        dias = idade * 365;
        System.out.println(nome+" tem "+dias+" dias de vida.");
    }
    
}
