package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.List;

public class Size implements Criteria{

    String size;

    public Size(String size){
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        return sneaker.getOffers().stream().filter(Offer -> Offer.size().equals(size)).toList();
    }

}
