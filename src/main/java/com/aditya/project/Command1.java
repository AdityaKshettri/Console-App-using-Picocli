package com.aditya.project;

import lombok.Data;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Data
@Command(
        name = "command1",
        mixinStandardHelpOptions = true
)
public class Command1 implements Callable<Integer> {

    @Option(names = "-x", description = "optional option")
    private String x;

    @Override
    public Integer call() {
        System.out.println("Successfully executed command1 with x : " + x);
        return null;
    }
}
