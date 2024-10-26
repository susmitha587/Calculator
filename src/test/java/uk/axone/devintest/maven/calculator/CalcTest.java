package uk.axone.devintest.maven.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {
    @Test
    public void addTest(){
        Calc calc = new Calc(5,6);
        Assert.assertEquals(calc.add(),11);
    }
    @Test
    public void subTest(){
        Calc calc = new Calc(5,6);
        Assert.assertEquals(calc.sub(),-1);
    }


}
