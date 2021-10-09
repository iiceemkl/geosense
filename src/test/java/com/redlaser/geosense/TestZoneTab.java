package com.redlaser.geosense;

import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestZoneTab extends TestCase {
    //Jane
    public void testCreateZoneTab() throws IOException {
        InputStream inputStream = new FileInputStream("src/main/java/com/redlaser/geosense/zone.tab");
        ZoneTab zoneTab = new ZoneTab(inputStream);
        System.out.println(zoneTab.getCountries());
        System.out.println(zoneTab.getTimeZones());
        assertNotNull(zoneTab); // 1 testcase

        assertNotNull(zoneTab.getTimeZones()); // return list of TimeZone
    }


}