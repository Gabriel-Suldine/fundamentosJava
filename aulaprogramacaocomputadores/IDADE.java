/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifms.aulaprogramacaocomputadores;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class IDADE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = entrada.next();
        System.out.println("Informe sua idade");
        int idade = entrada.nextInt();
        System.out.printf("Nome: %s\nIdade: %d anos",nome,idade);

    }

}
