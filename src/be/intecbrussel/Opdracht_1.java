package be.intecbrussel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Opdracht_1 {

    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("enter your int number: ");


        List<Integer> list = new LinkedList<>();
        list.add(0, new Integer(1));
        list.add(0, new Integer(2));
        list.add(0, new Integer(3));


        list.add(kbd.nextInt());

        //

        for (Integer el : list) {
            list.forEach(System.out::println);


        }

    }
}
