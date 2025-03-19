package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.List;

public class LastSale implements Criteria {


    @Override
    public List<Offer> checkCriteria(Item sneaker){
        Sales allsales = new Sales();
        List<Offer> returnList = List.of(allsales.checkCriteria(sneaker).get(-1));
        return returnList;
    }
}
