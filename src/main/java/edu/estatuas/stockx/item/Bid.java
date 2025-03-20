package edu.estatuas.stockx.item;

public class Bid implements Offer{
    private final String size;
    private final Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.bid;
    }

    @Override
    public String toString() {
        return "\t\t\t" + size + '\t' + bid + '\n';
    }
}
