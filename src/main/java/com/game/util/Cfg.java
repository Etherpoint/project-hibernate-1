package com.game.util;

public class Cfg {
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static final String DIALECT = "org.hibernate.dialect.MySQL8Dialect";
    private static final String URL = "jdbc:p6spy:mysql://localhost:3306/rpg";
    private static final String DRIVER = "com.p6spy.engine.spy.P6SpyDriver";

    public static String getDIALECT() {
        return DIALECT;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getURL() {
        return URL;
    }

    public static String getDRIVER() {
        return DRIVER;
    }

    public static String getUSER() {
        return USER;
    }
}