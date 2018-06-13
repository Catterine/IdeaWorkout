package com.infoshareacademy;

import java.util.function.DoubleBinaryOperator;

enum Operation implements DoubleBinaryOperator {
    ;
//    PLUS    ("+", (l, r) -> l + r),
//    MINUS   ("-", (l, r) -> l - r),
//    MULTIPLY("*", (l, r) -> l * r),
//    DIVIDE  ("/", (l, r) -> l / r);

//    private final String symbol;
//    private final DoubleBinaryOperator binaryOperator;
//
//    private Operation(final String symbol, final DoubleBinaryOperator binaryOperator) {
//        this.symbol = symbol;
//        this.binaryOperator = binaryOperator;
//
//    }
//
//    public String getSymbol() {
//        return symbol;
//    }
//
//    @Override
//    public double applyAsDouble(final double left, final double right) {
//        return binaryOperator.applyAsDouble(left, right);



    public static int PLUS(int l, int r) {
        int s = (l + r);
        System.out.println(s);
        return s;
    }
    public static int MINUS(int l, int r) {
        int s = (l - r);
        System.out.println(s);
        return s;

    }
    public static int MULTIPLY(int l, int r) {
        int s = (l * r);
        System.out.println(s);
        return s;

    }
    public static int DIVIDE(int l, int r) {
        int s = (l / r);
        System.out.println(s);
        return s;
    }

    @Override
    public double applyAsDouble(double left, double right) {
        return 0;
    }
}
