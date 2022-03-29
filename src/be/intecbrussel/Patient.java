package be.intecbrussel;

//8 add implements Comparable<Patient>
public class Patient implements Comparable<Patient> {
    private String name;
    private int age;
    private boolean infected;

    public Patient(String name, int age, boolean infected) {
        this.name = name;
        this.age = age;
        this.infected = infected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", infected=" + infected +
                '}';
    }
    //8
    @Override
    public int compareTo(Patient o) {
        // return this.getAge()-o.getAge();
        return this.getName().compareTo(o.getName());//8: comparemethod door naam
       // return Boolean.compare(this.isInfected(), o.isInfected());//SORTING BY INFECTED
    }
}