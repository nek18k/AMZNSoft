package com.Amazon.Connector;

import com.Amazon.Connector.Config.ConnectionLink.PageProduct;
import com.Amazon.Connector.Config.ConnectionLink.PageSearch;
import com.Amazon.Connector.Config.ConnectionLink.PageTopCategory;
import com.Amazon.Connector.Config.ConnectionLink.RootLink;



import static com.Amazon.Connector.Config.ConnectionLink.RootLink.typePage;

public class Link {

    private RootLink setLink() {
        RootLink link=null;
        System.out.println("set link");
        switch (typePage) {
            case SEARCHPAGE -> {
                return new PageSearch();
            }
            case TOPCATEGORYASINS -> {
                return new PageTopCategory();
            }
            case PRODUCT -> {
                return new PageProduct();
            }
        }
        return null;
    }
    public String toString(){
        return String.valueOf(setLink());
    }
}
