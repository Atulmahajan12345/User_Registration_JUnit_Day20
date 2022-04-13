package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {
    public static String expected;
    public static String actual;


    UserRegistration test = new UserRegistration();

    @Test
    public void givenFirstNameWithOneUpperCaseAtStart(){
        boolean firstName= test.validateFirstName("Atul");
        Assert.assertEquals(true,firstName);
    }

    @Test
    public void givenLastNameWithOneUpperCaseAtStart(){
        boolean lastName= test.validateLastName("Mahajan");
        Assert.assertEquals(true,lastName);
    }

    @Test
    public void givenValidEmailHas3MandatoryPartsAnd2Optional() {
        boolean email = test.validateEmail("atulmahajan2299@gmail.com");
        Assert.assertEquals(true, email);
    }

   

    @Test
    public void givenPasswordMinimum1NumericUpperCaseLowerCaseAndExact1SpecialCharacterValueAndMinimum8Characters(){
        boolean password = test.validatePassword("Atulmahajan@12");
        Assert.assertEquals(true,password);
    }

    @Test
    public void givenSadMood_ShouldReturnSad(){

         actual =test.analyzeMood("I am In SAD mood"); // ="sad"
         expected ="sad";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void givenAnyMood_ShouldReturnHappy(){
        actual=test.analyzeMood1("I am in Happy mood");
        expected ="happy";
        Assert.assertEquals(expected,actual);
    }
}

