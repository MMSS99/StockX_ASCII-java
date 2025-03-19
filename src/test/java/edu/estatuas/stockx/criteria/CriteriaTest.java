package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CriteriaTest {

    Item testSneaker;

    @BeforeEach
    void setUp() {
        testSneaker = new Sneaker("Va-113-K-4S", "El Sneaker Vallecano");
        testSneaker.add(new Bid("4", 28));
        testSneaker.add(new Ask("8", 91));
        testSneaker.add(new Sale("11", 100));
        testSneaker.add(new Bid("7", 4700));
        testSneaker.add(new Bid("2", 31));
        testSneaker.add(new Ask("10", 912));
        testSneaker.add(new Ask("8", 91));
        testSneaker.add(new Sale("14", 1100));
        testSneaker.add(new Bid("9", 29));
        testSneaker.add(new Sale("11", 180));
        testSneaker.add(new Ask("5", 45));
        testSneaker.add(new Ask("6", 1));
        testSneaker.add(new Ask("8", 97));
    }


    @Test
    void testBids(){
        Criteria bids = new Bids();
        List<Offer> bidlist = bids.checkCriteria(testSneaker);
        assertEquals(testSneaker.getOffers().stream().filter(Offer -> Offer instanceof Bid).toList(), bidlist);
    }

    @Test
    void testAsks(){
        Criteria asks = new Asks();
        List<Offer> asklist = asks.checkCriteria(testSneaker);
        assertEquals(testSneaker.getOffers().stream().filter(Offer -> Offer instanceof Ask).toList(), asklist);
    }

    @Test
    void testSale(){
        Criteria sales = new Sales();
        List<Offer> saleslist = sales.checkCriteria(testSneaker);
        assertEquals(testSneaker.getOffers().stream().filter(Offer -> Offer instanceof Sale).toList(), saleslist);
    }

    @Test
    void testMaxBid(){
        Criteria maxBid = new MaxBid();
        List<Offer> maxbidlist = maxBid.checkCriteria(testSneaker);
        assertEquals(List.of(testSneaker.getOffers().get(3)), maxbidlist);
    }

    @Test
    void testMinAsk(){
        Criteria minAsk = new MinAsk();
        List<Offer> minasklist = minAsk.checkCriteria(testSneaker);
        assertEquals(List.of(testSneaker.getOffers().get(11)), minasklist);
    }

    @Test
    void testLastSale(){
        Criteria lastSale = new LastSale();
        List<Offer> lastsalelist = lastSale.checkCriteria(testSneaker);
        assertEquals(List.of(testSneaker.getOffers().get(9)), lastsalelist);
    }
}
