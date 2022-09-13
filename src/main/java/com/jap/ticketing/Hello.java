package com.jap.ticketing;

import java.util.List;

public class Hello {

    public static void main(String[] args) {
        BusServiceAnalyser busServiceAnalyser = new BusServiceAnalyser();
        List<BusService> busServiceList = busServiceAnalyser.readFile("src/main/resources/sample.csv");
        System.out.println("busServiceList = " + busServiceList);
        List<BusService> sortDistance = busServiceAnalyser.SortTheDistanceTravelledByABus(busServiceList);
        System.out.println("sortDistance = " + sortDistance);
        int totalCollection = busServiceAnalyser.totalCollectionMadeFromSale();
        System.out.println("totalCollection = " + totalCollection);
    }
}
