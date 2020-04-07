class Receipt {
    String name;
    double price;
    double danok;
    List<Items> items;

    public Receipt(String name, double price, double danok) {
        this.name = name;
        this.price = price;
        this.danok = danok;
        this.items = new ArrayList<>();
    }

    public void dodadiArtikl(Items item) {
        this.items.add(item);
    }

    public double vkupenIznos() {
        double vkupno = 0;
        for (Items i : items) {
            vkupno+=i.getPrice();
        }
        return vkupno;
    }

}