package edu.estatuas.stockx.item;

import java.util.List;

public interface Item {

    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale);
    int getBid();
    int getAsk();
    int getSale();

    void add(Offer offer);
    List<Offer> getOffers();

}
