package br.edu.ifms.aulaprogramacaocomputadores;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Ex02 {
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    String nome = entrada.next();
    System.out.println("Digite sua Idade: ");
    int idade = entrada.nextInt();
    System.out.println("Digite seu CEP: ");
    int cep = entrada.nextInt();
    System.out.printf("Nome: %s\nIdade: %d\nCEP: %d ",nome,idade,cep);


   



    
    
    }
}
