package com.redlaser.geosense.shapefile;

import com.redlaser.geosense.GeoSense;
import junit.framework.Assert;
import junit.framework.TestCase;
import java.io.IOException;
import java.net.URL;

public class ShapeFileTest extends TestCase {
    public void testReadShape() throws IOException {

        URL tzroot = GeoSense.class.getResource("tzworld/");
        //URL shpUrl = new URL(tzroot);
        ShapeFile shp = new ShapeFile(tzroot,"tz_world_mp");
        ShapeFileShape shape = shp.readShape();
        System.out.println(shape.getShapeData());
        assertNotNull(shape);
    }

}