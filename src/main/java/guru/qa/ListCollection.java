package guru.qa;

import java.util.ArrayList;
public class ListCollection {
    public static ArrayList<String> stringList = new ArrayList<>();
    public static void addStringList() {
        stringList.add("06H115105AN");
        stringList.add("06K115225C");
        stringList.add("06L115401J");
        for (String sList: stringList) {
            System.out.print("номер детали " + sList+ " \n");
        }
        System.out.println();
    }
        public static void findStringList(){
            if (stringList.contains("06K115225C")) {
                System.out.println("Это деталь от мотора");
            } else {
                System.out.println("Другая подгруппа детали");
            }
    }
        public static void deleteStringList(){
            stringList.remove(1);
            System.out.println("Остались номера - " + stringList.toString());
            System.out.println();
    }

}

