package game;

import java.util.*;

// Please don't modify the class name.
public class Poker extends BaseMethodImpl {
    private final String[] TYPE = BaseMethod.TYPE;

    public Integer[] player1Number;
    public Integer[] player2Number;
    public Integer player1Index;
    public Integer player2Index;
    public Integer[] player1ArraySort;
    public Integer[] player2ArraySort;
    public Integer[] player1Repeat;
    public Integer[] player2Repeat;
    public Integer[] player1NoRepeat;
    public Integer[] player2NoRepeat;
    public String player1Type;
    public String player2Type;

    private BaseMethod baseMethod;

    public void init(String player1, String player2) {
        baseMethod = new BaseMethodImpl();
        player1Type = new JudgeType().judgeType(player1);
        player2Type = new JudgeType().judgeType(player2);
        player1Number = new StrNumber().strNumber(player1);
        player2Number = new StrNumber().strNumber(player2);
        player1Index = baseMethod.judgeIndex(player1Type);
        player2Index = baseMethod.judgeIndex(player2Type);
        player1ArraySort = baseMethod.arraySort(player1Number);
        player2ArraySort = baseMethod.arraySort(player2Number);
        player1Repeat = baseMethod.noOrRepeatNumber(player1Number, 0);
        player2Repeat = baseMethod.noOrRepeatNumber(player2Number, 0);
        player1NoRepeat = baseMethod.noOrRepeatNumber(player1Number, 1);
        player2NoRepeat = baseMethod.noOrRepeatNumber(player2Number, 1);
    }

    // Please don't modify the signature of this method.
    // Please keep the result output format.
    public String compairResult(String player1, String player2) {
        String winResult = "";
        init(player1, player2);

        if (player1Index < player2Index) {
            winResult = "player1 wins - " + TYPE[player1Index];
        } else if (player1Index > player2Index) {
            winResult = "player2 wins - " + TYPE[player2Index];
        } else {
            switch (player1Index) {
                case 4:
                case 0:
                    winResult = baseMethod.getString(1, player1Number, player2Number);
                    break;
                case 1:
                case 2:
                    if (player1ArraySort[0] < player2ArraySort[0]) {
                        String sig = baseMethod.intNumber(player2ArraySort[0]);
                        winResult = "player2 wins - high card:" + sig;
                    } else {
                        String sig = baseMethod.intNumber(player1ArraySort[0]);
                        winResult = "player1 wins - high card:" + sig;
                    }
                    break;

                case 5:
                    winResult = baseMethod.getWinResult(1, player1Repeat, player2Repeat, player2NoRepeat);
                    break;
                case 6:
                    winResult = baseMethod.getWinResult(2, player1Repeat, player2Repeat, player2NoRepeat);
                    if (winResult == "") {
                        winResult = baseMethod.getString(1, player1Number, player2Number);
                    }
                    break;
                case 7:
                    if (player1Repeat[0] < player2Repeat[0]) {
                        String sig = baseMethod.intNumber(player2Repeat[0]);
                        winResult = "player2 wins - high card:" + sig;
                    } else if (player1Repeat[0] > player2Repeat[0]) {
                        String sig = baseMethod.intNumber(player1Repeat[0]);
                        winResult = "player1 wins - high card:" + sig;
                    } else {
                        winResult = baseMethod.getString(3, player1Number, player2Number);
                    }
                    break;
                case 3:
                default:
                    winResult = baseMethod.getString(5, player1Number, player2Number);
            }
        }
        return winResult;
    }


}