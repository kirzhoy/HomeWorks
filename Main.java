package Lesson4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("******Задание 1******");
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Ну","почему","почему","почему","был","светофор","зеленый",
                "да","потому","потому","потому","что","был","он","в","жизнь","влюбленный"));
        Set<String> unWords = new HashSet<>(words);
        Iterator<String> iter = unWords.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str + " - " + Collections.frequency(words, str));
         }

        System.out.println("******Задание 2******");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add ("+79166702625", "Смирнов");
        phoneBook.add("+7916670263", "Гусев");
        phoneBook.add("+7917454545", "Иванов");
        phoneBook.add("+7917454589", "Иванов");
        phoneBook.add("+1234567899", "Иванов");
        phoneBook.add("+79174367889", "Иванов");
        phoneBook.add("+79174367889", "Пипкин");


        phoneBook.get("Смирнов");
        phoneBook.get("Иванов");
        phoneBook.get("Пипкин");


    }

}


