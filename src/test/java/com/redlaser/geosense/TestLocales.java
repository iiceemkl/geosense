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


    public void testGet(){
        Locale locale = Locales.get("en_za");
        assertNotNull(locale);
        assertEquals("en_ZA", locale.toString());
        assertNotSame("en_US", "en_ZA");
        Locale locale2 = Locales.get(null);
        assertNull("the locale name is null", locale2);
    }

    public void testGetLocals(){
        List<Locale> lo = Locales.getLocales("US"); //get locals that is in US
        System.out.println(lo);
        assertTrue(lo.toString().contains("en_US"));
        List<Locale> lo2 = Locales.getLocales("UK"); //get locals that is in US
        System.out.println(lo2);
        assertTrue(lo2==null);
  }

    public void testGetDefaultLocale(){
        //get country name by base local ID
        //FYI see https://www.science.co.il/language/Locale-codes.php
        Locale locale = Locales.getDefaultLocale("TH");
        System.out.println(locale.getDisplayCountry()); // can get another functions
        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayName());
        assertEquals("Thailand",locale.getDisplayCountry());
    }

}