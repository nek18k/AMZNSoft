package com.Amazon.Menu.InputData;

import java.util.Scanner;

public class HowMuchPages {

    public int howMuchPages(){
        System.out.println("Сколько страниц хотите получить?");
        return new Scanner(System.in).nextInt();
    }
}
