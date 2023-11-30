package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String [] arrayGuests = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

            System.out.println("Digita il tuo nome e cognome");
            String name = scanner.nextLine();

            Boolean match = false;

            for (int i = 0; i < arrayGuests.length && !match ; i++) {

                if (arrayGuests[i].equals(name)){
                    match = true;
                }
            }

            if (match){
                System.out.println("Benvenuto, puoi entrare!");
            } else {
                System.out.println("Vattene via da qui, questa è una festa privata!");
            }

            scanner.close();
        }
    }


