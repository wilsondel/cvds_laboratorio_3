package edu.eci.cvds;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge() >=1 & p.getAge() <= 17) return RegisterResult.UNDERAGE;
        if (p.getAge() < 0) return RegisterResult.INVALID_AGE;
        if (p.getAge() > 90) return RegisterResult.DEAD;

        // TODO Validate person and return real result.
        return RegisterResult.VALID;
    }

}

