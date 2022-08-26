package edu.eci.cvds;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {
    private Registry registry = new Registry();

    @Test
    public void givenAPersonWhenIsOver18ThenVALID() {
        Person person = new Person();
        person.setAge(20);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void givenAPersonWhenIsUnderAgeThenUNDERAGE() {
        Person person = new Person();
        person.setAge(8);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }


    @Test
    public void givenAPersonWhenIsLessThan0ThenINVALID_AGE() {
        Person person = new Person();
        person.setAge(-50);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void givenAPersonWhenIsOver90ThenDEAD() {
        Person person = new Person();
        person.setAge(-50);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }

    // TODO Complete with more test cases


}
