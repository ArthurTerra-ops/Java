package com.kode.projectPattern.Singleton;

import com.kode.projectPattern.Handlers.Extension.Handler;

import com.kode.projectPattern.Handlers.*;


import com.kode.projectPattern.Strategy.DetailedProcessingStrategy;
import com.kode.projectPattern.Strategy.FastProcessingStrategy;

public class RequestProcessor {
    private static RequestProcessor instance;
    private Handler chain;

    private RequestProcessor(){
        Handler login = new Login(new FastProcessingStrategy());
        Handler register = new Register(new DetailedProcessingStrategy());
        Handler logout = new LogOut(new FastProcessingStrategy());


        login.setnextHandler(register).setnextHandler(logout);
        this.chain = login;
    };

    public static synchronized RequestProcessor getInstance() {
        if (instance == null) {
            instance = new RequestProcessor();
        }
        return instance;
    }

    public void process(String request) {
        chain.handleRequest(request);
    }

    void test(){
        process("login");
    }
}
