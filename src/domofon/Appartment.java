package domofon;

import java.util.Scanner;

public class Appartment {
    private int numberAppartment;

    Scanner scanner = new Scanner(System.in);


    public Appartment(int numberAppartment) {
        this.numberAppartment = numberAppartment;
    }

    public int getNumberAppartment() {
        return numberAppartment;
    }

    public void call() {
        System.out.println("Мы звоним в квартиру " + numberAppartment);
        System.out.println("Откріть квартиру = 1, или отелонить = 0 ");
        int question = scanner.nextInt();
        if (question == 1) System.out.println("Проходите, добро пожаловать");
        if (question == 0) System.out.println("Никого нет дома, заходите позже ");
    }


}
