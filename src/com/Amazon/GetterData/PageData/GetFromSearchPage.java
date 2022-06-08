package com.Amazon.GetterData.PageData;

import com.Amazon.GetterData.GetPage.PageGetter;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.LinkedList;


public class GetFromSearchPage extends PageData{
    private PageGetter page = new PageGetter();
    protected PageData pageData = new PageData();
    private Elements blocksMayEmpty =  page.getPage().getElementsByClass("s-result-item");
    private LinkedList<Element> clearBlocks = new LinkedList<>();

    //
    private LinkedList<Float> listOfPrice = new LinkedList<>();


    public GetFromSearchPage() {
       isEmpty();
    }
    private void isEmpty(){
        for (Element elem : blocksMayEmpty){
            String data_asin=elem.attr("data-asin");
            if (data_asin!="") {
                clearBlocks.add(elem);
                }
            else continue;
        }
    }
    public void setAsinData(){
        for (int i=0; i<clearBlocks.size();i++){
            Element block=clearBlocks.get(i);
            pageData.product.setAsin(block.attr("data-asin"));
            pageData.product.setPrice(block.getElementsByClass("a-offscreen").text());
            pageData.product
                    .setRevivers(block.getElementsByClass("a-row a-size-small").text());
            pageData.product.getAsin();
//            pageData.product.getPrice();
//            sumPrice(pageData.product.getPrice());
//            listOfPrice.add(Float.parseFloat(getPrice().replace("$","").replace(",","")));

//            pageData.product.getRevivers();
        }
    }

    //TODO сделать сбор ключей по строке поиска

    public float sumPrice(){
//        listOfPrice.add(Float.parseFloat(prices.replace("$","").replace(",","")));
//        System.out.println(listOfPrice);
        float sum = 0;
        for (int i = 0; i < listOfPrice.size(); i++) {
            sum=+listOfPrice.get(i);
        }
        return sum;

    }
    public void calculateAVGPrice(float sum){
        pageData.AVGPrice=sum/listOfPrice.size();
        System.out.println(pageData.AVGPrice);
    }

//    public void getAsins(){
////        Elements blocks =  page.getPage().getElementsByClass("s-result-item");
//        ArrayList<Float> prices = new ArrayList<>();
//        ArrayList<Float> reviews = new ArrayList<>();
//        for (Element elem : blocksMayEmpty){
//            if (elem.attr("data-asin")!="") {
//                String asin = elem.attr("data-asin");
//                pageData.product.setAsin(asin);
//                pageData.product.getAsin();
//                try {
//                    //get price of product
////                    prices.add(Float.parseFloat(elem.getElementsByClass("a-offscreen").get(0).text().replace("$", "")));
//                }
//                catch (IndexOutOfBoundsException IndexOutOfBoundsException){
//                    System.out.println(IndexOutOfBoundsException.getMessage());
//                }
//            }
//            else continue;
//        }
////        System.out.println("prices= "+prices);
//        int p=0;
//        for (int i=0;i<prices.size();i++){
//            p+=prices.get(i);
//
//        }
////        System.out.println("p= "+p);
////        System.out.println("pices size="+prices.size());
////        System.out.println("AVG price = "+p/prices.size());
//
//
//    }


}
