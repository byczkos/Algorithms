package org.example;

import org.example.benchmark.BenchmarkMap;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder().include(BenchmarkMap.class.getSimpleName())
                .build();
        new Runner(options).run();
    }
}
