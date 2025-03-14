package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item sneaker);
}
