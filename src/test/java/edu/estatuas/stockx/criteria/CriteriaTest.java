package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriteriaTest {

    Item testSneaker;

    @BeforeEach void setUp() {
        Item testSneaker = new Sneaker("Va-113-K-4S", "El Sneaker Vallecano");
        testSneaker.add(new Bid("4", 28));
        testSneaker.add(new Ask("8", 91));
        testSneaker.add(new Sale("11", 100));
        testSneaker.add(new Bid("7", 47));
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
        assertEquals(testSneaker.getOffers());
    }
}
