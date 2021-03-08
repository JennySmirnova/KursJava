package Task4_2;

/*2. Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
У каждой сладости есть название, вес, цена и свой уникальный параметр. Необходимо собрать подарок из сладостей.
Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.*/
/**
 * @author Jenny Smirnova
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        addSweets();
    }
    public static void addSweets() {
        boolean flag = false;
        int sumPrice =0, sumWeight =0;

        ArrayList <Sweets> sweets = new ArrayList();
        Scanner in = new Scanner(System.in);
        System.out.println("Нажмите соответствующую цифру, где: ");
        System.out.println("'1' - Шоколад \"Ritter Sport\"");
        System.out.println("'2' - Шоколад \"Milka\"");
        System.out.println("'3' - Мармелад \"Fruittella\"");
        System.out.println("'4' - Мармелад \"Женькино счастье\"");
        System.out.println("'5' - Конфеты \"Леди День\"");
        System.out.println("'6' - Конфеты \"Леди Ночь\"");
        System.out.println("'7' - Конфеты \"Прохлада с кокосом\"");
        System.out.println("'0' - Закончить");

        while (!flag) {
            int choice = in.nextInt();

            int quantity = 0;// in.nextInt();
            switch (choice) {
                case (1):
                    Chocolate chAlenka = new Chocolate(" \"Ritter Sport\"", 300, 70, "Апельсин");
                    sweets.add(chAlenka);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * chAlenka.getPrice();
                    sumWeight += quantity * chAlenka.getWeight();
                    System.out.println("Шоколад \"Ritter Sport\" добавлен в подарок");
                    break;
                case (2):
                    Chocolate chAlpG = new Chocolate(" \"Milka\"", 400, 100, "Лесной орех");
                    sweets.add(chAlpG);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * chAlpG.getPrice();
                    sumWeight += quantity * chAlpG.getWeight();
                    System.out.println("Шоколад \"Milka\" добавлен в подарок");
                    break;
                case (3):
                    Jellybean jellyHar = new Jellybean(" \"Fruittella\"", 250, 85, "Желтый");
                    sweets.add(jellyHar);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * jellyHar.getPrice();
                    sumWeight += quantity * jellyHar.getWeight();
                    System.out.println("Мармелад \"Fruittella\" добавлен в подарок");
                    break;
                case (4):
                    Jellybean jellyJey = new Jellybean(" \"Женькино счастье\"", 250, 85, "Разноцветный");
                    sweets.add(jellyJey);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * jellyJey.getPrice();
                    sumWeight += quantity * jellyJey.getWeight();
                    System.out.println("Мармелад \"Женькино счастье\" добавлен в подарок");
                    break;
                case (5):
                    Candy candyStep = new Candy (" \"Леди День\"", 100, 150, "С курагой");
                    sweets.add(candyStep);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyStep.getPrice();
                    sumWeight += quantity * candyStep.getWeight();
                    System.out.println("Конфеты \"Леди День\" добавлен в подарок");
                    break;
                case (6):
                    Candy candyTwix = new Candy (" \"Леди Ночь\"", 120, 300, "Чернослив");
                    sweets.add(candyTwix);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyTwix.getPrice();
                    sumWeight += quantity * candyTwix.getWeight();
                    System.out.println("Конфеты \"Леди Ночь\" добавлен в подарок");
                    break;
                case (7):
                    Candy candyMars = new Candy (" \"Прохлада с кокосом\"", 400, 550, "Кокос");
                    sweets.add(candyMars);
                    System.out.println("Введите количество: ");
                    quantity = in.nextInt();
                    sumPrice += quantity * candyMars.getPrice();
                    sumWeight += quantity * candyMars.getWeight();
                    System.out.println("Конфеты \"Прохлада с кокосом\" добавлен в подарок");
                    break;
                case (0): flag = true;
                    break;
            }
        }

        int i = 0;
        System.out.println("\nПодарок состоит из:");
        for (Sweets sweet:sweets) {
            i++;
            System.out.println(i + ". " + sweet.toString());
        }
        System.out.println(String.format("\nВес подарка: %s гр.\nОбщая цена подарка: %s руб.", sumWeight, sumPrice));

    }
}
