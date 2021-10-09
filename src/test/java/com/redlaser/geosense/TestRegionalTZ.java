package com.redlaser.geosense;

import junit.framework.TestCase;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestRegionalTZ extends TestCase {
    public void testCreateRegionalTZ() throws IOException {
        InputStream inputStream = new FileInputStream("src/main/java/com/redlaser/geosense/zone.tab");
        RegionalTZ regionalTZ = new RegionalTZ(inputStream);
        // ZoneTab zoneTab = new ZoneTab(inputStream);
        System.out.println(regionalTZ.getTimeZones());
        assertNotNull(regionalTZ); // 1 testcase

        assertNotNull(regionalTZ.getTimeZones()); // return list of TimeZone
    }

}