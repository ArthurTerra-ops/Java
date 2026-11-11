package com.kode.projectPattern.Handlers;

import com.kode.projectPattern.Handlers.Extension.Handler;

import com.kode.projectPattern.Strategy.Implementation.ProcessingStrategy;

import java.util.Objects;

public class Deposit extends Handler {
    public Deposit(ProcessingStrategy strategy) {
        super(strategy);
    }

    @Override
    protected boolean canHandle(String request) {
        return Objects.equals(request, "deposit");
    }
}
