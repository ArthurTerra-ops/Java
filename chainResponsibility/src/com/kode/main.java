package com.kode;

import com.kode.projectPattern.Singleton.RequestProcessor;

import java.util.Scanner;

class Main {
public static void main(String[] args){
    int valor = 0;
    RequestProcessor RequestProcessorInstance = RequestProcessor.getInstance();

    Scanner scanner = new Scanner(System.in);
    do {


    System.out.println("========================================");
    System.out.println("Digite um valor dentre 1-3\n");

    System.out.println("1 --- Login\n");
    System.out.println("2 --- Register\n");
    System.out.println("3 --- Logout\n");
    System.out.println("4 --- Encerrar sistema\n");
    System.out.println("========================================");

    valor = scanner.nextInt();

    switch (valor){
        case 1:
            System.out.println("request: login\n \n \n");RequestProcessorInstance.process("login"); break;
        case 2: System.out.println("request: register\n \n \n");RequestProcessorInstance.process("register"); break;
        case 3: System.out.println("request: logout\n \n \n");RequestProcessorInstance.process("logout"); break;
        case 4:
            System.out.println("Encerrando");;break;
        default:
            System.out.println("valor inválido"); break;
    }
    } while (valor != 4);

    };
}