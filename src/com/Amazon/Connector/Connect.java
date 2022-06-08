package com.Amazon.Connector;

import com.Amazon.Connector.Config.ConnectionLink.PageSearch;
import com.Amazon.Connector.Config.ConnectionLink.RootLink;
import com.Amazon.Connector.Config.ConnectionLink.TypePage;
import com.Amazon.Connector.Config.UserAgentSettings.UserAgent;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Connect {
    private Document page=null;

    public Document connect(String link) {
        if (link == null) {
            System.out.println("Link = null");
            return null;
        }
        try {
            UserAgent userAgent = new UserAgent();

            Document htmlDocument = Jsoup.connect(link)
                    .userAgent(String.valueOf(userAgent))
                    .referrer(userAgent.referrerGoogle)
                    .get();


            System.out.println(link + " connection successfully");

            return htmlDocument;
        } catch (IOException exception) {
            System.out.println("Eror");
            return page; //null
        }
    }



}
