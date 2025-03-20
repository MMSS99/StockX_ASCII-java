package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.List;

public class Asks implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.getOffers().stream().filter(Offer -> Offer instanceof Ask).toList();
    }
}
