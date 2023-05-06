package arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {
    String name;
    String position;
    ArrayList<arrayList.Person> listPerson;

    public Room(String name, String position, ArrayList<Person> listPerson) {
        this.name = name;
        this.position = position;
        this.listPerson = listPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ArrayList<Person> getListPerson() {
        return listPerson;
    }

    public void setListPerson(ArrayList<Person> listPerson) {
        this.listPerson = listPerson;
    }
    public void addPerson(Person person) {
        this.listPerson.add(person);
    }
    public void removePerson(Person person) {
        this.listPerson.remove(person);
    }
}
