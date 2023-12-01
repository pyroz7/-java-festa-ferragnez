package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        //creo uno scanner
        Scanner scanner = new Scanner(System.in);

        //creo un array con la lista degli invitati
        String[] nameGuest = {"Dua Lipa","Paris Hilton", "Manuel Agnelli", "J-Ax",
                "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei",
                "Martina Maccherone", "Rachel Zeilic" };
        System.out.println(nameGuest);

        //chiedo all'utente il suo nome
        System.out.print("What's your name? ");
        String nameSearch = scanner.nextLine();

        //cerco il suo nome sulla lista degli invitati
        boolean found = false;
        for (int i = 0; i < nameGuest.length; i++) {
            if (nameSearch == nameGuest[i]);
            found = true;


        } if(!found){
            System.out.println("Not in the list");
        } else {
            System.out.println("Its in the list");
        }


    }
}
