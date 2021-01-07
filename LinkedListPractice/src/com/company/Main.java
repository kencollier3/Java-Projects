package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Customer customer = new Customer("Tim", 54.93);
//        Customer anotherCustomer;
//        anotherCustomer = customer;
//        anotherCustomer.setBalance(23.55);
//        System.out.println(customer.getName() + " " + customer.getBalance());
//
//        ArrayList<Integer> intList = new ArrayList<>();
//        intList.add(1);
//        intList.add(2);
//        intList.add(3);
//
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(i + ": " + intList.get(i));
//        }
//
//        intList.add(1, 2);
//
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(i + ": " + intList.get(i));
//        }

        LinkedList<String> placesToVisit = new LinkedList<>();
        addInOrder(placesToVisit,"LA");
        addInOrder(placesToVisit,"Chicago");
        addInOrder(placesToVisit,"NYC");
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Tokyo");
        addInOrder(placesToVisit,"Paris");
        addInOrder(placesToVisit,"London");

        printList(placesToVisit);

        placesToVisit.add(1, "Moscow");
        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);

        visit(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        for (String str : linkedList) {
            System.out.println("Now visiting: " + str);
        }
        System.out.println("=====================");
    }

    private static void addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination.");
                return;
            } else if (comparison > 0) {
                //newCity should appear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return;
            }

        }
        stringListIterator.add(newCity);
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()) {
            System.out.println("No cities in the itinerary.");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                            System.out.println("Reached the end of the list");
                        }
                        break;
                case 2:
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list.");
                    }
                    break;
                case 3:
                    printMenu();
                    break;



            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress");
        System.out.println("0 - to quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu options");

    }

}
