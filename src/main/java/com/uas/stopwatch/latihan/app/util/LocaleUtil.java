/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uas.stopwatch.latihan.app.util;


import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author LENOVO
 */
public class LocaleUtil {
    private static Locale currentLocale;
    private static ResourceBundle bundle;

    public static void setLocale(String language, String country) {
        currentLocale = new Locale(language, country);
        bundle = ResourceBundle.getBundle("lang", currentLocale);
    }

    public static String getText(String key) {
        if (bundle == null) {
            // Default ke en_US
            setLocale("en", "US");
        }
        return bundle.getString(key);
    }
}
