package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    public static List<String> groceryList= new ArrayList<>();

    public static void addItems(String input){
        groceryList.add(input);
        Collections.sort(groceryList);
    }
    public static void removeItems(String input){
        groceryList.remove(input);
        Collections.sort(groceryList);
    }
    public static boolean checkItemIsInList(String product){
       return groceryList.contains(product);
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }

    public void startGrocery(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Uygulama başlatıldı. Lütfen komut giriniz. " +
                "0 - Uygulamayı durdur." +
                "1 - Ürün ekleme" +
                "2 - Ürün çıkarma");
        int num = sc.nextInt();

        if(num == 0) {
            System.out.println("Uygulama durduruldu");
        } else if (num == 1){
            System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
            Scanner str = new Scanner(System.in);
            String nextProduct = str.nextLine();
            String[] productArray = nextProduct.split(",");
            for (String product : productArray) {
                if (!checkItemIsInList(product)) {
                    addItems(product);
                }
            }
        } else if (num == 2) {
            System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
            Scanner str = new Scanner(System.in);
            String nextProduct = str.nextLine();
            String[] productArray = nextProduct.split(",");
            for (String product : productArray) {
                if (checkItemIsInList(product)) {
                    removeItems(product);
                }
            }
        } else {
            System.out.println("Geçersiz komut! Lütfen 0 - 1 - 2 kullanınız.");
        }


    }
}
