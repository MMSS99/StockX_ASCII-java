package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements Criteria{

    Criteria criteriaOne;
    Criteria criteriaTwo;

    AndCriteria(Criteria criteriaOne, Criteria criteriaTwo){
        this.criteriaOne = criteriaOne;
        this.criteriaTwo = criteriaTwo;
    }

    public List<Offer> checkCriteria(Item sneaker){
        List<Offer> appliedCriteriaOne = criteriaOne.checkCriteria(sneaker);
        List<Offer> appliedCriteriaTwo = criteriaTwo.checkCriteria(sneaker);

        return appliedCriteriaOne.stream().filter(appliedCriteriaTwo::contains).toList();
    }
}
