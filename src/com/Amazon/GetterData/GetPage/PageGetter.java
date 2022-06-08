package com.Amazon.GetterData.GetPage;

import com.Amazon.Connector.Connect;
import com.Amazon.Connector.Link;
import org.jsoup.nodes.Document;

public class PageGetter {

    public Document getPage(){
        System.out.println("page getter");
        Connect connect = new Connect();
        return connect.connect(String.valueOf(new Link()));
    }

}
