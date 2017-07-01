package modul2;

import java.util.Scanner;

/**
 * Created by Volodymyr Dzhuhalyk on 01.07.2017.
 */
public class HomeWork2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Ваше имя: ");
        String name = in.nextLine();

        System.out.print("Ваш город: ");
        String city  = in.nextLine();

        System.out.print("Ваш возраст: ");
        int age = in.nextInt();
        in.nextLine();

        System.out.print("Ваше хобби: ");
        String hobby = in.nextLine();

        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);

    }

}
