package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.*;
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
        testSneaker.add(new Ask("10", 91));
        testSneaker.add(new Sale("14", 1100));
        testSneaker.add(new Bid("9", 29));
        testSneaker.add(new Sale("11", 180));
        testSneaker.add(new Ask("5", 45));
        testSneaker.add(new Ask("10", 1));
        testSneaker.add(new Bid("8", 97));
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

    @Test
    void testSize(){
        Criteria size = new Size("8");
        List<Offer> sizelist = size.checkCriteria(testSneaker);
        assertTrue(sizelist.contains(testSneaker.getOffers().get(1)));
        assertTrue(sizelist.contains(testSneaker.getOffers().get(12)));
    }

    @Test
    void testAndCriteria(){
        Criteria sizes = new Size("8");
        Criteria bids = new Bids();
        Criteria andCriteria = new AndCriteria(sizes, bids);
        List<Offer> sizebidlist = andCriteria.checkCriteria(testSneaker);
        assertEquals(List.of(testSneaker.getOffers().getLast()), sizebidlist);
    }

    @Test
    void testMinMaxDoubleCriteria(){
        Criteria size = new Size("10");
        Criteria asks = new Asks();

        Criteria min = new Min(size, asks);
        List<Offer> minlist = min.checkCriteria(testSneaker);
        assertTrue(minlist.contains(testSneaker.getOffers().get(11)));

        Criteria max = new Max(size, asks);
        List<Offer> maxlist = max.checkCriteria(testSneaker);
        assertTrue(maxlist.contains(testSneaker.getOffers().get(5)));
    }
}
