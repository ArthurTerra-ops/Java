package com.kode.projectPattern.Strategy;


import com.kode.projectPattern.Singleton.RequestProcessor;
import com.kode.projectPattern.Strategy.Implementation.ProcessingStrategy;

public class FastProcessingStrategy implements ProcessingStrategy {
    @Override
    public void execute(String request) {
        System.out.println("[FAST PROCESSING] Executando requisição de forma rápida: " + request);
        if (request.equals("login")) {
            System.out.println("\n\nBem vindo(a) ao sistema");
        } else if (request.equals("register")) {
            System.out.println("\n\nRegistro salvo");
            RequestProcessor RequestProcessorInstance = RequestProcessor.getInstance();

            RequestProcessorInstance.process("login");
        } else {
            System.out.println("\n\nSaindo");
        }
    }
}
