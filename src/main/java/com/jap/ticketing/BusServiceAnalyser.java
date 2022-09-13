/*
 *Author Name: Nikita Chauhan
 *Date: 13-09-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.jap.ticketing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BusServiceAnalyser {

    int countLines = 0;
    public List<BusService> readFile(String fileName) {
        List<BusService> busServiceList = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String header = bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                countLines++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        System.out.println("count - " + countLines);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                String scheduleNo = data[0].trim();
                String routeNo = data[1].trim();
                int ticketFromStopId = Integer.parseInt(data[2].trim());
                int ticketFromStopSeqNo = Integer.parseInt(data[3].trim());
                int ticketTillStopId = Integer.parseInt(data[4].trim());
                int ticketTillStopSeqNo = Integer.parseInt(data[5].trim());
                String ticketDate = data[6].trim();
                String ticketTime = data[7].trim();
                int totalTicketAmount = Integer.parseInt(data[8].trim());
                double travelledKM = Double.parseDouble(data[9].trim());
                BusService busService = new BusService(scheduleNo,routeNo,ticketFromStopId,ticketFromStopSeqNo,
                        ticketTillStopId,ticketTillStopSeqNo,ticketDate,ticketTime,totalTicketAmount,travelledKM);
                busServiceList.add(busService);
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        return busServiceList;
    }

    public List<BusService> SortTheDistanceTravelledByABus(List<BusService> busServiceList) {
        Collections.sort(busServiceList,((o1, o2) -> Double.compare(o2.getTravelledKM(), o1.getTravelledKM())));
        return busServiceList;
    }




}
