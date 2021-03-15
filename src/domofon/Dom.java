package domofon;

import java.util.Scanner;

public class Dom {
    Scanner sc = new Scanner(System.in);
    private Appartment[][] appartments;

    public Dom() {
        System.out.println("Сколько тажей  в доме ?");
        appartments = new Appartment[sc.nextInt()][];

        for (int i = 0; i < appartments.length; i++) {
            System.out.println("Сейчас укажите количество квартир на итом Этаже" + (i + 1));
            Appartment[] floor = new Appartment[sc.nextInt()];
            for (int j = 0; j < floor.length; j++) {
                floor[j] = new Appartment((i + 1) * 10 + (j + 1)); // !!!!!!
                System.out.print(floor[j].getNumberAppartment() + " ");
            }
            appartments[i] = floor;
            System.out.println();
        }
        call();
    }

    private void call() {
        System.out.println("Введите номер квартирЫ, В КОТОРУЮ ХОТИТЕ позвонить ");
        int numberCall = sc.nextInt();
        for (int i = 0; i < appartments.length; i++) {
            for (int j = 0; j < appartments[i].length; j++) {
                if (numberCall == appartments[i][j].getNumberAppartment()) {
                    appartments[i][j].call();
                }
            }
        }
        call();
    }
}
