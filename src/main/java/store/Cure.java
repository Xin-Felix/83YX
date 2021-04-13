package store;

public class Cure {


    public void cure(Integer i, Item[] items) {
        int temp = items[i].value - 2;
        items[i].value = temp >= 0 ? temp : 0;
        items[i].sellIn = items[i].sellIn - 1;
        if (items[i].sellIn < 0) {
            temp = items[i].value - 2;
            items[i].value = temp >= 0 ? temp : 0;
        }
    }
}
