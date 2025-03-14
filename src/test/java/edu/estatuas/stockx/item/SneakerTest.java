package edu.estatuas.stockx.item;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SneakerTest {

    @Test
    void testOffers(){
        Item testSneaker = new Sneaker("Va-113-K-4S", "El Sneaker Vallecano");
        Offer testBid = new Bid("6.9", 69);
        Offer testAsk = new Ask("42.0", 420);
        Offer testSale = new Sale("876.6", 8766);

        testSneaker.add(testBid);
        testSneaker.add(testAsk);
        testSneaker.add(testSale);

        assertEquals(testSneaker.getOffers().size(), 3);
        assertEquals(testSneaker.getOffers().get(0), testBid);
        assertEquals(testSneaker.getOffers().get(1), testAsk);
        assertEquals(testSneaker.getOffers().get(2), testSale);

        assertEquals(69, testSneaker.getOffers().get(0).value());
    }

}