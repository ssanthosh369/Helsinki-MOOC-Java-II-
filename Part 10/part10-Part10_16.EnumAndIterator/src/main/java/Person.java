public class Person {
    private String name;
    private Education edu;

    public Person(String n, Education e) {
        name = n;
        edu = e;
    }

    public Education getEducation() {
        return edu;
    }

    public String toString() {
        return name +", " + edu;
    }

    
}
