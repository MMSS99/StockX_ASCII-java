package edu.estatuas.stockx.item;

public class Sale {

    private final String size;
    private final Integer sale;

    public Sale(String size, Integer bid) {
        this.size = size;
        this.sale = bid;
    }

    public String size(){
        return this.size;
    }

    public int ask(){
        return this.sale;
    }

    public int compareTo(Offer otherOffer){
        return 0;
    }

    @Override
    public String toString() {
        return "Bid{" +
                "size='" + size + '\'' +
                ", bid=" + sale +
                '}';
    }
}
