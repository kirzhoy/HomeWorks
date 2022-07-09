package Lesson4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, String> phoneBook = new HashMap<>();

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBook +
                '}';
    }

    public void add(String number, String surname) {
        phoneBook.put(number, surname);
    }

    public void get(String surname) {
      Iterator<Map.Entry<String, String>> iterator = phoneBook.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Object value = entry.getValue();
           if (surname.equals(value)) {
                System.out.println(entry);
                }
        }

    }
}






 /*  2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
           В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get()
           искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
           (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
           Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
           взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов
           проверки телефонного справочника.*/

