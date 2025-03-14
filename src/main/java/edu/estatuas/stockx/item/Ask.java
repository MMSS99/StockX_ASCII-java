package edu.estatuas.stockx.item;

public class Ask {
    private final String size;
    private final Integer ask;

    public Ask(String size, Integer bid) {
        this.size = size;
        this.ask = bid;
    }

    public String size(){
        return this.size;
    }

    public int ask(){
        return this.ask;
    }

    public int compareTo(Offer otherOffer){
        return 0;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "size='" + size + '\'' +
                ", bid=" + ask +
                '}';
    }
}
