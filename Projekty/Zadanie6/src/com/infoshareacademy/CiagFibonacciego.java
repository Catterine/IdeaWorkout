package com.infoshareacademy;

import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class CiagFibonacciego {
    public static void main(String[] args) throws java.io.IOException {
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.ONE;
        int n;
        System.out.print("Podaj n: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        n = Integer.parseInt(text);
        FileWriter fw = null;
        try
        {
            fw = new FileWriter("fibo.txt");
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(0);
        }
        fw.write("1\n");
        fw.write("1\n");
        for(int i=2;i<n;i++){
            fw.write(two.add(one)+"\n");
            two=two.add(one);
            one=two.subtract(one);
        }
        if(fw!=null)
            try
            {
                fw.close();
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
    }
}


