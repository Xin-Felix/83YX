package store;

public class Ticket {
    public void ticket(Integer i, Item[] items) {
        items[i].value = items[i].value + 1;
        if (items[i].sellIn < 11) {
            items[i].value = items[i].value + 1;
        }
        if (items[i].sellIn < 6) {
            items[i].value = items[i].value + 1;
        }
        items[i].sellIn = items[i].sellIn - 1;
        if (items[i].sellIn < 0) {
            items[i].value = items[i].value - items[i].value;
        }
    }
}
