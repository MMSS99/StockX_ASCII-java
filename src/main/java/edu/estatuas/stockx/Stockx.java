package edu.estatuas.stockx;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Sneaker;

public class Stockx {

    public static void main(String[] args) {
        /**
         * Crear la zapatilla
         * y printar sus datos.
         *
         * Lee la funcion draw() del main
         * para conocer que propiedades
         * de la zapatilla han de printarse.
         */

        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
        System.out.println(Stockx.draw(sneaker));

        /**
         * Crear bids
         * y añadirlas a la zapatilla
         * en sus offers.
         */

        Bid bid = new Bid("13", 550);
        sneaker.add(bid);
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Bid("9.5", 479));
        sneaker.add(new Bid("13", 338));
        sneaker.add(new Bid("9.5", 480));

        /**
         * Crear asks
         * y añadirlas a la zapatilla
         * en sus offers.
         */

        Ask ask = new Ask("13", 288);
        sneaker.add(ask);
        sneaker.add(new Ask("6", 600));
        sneaker.add(new Ask("9.5", 333));
        sneaker.add(new Ask("9.5", 340));
        sneaker.add(new Ask("13", 330));

    }

    public static String draw(Item sneaker) {
    return
            "\n\n\t\t" + sneaker.getAsk() + " Buy\t"
                    + sneaker.getBid() + " Sell \n" +

                    "\t\t" + " _    _" + "\n" +
                    "\t\t" + "(_\\__/(,_" + "\n" +
                    "\t\t" + "| \\ `_////-._" + "\n" +
                    "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                    "\t\t" + "|=====;__/___./" + "\n" +
                    "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +

                    "\t" + sneaker + "\n" +
                    "\t\tlast sale: " + sneaker.getSale();
    }
}
