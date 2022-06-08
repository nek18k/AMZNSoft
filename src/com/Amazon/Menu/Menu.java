package com.Amazon.Menu;

import com.Amazon.Connector.Config.ConnectionLink.RootLink;
import com.Amazon.Connector.Config.ConnectionLink.TypePage;
import com.Amazon.GetterData.PageData.GetFromProductPage;
import com.Amazon.GetterData.PageData.GetFromSearchPage;
import com.Amazon.GetterData.PageData.GetFromTopCategoryPage;


import java.util.Scanner;

public class Menu {
    public static Integer numbOfMenu = 9;

    public int chooseMenuPoint() {
        System.out.println("Выберете пункт меню");
        System.out.println("1 - Парсим асины из выдачи по введённому ключу"
                + "\n2 - Топ 100 аконкурентов по вашей ссылке"
                + "\n3 - Парсим асины из вдачи PP, выбранного асина"
                + "\n0 - выход");
        Scanner scanner = new Scanner(System.in);
        try {
            numbOfMenu = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Вы не ввлеи пункт меню");
            chooseMenuPoint();
            return numbOfMenu;
        }

        System.out.println("numbOfMenu in menu = " + numbOfMenu);
        return numbOfMenu;
    }


    public int menu() {

        switch (chooseMenuPoint()) {

            case 1:
                System.out.println("Парсим асины из выдачи по введённому ключу");
                RootLink.typePage = TypePage.SEARCHPAGE;
                GetFromSearchPage gfsp = new GetFromSearchPage();
//                gfsp.getAsins();
//                gfsp.isEmpty();
                gfsp.setAsinData();
//                gfsp.calculateAVGPrice(gfsp.sumPrice());
//                gfsp.getAsin();
                break;
            case 2:
                System.out.println("Топ 100 аконкурентов по вашей ссылке");
                RootLink.typePage = TypePage.TOPCATEGORYASINS;
                GetFromTopCategoryPage asins = new GetFromTopCategoryPage();
                asins.getasin();
                break;
            case 3:
                System.out.println("Парсим асины из вдачи PP, выбранного асина");
                RootLink.typePage = TypePage.PRODUCT;
                GetFromProductPage asins1 = new GetFromProductPage();
                asins1.getAsins();
                break;
            case 0:
                System.out.println("by");
                return numbOfMenu;
        }

//        gfsp.getAsins();
        return numbOfMenu;
    }
}
