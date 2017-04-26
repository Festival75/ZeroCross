package com.festival.zerocross;

public class Game {
    public static void main(String[] args) {
        GameHelper helper = new GameHelper();
        helper.initialField();
        helper.drawField();

        helper.play();


    }
}
