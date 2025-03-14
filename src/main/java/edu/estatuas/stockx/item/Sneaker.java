package edu.estatuas.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

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

    @Override
    public void setSale(int sale){
        this.sale = sale;
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    }

    public String getStyle(){
        return style;
    }

    public String getName(){
        return name;
    }

    @Override
    public int getSale(){
        return sale;
    }

    @Override
    public int getBid(){
        return bid;
    }

    @Override
    public int getAsk(){
        return ask;
    }

    @Override
    public void add(Offer offer){
        offers.add(offer);
    }

    @Override
    public List<Offer> getOffers(){
        return offers;
    }
}
