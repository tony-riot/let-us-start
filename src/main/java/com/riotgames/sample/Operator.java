package com.riotgames.sample;



/**
 * Created by realcoding-18-team 17.4.1
 */
public enum Operator {
    ADD("+") {
        @Override
        public double evaluate(double firstOperand, double secondOperand) {
            return firstOperand + secondOperand;
        }
    },
    SUB("-") {
        @Override
        public double evaluate(double firstOperand, double secondOperand) {
            return firstOperand - secondOperand;
        }
    },
    MUL("*") {
        @Override
        public double evaluate(double firstOperand, double secondOperand) {
            return firstOperand * secondOperand;
        }
    },
    DIV("/") {
        @Override
        public double evaluate(double firstOperand, double secondOperand) {
            return firstOperand / secondOperand;
        }
    };

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }

    public abstract double evaluate(double firstOperand, double secondOperand);

    public static Operator findOperator(String symbol) {
        for (Operator op : values()) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }

        throw new RuntimeException("Invalid operator");
    }
}

