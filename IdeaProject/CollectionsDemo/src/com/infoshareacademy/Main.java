package com.infoshareacademy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
            List<String> names = new ArrayList<String>();
        names.add("Adam");
        names.add("Zosia");
        names.add("adam");
        names.add("Krzysztof");
        names.add("Ryszard");
        names.add("Adam");
        names.add("Adam");

        for (String name:names) {
            System.out.println(name);
        }

    }
}
