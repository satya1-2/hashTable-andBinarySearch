package hashTable;

import java.util.Map;
import java.util.TreeMap;

public class Frequency_Of_String_Words {
    static void largeCount_freq(String str) {
        Map<String, Integer> mp = new TreeMap<>();
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry :
                mp.entrySet()) {
            System.out.println(entry.getKey() +
                    " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println(" checking large paragraph of frequency : -");
        String string = "“Paranoids are not\n" +
                "paranoid because they are paranoid but\n" +
                "because they keep putting themselves\n" +
                "deliberately into paranoid avoidable\n" +
                "situations”\n" +
                "- Use hashcode to find index of the words in the para";

        largeCount_freq(string);
    }
}