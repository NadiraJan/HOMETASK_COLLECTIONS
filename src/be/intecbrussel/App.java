package be.intecbrussel;

import java.util.*;

public class App {
    public static void main(String[] args) {

        Patient patient = new Patient("Yana", 113, false);
        Patient patient1 = new Patient("Dilshad", 11, true);
        Patient patient2 = new Patient("Aviva", 113, false);
        Patient patient3 = new Patient("Jeremy", 100, true);
        Patient patient4 = new Patient("Priyanka", 63, false);
        Patient patient5 = new Patient("Yohana", 80, true);
        Patient patient6 = new Patient("Mehmet", 23, false);
        Patient patient7 = new Patient("Nadira", 13, true);
        Patient patient8 = patient;
        Patient patient9 = new Patient("Aviva", 113, false);
        Patient patient10 = new Patient("Kubra", 23, false);
        Patient patient11 = new Patient("Irina", 13, true);
        Patient patient12 = new Patient("Nihat", 23, false);

        System.out.println(patient2.equals(patient9)); //false
        System.out.println(patient2.hashCode());//1705736037
        System.out.println(patient9.hashCode());//455659002

        System.out.println(patient2.equals(patient9));
        List<Patient> patientList = new ArrayList<>();//2
        patientList.add(patient);
        patientList.add(patient2);
        patientList.add(patient3);
        patientList.add(patient4);
        patientList.add(patient5);
        patientList.add(patient6);
        patientList.add(patient7);
        patientList.add(patient8);
        patientList.add(patient9);
        patientList.add(patient10);
        patientList.add(patient11);
        patientList.add(patient12);

        for (Patient p : patientList) { //1 moeten patient list oproepen van 1 tem 12
            System.out.println(p);
        }
        System.out.println("-------------");
        //   Set<Patient> patientSet = new LinkedHashSet<>();//3
        //  patientSet.addAll(patientList);
        //7: ivp Set doen we TreeSet

        //7:
        Set<Patient> patientSet = new TreeSet<>();
        patientSet.addAll(patientList);  //RESULT geeft een problem:at java.base/
        // java.util.TreeMap.compare(TreeMap.java:1569) enz.
        //Java weet niet hoe te sorteren Patient
        //we moeten gebruiken Comparators

        for (Patient p : patientSet) {
            System.out.println(p);

        }

        System.out.println("---------");

        //4 QUEUE:
        Queue<Patient> patientQueue = new LinkedList<>();
        patientQueue.addAll(patientList);
        patientQueue.poll();//eerstvolgende patient wordt verwijderd
        while (patientQueue.size() > 0) {
            System.out.println("Next patient is " + patientQueue.peek());
            System.out.println("Handling  patient: " + patientQueue.poll());
        }
        //5 MAP:
        Map<String, Patient> rijksregisterNummerPerPatient = new HashMap<>();
        rijksregisterNummerPerPatient.put("45678-545.77", patient);

        for (String RNR : rijksregisterNummerPerPatient.keySet()) {
            System.out.println(RNR + "belongs to: " + rijksregisterNummerPerPatient.get(RNR));

        }


    }
}
