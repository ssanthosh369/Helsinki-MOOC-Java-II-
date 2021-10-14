import java.util.*;
public class Employees {
    private ArrayList<Person> p;

    public Employees() {
        p = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        p.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        while(iterator.hasNext()) {
            p.add(iterator.next());
        }
    }

    public void print() {
        Iterator<Person> iterator = p.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = p.iterator();

        while(iterator.hasNext()) {
            Person x = iterator.next();
            if(x.getEducation() == education) {
                System.out.println(x);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = p.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
