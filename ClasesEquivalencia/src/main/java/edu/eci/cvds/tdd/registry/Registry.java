package edu.eci.cvds.tdd.registry;

import edu.eci.cvds.Person;
import edu.eci.cvds.RegisterResult;

import java.util.ArrayList;

public class Registry {

    public ArrayList<Person> people;

    public Registry() {
        this.people = new ArrayList<Person>();
    }

    public RegisterResult registerVoter(Person p) {
        if (p.getAge() >=1 & p.getAge() <= 17) return RegisterResult.UNDERAGE;
        if (p.getAge() < 0) return RegisterResult.INVALID_AGE;
        if (p.getAge() > 90) return RegisterResult.DEAD;
        for(Person person : people) {
            if (person.getId() == p.getId()) return RegisterResult.DUPLICATED;
        }

        people.add(p);
        // TODO Validate person and return real result.
        return RegisterResult.VALID;
    }

}

