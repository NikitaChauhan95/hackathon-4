package com.jap.ticketing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BusServiceAnalyserTest {
    BusServiceAnalyser busServiceAnalyser = null;
    BusService busService;
    String fileName = "src/main/resources/sample.csv";

    @BeforeEach
    void setUp() {
        busServiceAnalyser = new BusServiceAnalyser();
        busService = new BusService("KIAS-12/5", "KIAS-12UP", 9387, 1, 11359, 39, "01/09/2018", "02:02:58", 281, 49.3);
    }

    @AfterEach
    void tearDown() {
        busServiceAnalyser = null;
        busService = null;
    }

    @Test
    void readFile() {
        List<BusService> output = busServiceAnalyser.readFile(fileName);
        Assertions.assertEquals(49, output.size());

    }

    @Test
    void SortTheDistanceTravelledByABus() {
        List<BusService> output = busServiceAnalyser.readFile(fileName);
        Assertions.assertEquals(49,output.size());
    }

}