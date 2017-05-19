package Question_49_GroupAnagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String copy = new String(str);
            char[] cs = copy.toCharArray();
            Arrays.sort(cs);
            copy = new String(cs);
            if (map.containsKey(copy)) {
                map.get(copy).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(copy, list);
            }
        }
        List<List<String>> listList = new ArrayList<>();
        for (String key : map.keySet()) {
            listList.add(map.get(key));
        }
        return listList;
    }

}
