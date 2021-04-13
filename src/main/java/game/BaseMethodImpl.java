package game;

import java.util.*;

public class BaseMethodImpl implements BaseMethod {


    //抽取方法
    @Override
    public String getWinResult(Integer count, Integer[] player1Repeat, Integer[] player2Repeat, Integer[] player2NoRepeat) {
        String winResult = "";
        for (int i = 0; i < count; i++) {
            if (player1Repeat[i] < player2Repeat[i]) {
                winResult = "player2 wins - high card:" + intNumber(player2Repeat[i]);
                break;
            } else if (player1Repeat[i] > player2NoRepeat[i]) {
                winResult = "player1 wins - high card:" + intNumber(player1Repeat[i]);
                break;
            }
        }
        return winResult;
    }

    //抽取方法
    @Override
    public String getString(Integer count, Integer[] player1Number, Integer[] player2Number) {
        String winResult = "";
        for (int i = 0; i < count; i++) {
            if (player1Number[i] < player2Number[i]) {
                winResult = "player2 wins - high card:" + intNumber(player2Number[i]);
                break;
            } else if (player1Number[i] > player2Number[i]) {
                winResult = "player1 wins - high card:" + intNumber(player1Number[i]);
                break;
            } else {
                winResult = "tie";
            }

        }
        return winResult;
    }

    @Override
    public String intNumber(Integer i) {
        String[] strNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};
        return strNumber[i - 2];
    }

    @Override
    public Integer[] arraySort(Integer[] number) {
        List<Map.Entry<Integer, Integer>> list = getListSize(number);
        int size = list.size();
        Integer[] arrayresult = new Integer[size];

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            arrayresult[i] = entry.getKey();
            i++;
        }
        return arrayresult;
    }

    @Override
    public List<Map.Entry<Integer, Integer>> getListSize(Integer[] number) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int value : number) {
            if (map.get(value) != null) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = getListSize(map);
        return list;
    }

    @Override
    public List<Map.Entry<Integer, Integer>> getListSize(Map<Integer, Integer> map) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>();
        list.addAll(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> arg0, Map.Entry<Integer, Integer> arg1) {
                return arg1.getValue().compareTo(arg0.getValue());
            }
        });
        return list;
    }

    @Override
    public Integer[] noOrRepeatNumber(Integer[] number, Integer flag) {//先获得数组中每个元素出现的次数，然后再进行计算出现次数大于1的和出现次数等于1的
        List<Map.Entry<Integer, Integer>> list = getListSize(number);
        int size = list.size();

        int[] repeatnumber = new int[size];

        int[] norepeatnumber = new int[size];
        int i = 0;
        if (flag == 0) {
            for (Map.Entry<Integer, Integer> entry : list) {
                if (entry.getValue() > 1) {
                    repeatnumber[i] = entry.getKey();
                    i++;
                }
            }
        } else {
            for (Map.Entry<Integer, Integer> entry : list) {
                if (entry.getValue() == 1) {
                    norepeatnumber[i] = entry.getKey();
                    i++;
                }
            }
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        if (flag == 0) {
            for (i = 0; i < repeatnumber.length; i++) {
                hashSet.add(repeatnumber[i]);
            }
        } else {
            for (i = 0; i < norepeatnumber.length; i++) {
                hashSet.add(norepeatnumber[i]);
            }
        }
        hashSet.remove(0);
        int[] result = new int[hashSet.size()];
        i = 0;
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            result[i] = iterator.next();
            i++;
        }
        Integer[] reResult = new Integer[result.length];
        for (i = 0; i < result.length; i++) {
            reResult[i] = result[result.length - i - 1];
        }
        return reResult;
    }

    @Override
    public Integer judgeIndex(String strType) {
        int index = -1;

        for (int i = 0, count = 9; i < count; i++) {
            if (TYPE[i].equals(strType)) {
                index = i;
            }
        }
        return index;
    }
}
