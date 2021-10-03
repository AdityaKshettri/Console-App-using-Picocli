package com.aditya.project;

import lombok.Data;
import picocli.CommandLine.Command;
import picocli.CommandLine.Parameters;

import java.util.List;
import java.util.concurrent.Callable;

@Data
@Command(
        name = "command2",
        mixinStandardHelpOptions = true
)
public class Command2 implements Callable<Integer> {

    @Parameters(description = "positional params")
    private List<String> y;

    @Override
    public Integer call() {
        System.out.println("Successfully executed command2 with y : " + y);
        return null;
    }
}
