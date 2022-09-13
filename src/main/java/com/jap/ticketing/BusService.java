/*
 *Author Name: Nikita Chauhan
 *Date: 13-09-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.jap.ticketing;

import java.util.Objects;

public class BusService {
    private String scheduleNo;
    private String routeNo;
    private int ticketFromStopId;
    private int ticketFromStopSeqNo;
    private int ticketTillStopId;
    private int ticketTillStopSeqNo;
    private String ticketDate;
    private String  ticketTime;
    private int totalTicketAmount;
    private double travelledKM;

    public BusService() {
    }

    public BusService(String scheduleNo, String routeNo, int ticketFromStopId, int ticketFromStopSeqNo,
                      int ticketTillStopId, int ticketTillStopSeqNo, String ticketDate, String ticketTime,
                      int totalTicketAmount, double travelledKM) {
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

    public String getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(String scheduleNo) {
        this.scheduleNo = scheduleNo;
    }

    public String getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(String routeNo) {
        this.routeNo = routeNo;
    }

    public int getTicketFromStopId() {
        return ticketFromStopId;
    }

    public void setTicketFromStopId(int ticketFromStopId) {
        this.ticketFromStopId = ticketFromStopId;
    }

    public int getTicketFromStopSeqNo() {
        return ticketFromStopSeqNo;
    }

    public void setTicketFromStopSeqNo(int ticketFromStopSeqNo) {
        this.ticketFromStopSeqNo = ticketFromStopSeqNo;
    }

    public int getTicketTillStopId() {
        return ticketTillStopId;
    }

    public void setTicketTillStopId(int ticketTillStopId) {
        this.ticketTillStopId = ticketTillStopId;
    }

    public int getTicketTillStopSeqNo() {
        return ticketTillStopSeqNo;
    }

    public void setTicketTillStopSeqNo(int ticketTillStopSeqNo) {
        this.ticketTillStopSeqNo = ticketTillStopSeqNo;
    }

    public String getTicketDate() {
        return ticketDate;
    }

    public void setTicketDate(String ticketDate) {
        this.ticketDate = ticketDate;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public int getTotalTicketAmount() {
        return totalTicketAmount;
    }

    public void setTotalTicketAmount(int totalTicketAmount) {
        this.totalTicketAmount = totalTicketAmount;
    }

    public double getTravelledKM() {
        return travelledKM;
    }

    public void setTravelledKM(double travelledKM) {
        this.travelledKM = travelledKM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusService that = (BusService) o;
        return ticketFromStopId == that.ticketFromStopId && ticketFromStopSeqNo == that.ticketFromStopSeqNo && ticketTillStopId == that.ticketTillStopId && ticketTillStopSeqNo == that.ticketTillStopSeqNo && totalTicketAmount == that.totalTicketAmount && Double.compare(that.travelledKM, travelledKM) == 0 && Objects.equals(scheduleNo, that.scheduleNo) && Objects.equals(routeNo, that.routeNo) && Objects.equals(ticketDate, that.ticketDate) && Objects.equals(ticketTime, that.ticketTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleNo, routeNo, ticketFromStopId, ticketFromStopSeqNo, ticketTillStopId, ticketTillStopSeqNo, ticketDate, ticketTime, totalTicketAmount, travelledKM);
    }

    @Override
    public String toString() {
        return "BusService{" +
                "scheduleNo='" + scheduleNo + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", ticketFromStopId=" + ticketFromStopId +
                ", ticketFromStopSeqNo=" + ticketFromStopSeqNo +
                ", ticketTillStopId=" + ticketTillStopId +
                ", ticketTillStopSeqNo=" + ticketTillStopSeqNo +
                ", ticketDate='" + ticketDate + '\'' +
                ", ticketTime=" + ticketTime +
                ", totalTicketAmount=" + totalTicketAmount +
                ", travelledKM=" + travelledKM +
                '}';
    }
}
