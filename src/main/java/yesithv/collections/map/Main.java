package yesithv.collections.map;

import yesithv.utils.StringUtils;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * MAP:
 * key-value association for dictionaries
 * Can not contain duplicate elements
 *
 *       HashMap: null allowed, without order
 * LinkedHashMap: null allowed, ordered
 *       TreeMap: null don't allowed, key ordered
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> statusCode = new LinkedHashMap<>();
        statusCode.put(200, "Success code");
        statusCode.put(300, "Redirections codes");
        statusCode.put(400, "Client error codes");
        statusCode.put(500, "Server error codes");
        statusCode.put(null, "Allowed");
        System.out.println("statusCode = " + statusCode);
        System.out.println("300: " + statusCode.get(300));
        System.out.println("600: " + statusCode.get(600));

        Map<String, Integer> shopping = new HashMap<>();
        shopping.put("Apple", 12);
        shopping.put("Banana", 8);
        shopping.put("Potato", 4);
        shopping.put(null, 9);
        System.out.println("shopping = " + shopping);
        System.out.println("Contains key Eggs ? = " + shopping.containsKey("Eggs"));
        System.out.println("Contains value 12 ? = " + shopping.containsValue(12));

        Map<Integer, String> ages = new TreeMap<>();
        ages.put(18, "Young");
        ages.put(0, "Baby");
        ages.put(30, "Adult");
        ages.put(65, "Older");
        ages.put(3, "Kid");
        // ages.put(null, "Allowed"); // NullPointEcxeption
        System.out.println("ages = " + ages);
        ages.replace(0, "New born");
        System.out.println("ages = " + ages);

        var upperResult = ages.values().stream()
                .map(s -> s.toUpperCase().concat(" - "))
                .collect(Collectors.joining());
        System.out.println("result = " + upperResult);

        var sumResult = statusCode.entrySet().stream()
                .map(Map.Entry::getKey)
                .filter(integer -> integer != null)
                .mapToInt(value -> value.intValue())
                .sum();
        System.out.println("sumResult = " + sumResult);
    }


}
