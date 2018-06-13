package com.infoshareacademy;

import java.util.HashMap; //pakiety odzielone kropkami//
import java.util.Map;

public class Main {
    public static void main(String[] args) {
                    Map<String, String> myMap = new HashMap<>();

                myMap.put("jkowalski", "Jan Kowalski");
                myMap.put("knowak", "Karol Nowak");
                myMap.put("RLech", "Ryszard Lech");
                myMap.put("a","b");
                for (String login: myMap.keySet()) {
                    System.out.println((login));
        }
    }
}
//set kolejnosc dowolna//

