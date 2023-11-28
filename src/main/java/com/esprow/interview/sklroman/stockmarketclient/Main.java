package com.esprow.interview.sklroman.stockmarketclient;

import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws URISyntaxException {

        String clientId = "client-16";

        WSClient c = new WSClient(new URI("ws://localhost:8080/ws/market/" + clientId));
        c.connect();
    }
}


