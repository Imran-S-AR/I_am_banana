package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x=5;
        boolean banana;
        boolean pineapple =false;

        System.out.println("Hello World");

        System.out.println(x);

        Scanner meScanner = new Scanner(System.in);

        System.out.println("Press 1 if you are a banana");
        int y = meScanner.nextInt();

        if(y==1){
            banana=true;
        }else {
            banana=false;
            System.out.println("Press 1 if you are a Pineapple");
            int z= meScanner.nextInt();

            if(z==1){
                pineapple=true;
            }
        }

        if(banana==true){
            System.out.println("I am a banana");
        }else if(pineapple==true){
            System.out.println("I am a pineapple");
        }else{
            System.out.println("I am not a banana or a pineapple");
        }
    }
}
