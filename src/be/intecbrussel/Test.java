package be.intecbrussel;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {

       

        Queue<Patient> patientQueue = new PriorityQueue<>();
        patientQueue.addAll(patientList);

        patientQueue.forEach(System.out::println);

    }
}
