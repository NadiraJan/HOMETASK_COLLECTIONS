import java.util.Comparator;

public class PatientNameSorter implements Comparator<Patient> {
    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


import java.util.Comparator;

public class PatientAgeSorter implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getAge()-o2.getAge();
    }
}

public class CompaApp {
    public static void main(String[] args) {


        NavigableSet<String> dictionary = new TreeSet<>();

        dictionary.add("Bee");
        dictionary.add("snake");
        dictionary.add("lion");
        dictionary.add("aardvark");
        dictionary.add("Snake");
        dictionary.add("snake");

        dictionary.forEach(System.out::println);
    }
}


