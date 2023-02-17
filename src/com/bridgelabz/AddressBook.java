package com.bridgelabz;

public class AddressBook
{
    public static void main(String[] args) {
        System.out.println("Welcome In Address Book System Program ");
        System.out.print("Enter a Phone number: ");
        AddressBookSystem address = new AddressBookSystem();//create object for addressbook class
        address.setDetails();
        address.printDetails();
    }
}
