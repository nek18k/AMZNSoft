package com.Amazon.Connector.Config.ConnectionLink;

public class PageTopCategory extends RootLink {

    private final static String lastPartUrl_ForCategorySearch = "/ref=zg_bs_pg_2?_encoding=UTF8&pg=2";

    public PageTopCategory() {
        typePage = TypePage.TOPCATEGORYASINS;
    }

    @Override
    String getConnectionLink() {
        return fullLink = config.enterQuerry();
    }

}
