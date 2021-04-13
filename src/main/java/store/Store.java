package store;

public class Store {
    Item[] items;

    public Store(Item[] items) {
        this.items = items;
    }

    public void updateValue() {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Aged Wine": {
                    new Wine().wine(i, items);
                    break;
                }
                case "Show Ticket": {
                    new Ticket().ticket(i, items);
                    break;
                }
                case "Cure": {
                    new Cure().cure(i, items);
                    break;
                }
            }
            if (items[i].value < 0) {
                items[i].value = 0;
            }
            if (items[i].value > 50) {
                items[i].value = 50;
            }
        }
    }

//            * 商品（Item）都有一个销售剩余天数（SellIn），表示该商品必须在该值所代表的天数内销售出去。
//            * 所有商品都有一个Value值，代表商品的价值。
//            * 每过一天，所有商品的SellIn值和Value值都减1。
//            * 一旦过了销售剩余天数，价值就以双倍的速度下滑。
//            * 陈年老酒（Aged Wine）是一种特殊的商品，放得越久，价值反而越高。而且过了销售剩余天数后价值会双倍上涨。
//            * 商品的价值永远不会小于0，也永远不会超过50。
//            * 魔法锤（Sulfuras）是一种传奇商品，其销售剩余天数和品质值都不会变化。
//            * 演出票（Show Ticket）越接近演出日，价值反而上升。在演出前10天，价值每天上升2点；演出前5天，价值每天上升3点。但一旦过了演出日，价值就马上变成0。
//            * 最近因为灾害，我们采购了特效药（Cure）， 特效药的贬值速度是普通物品的两倍，这更加需要尽快升级我们的系统。


}