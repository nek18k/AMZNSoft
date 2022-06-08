package com.Amazon.Connector.Config.UserAgentSettings;

public class UserAgent {
//" Safari/537.75"
    public static final String searchEngine = "Chrome/";
    public static final String browser = " Chrome/101.0.4951.64";
    public static final String referrerGoogle = "http://www.google.com";

    private static String ip = "161.185.160.";

    public String setIp() {
        Integer lastNumb = (int) (Math.random() * 99);
        return lastNumb.toString();
    }

    public String toString() {
        System.out.println(ip + setIp());

        return searchEngine + ip + setIp() + browser;
    }


}
