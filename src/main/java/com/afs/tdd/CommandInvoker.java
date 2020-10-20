package com.afs.tdd;

import commands.Command;

public class CommandInvoker {
    public void executeOperation(Command command) {
        command.execute();
    }
}
