package edu.estatuas.stockx.item;

public class Bid {
    private final String size;
    private final Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size(){
        return this.size;
    }

    public int bid(){
        return this.bid;
    }

    public int compareTo(Offer otherOffer){
        return 0;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "size='" + size + '\'' +
                ", bid=" + bid +
                '}';
    }
}
