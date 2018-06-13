package com.infoshareacademy;

public interface User {

    static void showInfo() {
        Object admin = new Admin();

        Object dev = new Developer();

        
    }

}

//    Stwórz interfejs User, który posiada pole name oraz metodę showInfo()
//
//    Stwórz klasę Admin oraz Developer, które implementują interfejs User
//
//    Metoda showInfo() powinna wyświetlać napis w formacie name – role, gdzie rola oznacza typ użytkownika (admin, dev)
//
//    Stwórz obiekty obydwu typów
//
//    Ustaw im pola name
//
//    Wywołaj metodę showInfo() dla każego z nich