package com.politecnica.workshops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationTest {

    @Test
    public void sumGreaterThan10MustReturnSuccessfully(){
        //GIVEN
        Operation operation= new Operation();

        //WHEN:
        int result = operation.suma(10,20);

        //THEN:
        assertEquals("La suma debe ser 30",30,result);

    }

    @Test(expected = RuntimeException.class)
    public  void sumLessThan10MustThrowExecption(){
        //GIVEN
        Operation operation= new Operation();

        //WHEN:
        int result = operation.suma(1,3);

        //Must throw an exception for result less than 10
    }
}
