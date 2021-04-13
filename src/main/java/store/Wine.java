package store;

public class Wine {

    public void wine(Integer i, Item[] items) {
        items[i].value = items[i].value + 1;
        items[i].sellIn = items[i].sellIn - 1;
        if (items[i].sellIn < 0) {
            items[i].value = items[i].value + 1;
        }
    }
}
