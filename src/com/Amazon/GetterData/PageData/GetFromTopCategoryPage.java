package com.Amazon.GetterData.PageData;

import com.Amazon.GetterData.GetPage.PageGetter;
import com.Amazon.GetterData.PageData.ProductData.Product;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class GetFromTopCategoryPage {

    protected PageGetter page = new PageGetter();
    protected Document doc;
    protected Product product= new Product();
    protected ArrayList<Element> block= new ArrayList<>();

    public void getasin() {
        Elements blocks =  page.getPage().getElementsByClass("a-link-normal");
        System.out.println(page.getPage().getElementsByClass("a-link-normal").attr("href"));
        for (int i=0;i<blocks.size();i++){
            String asin = blocks.get(i).attributes().get("a-link-normal");
            if (asin=="")continue;
            System.out.println(blocks.get(i).text());
            block.add(blocks.get(i));
//            System.out.println(i+" "+asin);
        }
    }


}
