package com.Amazon.GetterData.PageData;

import com.Amazon.GetterData.GetPage.PageGetter;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetFromProductPage {
    protected PageGetter page = new PageGetter();



    public void getAsins(){
        System.out.println("Finding asins..");
        Elements blocks =  page.getPage().getElementsByClass("a-carousel");
        for (Element elem : blocks){
            System.out.println(elem.getElementsByClass("a-carousel-card"));
        }


    }
}
