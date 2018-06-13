import sun.rmi.transport.ObjectTable;

import java.io.ObjectInput;

public class Fraction {
    private int counter;
    private int denominator;
    double value;

    public void pisz(){
        System.out.println(counter+"/"+denominator);
    }

    public Fraction(double a, double b) {
        this.counter = (int) a;
        this.denominator = (int) b;

        public double getDenominator {
            return pisz();
    }} }







//
//    Stwórz klasę Fraction, która ma 2 pola typu int:
//        counter, denominator, oraz pole typu double: value ok
//
//        Stwórz w tej klasie metodę, która wypisze na
//        ekranie wartość oraz ułamek w postaci:
//        value [counter/denominator] np. 0.5 [1/2]
//
//        Stwórz kilka obiektów typu Fraction
//
//        Wywołaj dla nich powyższą metodę

