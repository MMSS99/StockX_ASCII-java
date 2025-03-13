package edu.estatuas.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker {

    private final String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;

    private List<Offer> offers = new ArrayList<>();

    public Sneaker(String style, String name){
        this.style = style;
        this.name = name;
    }

    void setSale(int sale){
        this.sale = sale;
    }

    void setBid(int bid) {
        this.bid = bid;
    }

    void setAsk(int ask) {
        this.ask = ask;
    }

    public String getStyle(){
        return style;
    }

    public String getName(){
        return name;
    }

    public int getSale(){
        return sale;
    }

    public int getBid(){
        return bid;
    }

    public int getAsk(){
        return ask;
    }

    void add(Offer offer){
        offers.add(offer);
    }

    public List<Offer> getOffers(){
        return offers;
    }
}
