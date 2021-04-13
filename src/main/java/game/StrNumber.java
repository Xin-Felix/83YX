package game;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StrNumber {
    private final Integer NUMBER_5 = 5;

    public Integer[] strNumber(String str) {//数字转化并将其从大到小排序
        int[] number = new int[5];
        String[] strArray = str.split("");
        int i;
        Map<String, Integer> map = new HashMap<>(16);
        map.put("T", 10);
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 14);
        for (i = 0; i < NUMBER_5; i++) {
            String c = strArray[i * 3];
            number[i] = map.get(c) == null ? Integer.parseInt(c) : map.get(c);
        }
        Arrays.sort(number);
        Integer[] renumber = new Integer[number.length];
        for (i = 0; i < number.length; i++) {
            renumber[i] = number[number.length - i - 1];
        }
        return renumber;
    }
}
