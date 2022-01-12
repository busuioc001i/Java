package com.step.Main;

import com.step.Main.calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.print("Suma adunarii: " );
        calc.sum(7, 10);
        System.out.print("Diferenta scaderii: " );
        calc.sum2(29, 13);
        System.out.print("Suma inmultirii: " );
        calc.sum3(8, 12);
        System.out.print("Deimpartitul: " );
        calc.sum4(81,9 );




    }
}
