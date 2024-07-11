package org.example.benchmark;

import org.example.hashmap.MyHashMap;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 20, time = 1)
@Fork(1)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@OperationsPerInvocation
public class BenchmarkMap {

    private static final int SIZE = 20;
    private Map<Integer, String> hashMap;
    private MyHashMap<Integer, String> myHashMap;

    @Setup
    public void setup() {
        hashMap = new HashMap<>();
        hashMap.put(0, "value0");
        hashMap.put(1, "value1");
        hashMap.put(2, "value2");
        hashMap.put(3, "value3");
        hashMap.put(4, "value4");
        hashMap.put(5, "value5");
        hashMap.put(6, "value6");
        hashMap.put(7, "value7");
        hashMap.put(8, "value8");
        hashMap.put(9, "value9");
        hashMap.put(10, "value10");
        hashMap.put(11, "value11");
        hashMap.put(12, "value12");
        hashMap.put(13, "value13");
        hashMap.put(14, "value14");
        hashMap.put(15, "value15");
        hashMap.put(16, "value16");
        hashMap.put(17, "value17");
        hashMap.put(18, "value18");
        hashMap.put(19, "value19");

        myHashMap = new MyHashMap<>();
        myHashMap.put(0, "value0");
        myHashMap.put(1, "value1");
        myHashMap.put(2, "value2");
        myHashMap.put(3, "value3");
        myHashMap.put(4, "value4");
        myHashMap.put(5, "value5");
        myHashMap.put(6, "value6");
        myHashMap.put(7, "value7");
        myHashMap.put(8, "value8");
        myHashMap.put(9, "value9");
        myHashMap.put(10, "value10");
        myHashMap.put(11, "value11");
        myHashMap.put(12, "value12");
        myHashMap.put(13, "value13");
        myHashMap.put(14, "value14");
        myHashMap.put(15, "value15");
        myHashMap.put(16, "value16");
        myHashMap.put(17, "value17");
        myHashMap.put(18, "value18");
        myHashMap.put(19, "value19");
    }

    @Benchmark
    public void testPutToHashMap(Blackhole blackhole) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "value0");
        hashMap.put(1, "value1");
        hashMap.put(2, "value2");
        hashMap.put(3, "value3");
        hashMap.put(4, "value4");
        hashMap.put(5, "value5");
        hashMap.put(6, "value6");
        hashMap.put(7, "value7");
        hashMap.put(8, "value8");
        hashMap.put(9, "value9");
        hashMap.put(10, "value10");
        hashMap.put(11, "value11");
        hashMap.put(12, "value12");
        hashMap.put(13, "value13");
        hashMap.put(14, "value14");
        hashMap.put(15, "value15");
        hashMap.put(16, "value16");
        hashMap.put(17, "value17");
        hashMap.put(18, "value18");
        hashMap.put(19, "value19");
        blackhole.consume(hashMap);
    }

    @Benchmark
    public void testPutToMyHashMap(Blackhole blackhole) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(0, "value0");
        myHashMap.put(1, "value1");
        myHashMap.put(2, "value2");
        myHashMap.put(3, "value3");
        myHashMap.put(4, "value4");
        myHashMap.put(5, "value5");
        myHashMap.put(6, "value6");
        myHashMap.put(7, "value7");
        myHashMap.put(8, "value8");
        myHashMap.put(9, "value9");
        myHashMap.put(10, "value10");
        myHashMap.put(11, "value11");
        myHashMap.put(12, "value12");
        myHashMap.put(13, "value13");
        myHashMap.put(14, "value14");
        myHashMap.put(15, "value15");
        myHashMap.put(16, "value16");
        myHashMap.put(17, "value17");
        myHashMap.put(18, "value18");
        myHashMap.put(19, "value19");
        blackhole.consume(myHashMap);
    }

    @Benchmark
    public void testGetToHashMap() {
        for (int i = 0; i < SIZE; i++) {
            hashMap.get(i);
        }
    }

    @Benchmark
    public void testGetToMyHashMap() {
        for (int i = 0; i < SIZE; i++) {
            myHashMap.get(i);
        }
    }
}
