package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grocery gr = new Grocery();
        Grocery.groceryList.add("tomato");
        Grocery.groceryList.add("potato");
        Grocery.printSorted();
        System.out.println(Grocery.groceryList.size());
        gr.startGrocery();

//        MobilePhone mobilePhone = new MobilePhone("123123123", new ArrayList<>());
//        mobilePhone.addNewContact(new Contact("burak", "123123123123"));
//        mobilePhone.addNewContact(new Contact(null, null));
//        mobilePhone.printContact();
    }


}
