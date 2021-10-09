package com.redlaser.geosense;

import com.redlaser.geosense.shapefile.ShapeType;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestShapeType extends TestCase {
    public void testForCode(){
       Assert.assertEquals("PointM", ShapeType.forCode(21).toString());
       // Assert.assertNotSame("PointX", ShapeType.forCode(21).toString());
    }
}


