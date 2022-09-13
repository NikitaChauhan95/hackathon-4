/*
 *Author Name: Nikita Chauhan
 *Date: 13-09-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.jap.ticketing;

import java.util.Comparator;

public class DistanceComparator implements Comparator<BusService> {

    @Override
    public int compare(BusService o1, BusService o2) {
        return Double.compare(o1.getTravelledKM(), o2.getTravelledKM());
    }
}
