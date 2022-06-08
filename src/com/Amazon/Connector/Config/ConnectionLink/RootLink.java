package com.Amazon.Connector.Config.ConnectionLink;

import java.util.Scanner;

public abstract class RootLink {


    protected static final String rootLink = "https://www.amazon.com/";
    protected String fullLink = "";
    protected String secondPartLink = "";
    protected Config config = new Config();
    public static TypePage typePage;

    abstract String getConnectionLink();

    public String getFullLink() {
        return fullLink;
    }

    public String toString() {
        if (!fullLink.equals("")) {
            System.out.println("root link not null");
            return fullLink;
        }
        else{
            System.out.println("root link null");
        return getConnectionLink();
        }
    }

    protected class Config {

        protected String enterQuerry() {

            switch (typePage) {
                case TOPCATEGORYASINS -> {
                    System.out.println("Введите ссылку на категорию");
                    break;
                }
                case SEARCHPAGE -> {
                    System.out.println("Введите ключ");
                    break;
                }
                case PRODUCT -> {
                    System.out.println("Введите асин");
                    break;
                }
                default -> System.out.println("Одидаю ввод");
            }
            return new Scanner(System.in).nextLine();
        }

        protected String[] slpitSerarchQearry(String searchQuery) {
            if (searchQuery != null) {
                return searchQuery.split(" ");
            }
            return new Scanner(System.in).nextLine().split(" ");
        }

        protected String createSecondPartLink(String[] splittedSqerry) {
            String secondPartLink = "";
            String plus = "+";

            for (int i = 0; i < splittedSqerry.length; i++) {
                if (i != (splittedSqerry.length - 1)) {
                    secondPartLink += splittedSqerry[i] + plus;
                } else {
                    secondPartLink += splittedSqerry[i];
                }
            }
            return secondPartLink;
        }
    }
}
