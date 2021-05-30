package functions;// Code with ❤️
//┌────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK   │
//│ ────────────────────────── │
//│ GokhanOZTURK@AndroidEdu.IO │            
//│ ────────────────────────── │
//│ 23.05.2021                 │
//└────────────────────────────┘

import static functions._1_BasicsKt.print;
import static functions._1_BasicsKt.reformatMessage;

public class Foo {

    public static void main(String[] args) {

        String message = "Message";
        reformatMessage(message, true, 7, "tr");
//
//        reformatMessage(message,  7,  "tr");
//
//        reformatMessage(message, true, 7);
//
//        reformatMessage(message,   7);

        print();
        print("Message");
    }

//    public static void reformatMessage(String message, boolean isUpperCase, int size, String lang){
//        System.out.println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang );
//    }
//
//    public static void reformatMessage(String message, int size, String lang){
//        message = "asdfs";
//        boolean isUpperCase = false;
//        System.out.println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang );
//    }
//
//    public static void reformatMessage(String message, boolean isUpperCase, int size){
//        String lang = "tr";
//        System.out.println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang );
//    }
//
//    public static void reformatMessage(String message, int size){
//        boolean isUpperCase = false;
//        String lang = "tr";
//        System.out.println("Message : " + message + "isUpperCase : " + isUpperCase + "Size : " + size + "lang : " + lang );
//    }

    public void foo(String... messages){

    }
}
