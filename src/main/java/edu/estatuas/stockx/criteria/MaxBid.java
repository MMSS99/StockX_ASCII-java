package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;

public class MaxBid implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        Bids allbids = new Bids();
        List<Offer> returnList = List.of(allbids.checkCriteria(sneaker).stream().max(Comparator.comparing(Offer::value)).get());
        return returnList;
    }
}
