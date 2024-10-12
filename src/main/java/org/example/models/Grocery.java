package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    public static List<String> groceryList= new ArrayList<>();

    public static void addItems(String input){
        String[] addArray = input.split(",");
        for (String product : addArray) {
            product = product.trim();
            if (!checkItemIsInList(product)) {
                groceryList.add(product);
            }
        }
        Collections.sort(groceryList);

    }
    public static void removeItems(String input){
        String[] removeArray = input.split(",");
        for (String product : removeArray) {
            product = product.trim();
            if (checkItemIsInList(product)) {
                groceryList.remove(product);
            }
        }
    }
    public static boolean checkItemIsInList(String product){
       return groceryList.contains(product);
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }

    Scanner sc = new Scanner(System.in);

    public void startGrocery(){
        int num;
        do {
            System.out.println("Uygulama başlatıldı. Lütfen komut giriniz." +
                    " 0 - Uygulamayı durdur." +
                    " 1 - Ürün ekleme" +
                    " 2 - Ürün çıkarma");

            num = sc.nextInt();
            sc.nextLine();
            switch (num){
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String willAdd = sc.nextLine(); //
                    addItems(willAdd);

                    printSorted();
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String willRemove = sc.nextLine();
                    removeItems(willRemove);
                    printSorted();
                    break;
            }
        }
        while (num != 0);

        sc.close();

    }
}
