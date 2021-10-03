package com.aditya.project;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(
        mixinStandardHelpOptions = true,
        description = "contains all commands",
        subcommands = {
                Command1.class,
                Command2.class
        }
)
public class MainCommand implements Callable<Integer> {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new MainCommand()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() {
        return null;
    }
}
