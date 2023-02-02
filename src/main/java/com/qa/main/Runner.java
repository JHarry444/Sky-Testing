package com.qa.main;

import com.github.ricksbrown.cowsay.plugin.CowExecutor;

public class Runner {

    public static void main(String[] args) {
        CowExecutor cow = new CowExecutor();
        cow.setCowfile("vader");
        cow.setMessage("I am your father!");
        System.out.println(cow.execute());
    }
}
