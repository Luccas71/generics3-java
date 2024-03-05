package app;

import java.util.Arrays;
import java.util.List;

public class Main {

     public static void main(String[] args) {
        
        List<Integer> myInts = Arrays.asList(4, 2, 8, 12);
        printList(myInts);
     }


    //  List<?> = representa uma lista com tipo coringa
    // Funciona para todos os tipos 
    // Não permite adicionar elementos à lista
     public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
     }
}