package modul2;

import java.util.Scanner;

/**
 * Created by Volodymyr Dzhuhalyk on 01.07.2017.
 */
public class HomeWork2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int age;

        System.out.println("Ваше имя: ");
        String name = in.nextLine();

        System.out.println("Ваш город: ");
        String city  = in.nextLine();


        while(true)
        {
            try {
                System.out.println("Ваш возраст: ");;
                age = in.nextInt();
                in.nextLine();
                break;
            } catch (Exception e){
                System.out.println("Возраст введен неправильно!");
                in.nextLine();
            }
        }

        System.out.println("Ваше хобби: ");
        String hobby = in.nextLine();
        System.out.println();

        System.out.println("Имя: " + name);
        System.out.println("Город: " + city);
        System.out.println("Возраст: " + age);
        System.out.println("Хобби: " + hobby);
        System.out.println();

        System.out.println("Человек по имени " + name + " живет в городе " + city + ".\nЭтому человеку " + age + " лет и любит он заниматься " + hobby + ".");
        System.out.println();

        System.out.println(name + " - имя" );
        System.out.println( city + " - город");
        System.out.println(age + " - возраст");
        System.out.println(hobby + " - хобби");

    }

}
