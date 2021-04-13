package game;

import java.util.HashSet;

public class JudgeType {

    private final Integer NUMBER_5_1 = 5;

    private final Integer NUMBER_5_2 = 5;

    private final Integer NUMBER_5_3 = 5;


    private final Integer NUMBER_4_1 = 4;
    private final Integer NUMBER_4_2 = 4;
    private final Integer NUMBER_4_3 = 4;
    private final Integer NUMBER_4_4 = 4;
    private final Integer NUMBER_4_5 = 4;
    private final Integer NUMBER_4_6 = 4;

    private final Integer NUMBER_3_1 = 3;

    private final Integer NUMBER_3_2 = 3;

    public String judgeType(String str) {
        String type = "";
        String[] strArray = str.split("");
        Integer[] number = new StrNumber().strNumber(str);
        int i;
        String[] color = new String[NUMBER_5_1];

        HashSet<Integer> hashSetNumber = new HashSet<>();

        HashSet<String> hashSetType = new HashSet<>();
        for (i = 0; i < NUMBER_5_2; i++) {
            color[i] = strArray[i * 3 + 1];
            hashSetNumber.add(number[i]);
            hashSetType.add(color[i]);
        }
        if (hashSetNumber.size() == NUMBER_5_3) {
            if ((number[0] - number[NUMBER_4_1] == NUMBER_4_2) && (hashSetType.size() == 1)) {
                type = "StraightFlush";
            } else if (number[0] - number[NUMBER_4_3] == NUMBER_4_4) {
                type = "Straight";
            } else if (hashSetType.size() == 1) {
                type = "Flush";
            } else {
                type = "HighCard";
            }
        } else if (hashSetNumber.size() == NUMBER_4_5) {
            type = "OnePair";
        } else if (hashSetNumber.size() == NUMBER_3_1) {
            type = ((number[0] == number[1] || number[1] == number[2]) && (number[2] == number[3] || number[3] == number[4])) ? "TwoPair" : "ThreeOfAKind";
        } else {
            if (number[0] != number[1] || number[NUMBER_3_2] != number[NUMBER_4_6]) {
                type = "FourOfAKind";
            } else {
                type = "FullHouse";
            }
        }
        return type;
    }
}
