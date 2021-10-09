package com.redlaser.geosense;

import junit.framework.TestCase;

import java.io.IOException;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.logging.Logger;

public class TestTZWorld extends TestCase {
    private static TZWorld tzw;
    private static Logger log = Logger.getLogger(GeoSense.class.getName());
    static {
        try {
            tzw = new TZWorld(GeoSense.class.getResource("tzworld/"), "tz_world_mp");
        }
        catch (Exception e) {
            log.severe(e.toString());
        }
    }

    public void testFindTimeZone() {
       // TimeZone TFTZ = tzw.findTimeZone(37.29390,-121.91413);
        TimeZone TFTZ = tzw.findTimeZone(21.315603, -157.858093);
        System.out.println("Result of lat and log is " + TFTZ.getID());
        assertNotNull(TFTZ);
        // assertEquals("America/Los_Angeles", TFTZ.getID());
        assertEquals("Pacific/Honolulu", TFTZ.getID());
    }

    public void testFindTimeZoneExtent(){
        //TZWorld.TZExtent TFTZE = tzw.findTimeZoneExtent(40.730610,-73.935242);
        TZWorld.TZExtent TFTZE = tzw.findTimeZoneExtent(4230, -73.935242);
        System.out.println("Result of lat and log is " + TFTZE.getTimeZone().getID());
        assertNotNull(TFTZE);
        assertEquals("America/New_York", TFTZE.getTimeZone().getID());
    }
}
