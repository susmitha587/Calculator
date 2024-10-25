package uk.axone.devintest.maven.calculator;


public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc(5,3);
        System.out.println(calc.add());
        System.out.println(calc.sub());

        }
    }
