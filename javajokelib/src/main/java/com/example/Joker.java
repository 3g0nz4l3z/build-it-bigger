package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joker {

    ArrayList<String> jokes = new ArrayList<String>(){
        {
            add("My friend thinks he is smart. He told me an onion is the only food that makes you cry, so I threw a coconut at his face.");
            add("\n" +
                    "\n" +
                    "What happens to a frog's car when it breaks down?\n" +
                    "It gets toad away.\n");
            add("Q: What did the duck say when he bought lipstick?\n" +
                    "A: \"Put it on my bill." );
        }
    };


    public String getJoke(){
        return jokes.get(new Random().nextInt(jokes.size()-1));
    }
}
