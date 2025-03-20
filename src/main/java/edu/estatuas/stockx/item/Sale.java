package edu.estatuas.stockx.item;

public class Sale implements Offer{

    private final String size;
    private final Integer sale;

    public Sale(String size, Integer bid) {
        this.size = size;
        this.sale = bid;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.sale;
    }

    @Override
    public String toString() {
        return "\t\t\t" + size + '\t' + sale + '\n';
    }
}
