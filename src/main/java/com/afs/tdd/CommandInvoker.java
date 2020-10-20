package com.afs.tdd;

public class CommandInvoker {
    public void executeOperation(Command command) {
        command.execute();
    }
}
