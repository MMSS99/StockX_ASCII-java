package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.List;

public class LastSale implements Criteria {


    @Override
    public List<Offer> checkCriteria(Item sneaker){
        Sales allsales = new Sales();
        List<Offer> allsaleslist = allsales.checkCriteria(sneaker);
        List<Offer> returnList =  allsaleslist.isEmpty() ? List.of() : List.of(allsaleslist.get(allsaleslist.toArray().length-1));
        return returnList;
    }
}
