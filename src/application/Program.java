/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Nathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        try {
            System.out.print("Digite a quantidade de alunos do curso A: ");
            int quantidadeAlunos = Integer.parseInt(sc.next());
            set.addAll(insere(quantidadeAlunos));

            System.out.print("Digite a quantidade de alunos do curso B: ");
            quantidadeAlunos = Integer.parseInt(sc.next());
            set.addAll(insere(quantidadeAlunos));

            System.out.print("Digite a quantidade de alunos do curso C: ");
            quantidadeAlunos = Integer.parseInt(sc.next());
            set.addAll(insere(quantidadeAlunos));

            System.out.println("Total de estudantes: " + set.size());
        } catch (NumberFormatException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }

    public static Set<Integer> insere(int quantidadeAlunos) throws NumberFormatException {
        Set<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("id: ");
            int id = Integer.parseInt(sc.next());
            set.add(id);
        }
        return set;
    }

}
