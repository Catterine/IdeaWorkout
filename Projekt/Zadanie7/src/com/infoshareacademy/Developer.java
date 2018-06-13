package com.infoshareacademy;

public class Developer implements User {

    private static final Developer dev = null;

    public Developer() {
        Developer dev = new Developer();
        dev = Developer.dev;
        System.out.println("Developer");

    }
}



//    Stwórz interfejs User, który posiada pole name oraz metodę showInfo()
//
//        Stwórz klasę Admin oraz Developer, które implementują
// interfejs User
//
//        Metoda showInfo() powinna wyświetlać napis w formacie
// name – role, gdzie rola oznacza typ użytkownika (admin, dev)
//
//        Stwórz obiekty obydwu typów
//
//        Wywołaj metodę showInfo() dla każego z nich

