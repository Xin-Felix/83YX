package game;

import java.util.List;
import java.util.Map;

public interface BaseMethod {
    String[] TYPE = {"StraightFlush", "FourOfAKind", "FullHouse", "Flush", "Straight", "ThreeOfAKind", "TwoPair", "OnePair", "HighCard"};

    /**
     * show 介绍
     *
     * @param count           the {@code CharSequence} to check (may be {@code null})
     * @param player1Repeat   the {@code CharSequence} to check (may be {@code null})
     * @param player2Repeat   the {@code CharSequence} to check (may be {@code null})
     * @param player2NoRepeat the {@code CharSequence} to check (may be {@code null})
     */

    String getWinResult(Integer count, Integer[] player1Repeat, Integer[] player2Repeat, Integer[] player2NoRepeat);


    /**
     * show 介绍
     *
     * @param count         the {@code CharSequence} to check (may be {@code null})
     * @param player1Number the {@code CharSequence} to check (may be {@code null})
     * @param player2Number the {@code CharSequence} to check (may be {@code null})
     */


    String getString(Integer count, Integer[] player1Number, Integer[] player2Number);

    /**
     * show 介绍
     *
     * @param i the {@code CharSequence} to check (may be {@code null})
     */


    String intNumber(Integer i);


    /**
     * show 介绍
     *
     * @param number the {@code CharSequence} to check (may be {@code null})
     */

    Integer[] arraySort(Integer[] number);


    /**
     * show 介绍
     *
     * @param number the {@code CharSequence} to check (may be {@code null})
     */

    List<Map.Entry<Integer, Integer>> getListSize(Integer[] number);


    /**
     * show 介绍
     *
     * @param map the {@code CharSequence} to check (may be {@code null})
     */

    List<Map.Entry<Integer, Integer>> getListSize(Map<Integer, Integer> map);

    /**
     * show 介绍
     *
     * @param number the {@code CharSequence} to check (may be {@code null})
     * @param flag   the {@code CharSequence} to check (may be {@code null})
     */

    Integer[] noOrRepeatNumber(Integer[] number, Integer flag);


    /**
     * show 介绍
     *
     * @param strType the {@code CharSequence} to check (may be {@code null})
     */
    Integer judgeIndex(String strType);


}
