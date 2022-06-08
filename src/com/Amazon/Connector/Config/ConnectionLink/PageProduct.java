package com.Amazon.Connector.Config.ConnectionLink;

public class PageProduct extends RootLink {
    private String asin = "";
    private final static String bodyLink = "dp/";

    public PageProduct() {
        typePage = TypePage.PRODUCT;
    }

    @Override
    String getConnectionLink() {
        setSecondPartLink();
        return fullLink = rootLink + bodyLink + asin;
    }

    protected void setSecondPartLink() {
        asin = config.enterQuerry();
    }
}
