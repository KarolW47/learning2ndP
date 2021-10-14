package pl.astralkarolwaw;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Map<String, String> guestList = new HashMap<>();
        List<String> mealList = new ArrayList<>();

        mealList.add("1.Pizza");
        mealList.add("2.Burger");
        mealList.add("3.Salatka");
        mealList.add("4.Frytki");
        mealList.add("5.Wrap");

        boolean shouldContinue = true;

        while (shouldContinue){
            System.out.println("Wybierz opcje z menu:");
            System.out.println("1.Wyswietl gosci.");
            System.out.println("2.Wyswietl potrawy.");
            System.out.println("3.Dodaj gosca.");
            System.out.println("4.Znajdz po numerze telefonu.");
            System.out.println("5.Wyjscie.");

            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1 -> {
                    System.out.println("Lista gosci:");
                    for (String guest : guestList.values()) {
                        System.out.println(guest);
                    }
                    System.out.println("------------------------");
                }
                case 2 -> {
                    System.out.println("Lista potraw:");
                    for (String meal : mealList) {
                        System.out.println(meal);
                    }
                    System.out.println("------------------------");
                }
                case 3 -> {
                    System.out.println("Podaj imie goscia, ktorego chcesz dodac:");
                    String typedGuest = scanner1.nextLine();
                    System.out.println("Podaj numer telefonu tego gościa:");
                    String typedPhoneNumer = scanner2.nextLine();
                    guestList.put(typedPhoneNumer, typedGuest);
                    System.out.println("------------------------");
                }
                case 4 -> {
                    System.out.println("Podaj numer telefonu szukanego goscia:");
                    String typedPhoneNumber = scanner3.nextLine();
                    System.out.println("Szukany gość to: " + guestList.get(typedPhoneNumber));
                    System.out.println("------------------------");
                }
                case 5 -> {
                    System.out.println("Do zobaczenia.");
                    shouldContinue = false;
                }
            }
        }

    }
}
