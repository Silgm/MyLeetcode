package Question_451_SortCharactersByFrequency;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int position = 0;
        StringBuffer sb = new StringBuffer();
        while (position < s.length()) {
            int max = Integer.MIN_VALUE;
            char c = 0;
            for (Character key : map.keySet()) {
                if (map.get(key) > max) {
                    max = map.get(key);
                    c = key;
                }
            }
            map.replace(c, -1);
            for (int i = 0; i < max; i++) {
                sb.append(c);
            }
            position += max;
        }
        return sb.toString();
    }

}
