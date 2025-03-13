package edu.estatuas.stockx.item;

public class Sneaker {

    private final String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;

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

    String getStyle(){
        return style;
    }

    String getName(){
        return name;
    }

    int getSale(){
        return sale;
    }

    int getBid(){
        return bid;
    }

    int getAsk(){
        return ask;
    }
}
