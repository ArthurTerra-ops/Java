package com.kode.projectPattern.Handlers.Extension;



import com.kode.projectPattern.Strategy.Implementation.ProcessingStrategy;

public abstract class Handler {
    private Handler nextHandler;
    private ProcessingStrategy strategy;

    public Handler(ProcessingStrategy strategy){
      this.strategy = strategy;
    };

    public Handler setnextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }
    public void handleRequest(String request){
    if (canHandle(request)) {
        strategy.execute(request);
    } else if (nextHandler != null) {
        nextHandler.handleRequest(request);
    } else {
        System.out.println("Status code: 400");
    }
    };

    protected abstract boolean canHandle(String request);
}
