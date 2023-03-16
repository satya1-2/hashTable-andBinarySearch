package hashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Frequency_Of_String_Words {
    public static void main(String[] args) {


        String a = "“Paranoids are not\n" +
                "paranoid because they are paranoid but\n" +
                "because they keep putting themselves\n" +
                "deliberately into paranoid avoidable\n" +
                "situations”\n";
        System.out.println(removeOneDuplicate(a));
    }

    public static String removeOneWord(String str, String word) {
        int value = str.indexOf(word);
        String result = str.substring(0, value);
        result += str.substring(value + word.length(), str.length());
        return result;
    }

    public static String removeOneDuplicate(String a) {
        String[] tmp = a.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : tmp) {
            if (map.containsKey(s)) {
                int value = map.get(s);
                if (value == 1)
                    a = removeOneWord(a, s);
                map.put(s, value + 1);
            } else
                map.put(s, 1);
        }
        return a;
    }

}
