package com.Amazon;

import com.Amazon.Menu.Menu;

import static com.Amazon.Menu.Menu.numbOfMenu;

public class Main {
    private static Menu menu = new Menu();

    public static void main(String[] args) {
        while (numbOfMenu!=0){
            menu.menu();
        }
    }
}
