package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String laptopLenovoIdeapad;
        final int NUM = 1;
        String word = "Lenovo";
        laptopLenovoIdeapad = word +" " + NUM;

        System.out.println(laptopLenovoIdeapad + " " + NUM + " " + word);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (NUM > 0){
            System.out.println("Вы сохранили положительное число");
        }
        else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя");
        String name;
        name = scan.next();
        System.out.println("Привет" +" " + name);

}
}
