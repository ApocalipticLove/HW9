package guru.qa;

import java.util.HashSet;
public class SetCollection {
    public static HashSet<String> set = new HashSet<String>();
    public static void addSet() {
        set.add("A1121840102");
        set.add("A1221800510");
        set.add("A0259976468");
        set.add("A0001802309");
        for (String set : set) {
            System.out.print("Номера деталей " + set + " \n");
        }
        System.out.println();
    }
    public static void sizeSet() {
        set.size();
        System.out.println("Размер HashSet = " + set.size());
        System.out.println();
    }
    public static void clearSet() {
        set.clear();
        System.out.println("Очищено, размер = " + set.size());
        System.out.println();
    }
}

