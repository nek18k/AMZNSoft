package com.Amazon.Connector.Config.ConnectionLink;

public class PageSearch extends RootLink{

    private final static String keywordsSearchTeg = "s?k=";
    private final static String nextPageUrl_1_ForKeywordSearch = "&page=";
    private final static String nextPageUrl_2_ForKeywordSearch = "&qid=1639680088&ref=sr_pg_";
    private final static String lastPartOfLinkForSearch = "&ref=nb_sb_noss";

    public PageSearch(){
        typePage= TypePage.SEARCHPAGE;
    }

    @Override
    protected String getConnectionLink() {
        setSecondPartLink();
        fullLink = rootLink + keywordsSearchTeg + secondPartLink + lastPartOfLinkForSearch;
        System.out.println("Full link "+fullLink );
        return fullLink;
    }

    protected void setSecondPartLink() {
        System.out.println("set sec part link");
        secondPartLink = config.
                createSecondPartLink(config.
                        slpitSerarchQearry(config.enterQuerry()
                        )
                );
    }

}
