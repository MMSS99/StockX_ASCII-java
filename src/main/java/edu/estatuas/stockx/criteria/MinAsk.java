package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        Asks allasks = new Asks();
        List<Offer> returnList = List.of(allasks.checkCriteria(sneaker).stream().min(Comparator.comparing(Offer::value)).get());
        return returnList;
    }
}
