package guru.qa;

import java.util.HashMap;
public class MapCollection {
    public static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public static void addElementsOfMap() {
        map.put("Oil filter", 1142850768);
        map.put("Cabin filter", 137185181);
        map.put("Fuel filter", 1332781112);
        map.put("Wiper blade", 616100396);
        System.out.println(map.toString());
    }
    public static void findElementOfMap() {
        if (map.containsKey("Oil filter")) {
            System.out.println("Элемент Oil filter содержит ключ " + map.get("Oil filter"));
        } else {
            System.out.println("Элемент не найден");
        }
    }
    public static void deleteElementOfMap() {
        map.remove("Wiper blade");
        do {
            System.out.println("Элемент Wiper blade удален!");
            break;
        }
        while (map.containsKey("Wiper blade"));
    }

}
