package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;

public class Max implements Criteria{

    Criteria comparatorCriteria;
    Criteria typedCriteria; //typed porque es de donde heredo el tipo de objeto real

    Max(Criteria comparatorCriteria, Criteria typedCriteria) {
        this.comparatorCriteria = comparatorCriteria;
        this.typedCriteria = typedCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker){
        List<Offer> listComparatorCriteria = comparatorCriteria.checkCriteria(sneaker);
        List<Offer> listTypedCriteria = typedCriteria.checkCriteria(sneaker);

        return List.of(listTypedCriteria.stream().filter(listComparatorCriteria::contains).max(Comparator.comparing(Offer::value)).get());
    }
}
