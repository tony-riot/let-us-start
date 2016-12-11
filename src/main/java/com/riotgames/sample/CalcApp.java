package com.riotgames.sample;

import java.util.Arrays;

/**
 * Calculator application
 */
public class CalcApp {
    public double calc(String[] tokens) {
        final double firstOperand = Double.parseDouble(tokens[0]);
        final double secondOperand = Double.parseDouble(tokens[1]);

        return firstOperand + secondOperand;

    }

    public static void main( String[] args ) {
        final CalcApp app = new CalcApp();
        final StringBuilder outputs = new StringBuilder();
        Arrays.asList(args).forEach(value -> outputs.append(value + " "));

        System.out.println( "Addition of values: " + outputs + " = " +  app.calc(args));
    }
}
