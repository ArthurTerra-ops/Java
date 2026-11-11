package com.kode.projectPattern.Handlers;


import com.kode.projectPattern.Strategy.Implementation.ProcessingStrategy;
import com.kode.projectPattern.Handlers.Extension.Handler;

import java.util.Objects;

public class Register extends Handler{

    public Register(ProcessingStrategy strategy) {
        super(strategy);
    }

    @Override
    protected boolean canHandle(String request) {
        return Objects.equals(request, "register");
    }
}
