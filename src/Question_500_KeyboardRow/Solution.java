package Question_500_KeyboardRow;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public String[] findWords(String[] words) {
        String[] strings = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> list = new LinkedList<>();
        Map<Character, Integer> map = new HashMap<>();
        int position = 0;
        for (String str : strings) {
            for (char c : str.toCharArray()) {
                map.put(c, position);
            }
            position++;
        }
        for (String str : words) {
            int index = map.get(str.toLowerCase().charAt(0));
            for (char c : str.toLowerCase().toCharArray()) {
                if (map.get(c) != index) {
                    index = -1;
                    break;
                }
            }
            if (index != -1) {
                list.add(str);
            }
        }
        return list.toArray(new String[list.size()]);
    }

}
