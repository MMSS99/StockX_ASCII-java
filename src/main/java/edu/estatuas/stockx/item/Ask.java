package edu.estatuas.stockx.item;

public class Ask implements Offer {
    private final String size;
    private final Integer ask;

    public Ask(String size, Integer bid) {
        this.size = size;
        this.ask = bid;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.ask;
    }

    @Override
    public String toString() {
        return "\t\t\t" + size + '\t' + ask + '\n';
    }
}
