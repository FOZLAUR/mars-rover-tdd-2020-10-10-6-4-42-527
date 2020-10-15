package com.afs.tdd;

import java.util.Arrays;
import java.util.List;

public class CommandSplitter {
    private String input;

    public CommandSplitter(String input){
        this.input = input;
    }

    public List<String> getCommandList() throws CommandNotDefinedException {
        if(input.matches("^[MLR]*$")) {
            return Arrays.asList(input.split(""));
        } else {
            throw new CommandNotDefinedException();
        }
    }
}
