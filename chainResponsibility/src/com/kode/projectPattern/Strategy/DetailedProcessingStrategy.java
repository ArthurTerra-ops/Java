package com.kode.projectPattern.Strategy;


import com.kode.projectPattern.Singleton.RequestProcessor;
import com.kode.projectPattern.Strategy.Implementation.ProcessingStrategy;

public class DetailedProcessingStrategy implements ProcessingStrategy {
    @Override
    public void execute(String request) {
        System.out.println("[DETAILED PROCESSING] Iniciando logs detalhados, auditoria e validação profunda para: " + request);
        if (request.equals("login")) {
            System.out.println("\n\nUsuário fez login com sucesso!");
        } else if (request.equals("register")) {
            System.out.println("Usuário registrado com sucesso!" +
                    "\n\n Redirecionando para login...");
            RequestProcessor RequestProcessorInstance = RequestProcessor.getInstance();

            RequestProcessorInstance.process("login");
        } else {
            System.out.println("\n\nUsuário Finalizou a sessão!");
        }

        System.out.println("[DETAILED PROCESSING] Processamento detalhado concluído com sucesso.");
    }
}
