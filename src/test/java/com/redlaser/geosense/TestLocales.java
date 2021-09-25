package com.redlaser.geosense;

import junit.framework.TestCase;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import junit.framework.Test;

import static junit.framework.Assert.assertEquals;

public class TestLocales extends TestCase {
    // private static Map<String, Locale> locales = new HashMap<String, Locale>();


    public void testget(){
        //may not used for our project
        Locale locale = Locales.get("en_US");
        assertEquals("en_US", locale.toString());
    }

    public void testGetLocals(){

        List<Locale> lo = Locales.getLocales("US"); //get locals that is in US
        System.out.println(lo);
        //assertEquals("en", lo.toString());
        assertTrue(lo.toString().contains("en_US"));
    }

    public void testGetDefaultLocale(){
        //get country name by base local ID
        //FYI see https://www.science.co.il/language/Locale-codes.php
        Locale locale = Locales.getDefaultLocale("TH");
        System.out.println(locale.getDisplayCountry()); // can get another functions
        assertEquals("Thailand",locale.getDisplayCountry());
    }

}