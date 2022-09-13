/*
 *Author Name: Nikita Chauhan
 *Date: 13-09-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.jap.ticketing;

public class BusService {
    private String scheduleNo;
    private String routeNo;
    private int ticketFromStopId;
    private int ticketFromStopSeqNo;
    private int ticketTillStopId;
    private int ticketTillStopSeqNo;
    private String ticketDate;
    private double ticketTime;
    private int totalTicketAmount;
    private double travelledKM;

    public BusService() {
    }

    public BusService(String scheduleNo, String routeNo, int ticketFromStopId, int ticketFromStopSeqNo, int ticketTillStopId, int ticketTillStopSeqNo, String ticketDate, double ticketTime, int totalTicketAmount, double travelledKM) {
        this.scheduleNo = scheduleNo;
        this.routeNo = routeNo;
        this.ticketFromStopId = ticketFromStopId;
        this.ticketFromStopSeqNo = ticketFromStopSeqNo;
        this.ticketTillStopId = ticketTillStopId;
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
        this.ticketDate = ticketDate;
        this.ticketTime = ticketTime;
        this.totalTicketAmount = totalTicketAmount;
        this.travelledKM = travelledKM;
    }
}
