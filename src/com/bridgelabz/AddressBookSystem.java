package com.bridgelabz;

import java.util.Scanner;

public class AddressBookSystem extends AddressBook
{
    String firstName, lastName, address, city, state,email;
    Scanner sc = new Scanner(System.in);

    long phoneNo=sc.nextLong();
    int zip;
    public void setDetails(){

        firstName = "Saurabh";
        lastName = "Shinde";
        address = "Dhule";
        city ="Dhule";
        state = "Maharashta";
        zip = 424002;
        email = "mrsaurabhshinde5@gmail.com";
    }
    public void printDetails(){

        System.out.println("\nFirst Name : " + firstName  + "\n\nLast Name : " + lastName + "\n\nAddress : " + address + "\n\nCity : " + city + "\n\nState : " + state + "\n\nZip : " + zip + "\n\nPhone Number : " + phoneNo + "\n\nE-mail : " + email);
    }
}
