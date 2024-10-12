package org.example.mobile;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact) {
        if (contact == null || contact.getName() ==null ||
                contact.getPhoneNumber() == null ||
                myContacts.contains(contact)) {
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact contactOld, Contact contactNew) {
        if (myContacts.contains(contactOld)) {
            myContacts.set(myContacts.indexOf(contactOld), contactNew);
            return true;
        } else return false;
    }

    public boolean removeContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        } else return false;
    }

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    public int findContact(String name){
        for (int i = 0 ; i < myContacts.size() ; i++){
            if(myContacts.get(i).getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }


    public Contact queryContact(String str){
        Contact query = null;
        for (int i = 0 ; i < myContacts.size(); i++){
            if (myContacts.get(i).getName().equals(str)){
                query = myContacts.get(i);
            } else query = null;
        } 
        return query;
    }

    public void printContact(){
        for (int i = 0 ; i < myContacts.size(); i++){
            System.out.println( (i+1) + ". " + myContacts.get(i).getName() +
                                " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
