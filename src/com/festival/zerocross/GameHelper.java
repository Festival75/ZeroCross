package com.festival.zerocross;

import java.util.Objects;

class GameHelper {

    void checkWinner(String[][] modField) {

        if ((Objects.equals(modField[0][0], "x") && Objects.equals(modField[0][1], "x") && Objects.equals(modField[0][2], "x")) ||
                (Objects.equals(modField[1][0], "x") && Objects.equals(modField[1][1], "x") && Objects.equals(modField[1][2], "x")) ||
                (Objects.equals(modField[2][0], "x") && Objects.equals(modField[2][1], "x") && Objects.equals(modField[2][2], "x")) ||
                (Objects.equals(modField[0][0], "x") && Objects.equals(modField[1][0], "x") && Objects.equals(modField[2][0], "x")) ||
                (Objects.equals(modField[0][1], "x") && Objects.equals(modField[1][1], "x") && Objects.equals(modField[2][1], "x")) ||
                (Objects.equals(modField[0][2], "x") && Objects.equals(modField[1][2], "x") && Objects.equals(modField[2][2], "x")) ||
                (Objects.equals(modField[0][0], "x") && Objects.equals(modField[1][1], "x") && Objects.equals(modField[2][2], "x")) ||
                (Objects.equals(modField[0][2], "x") && Objects.equals(modField[1][1], "x") && Objects.equals(modField[2][0], "x"))) {
            System.out.println("GameOver.Player Win!");
            System.exit(0);
        }
        if ((Objects.equals(modField[0][0], "0") && Objects.equals(modField[0][1], "0") && Objects.equals(modField[0][2], "0")) ||
                (Objects.equals(modField[1][0], "0") && Objects.equals(modField[1][1], "0") && Objects.equals(modField[1][2], "0")) ||
                (Objects.equals(modField[2][0], "0") && Objects.equals(modField[2][1], "0") && Objects.equals(modField[2][2], "0")) ||
                (Objects.equals(modField[0][0], "0") && Objects.equals(modField[1][0], "0") && Objects.equals(modField[2][0], "0")) ||
                (Objects.equals(modField[0][1], "0") && Objects.equals(modField[1][1], "0") && Objects.equals(modField[2][1], "0")) ||
                (Objects.equals(modField[0][2], "0") && Objects.equals(modField[1][2], "0") && Objects.equals(modField[2][2], "0")) ||
                (Objects.equals(modField[0][0], "0") && Objects.equals(modField[1][1], "0") && Objects.equals(modField[2][2], "0")) ||
                (Objects.equals(modField[0][2], "0") && Objects.equals(modField[1][1], "0") && Objects.equals(modField[2][0], "0"))) {
            System.out.println("GameOver.Machine Win!");
            System.exit(0);
        }

    }

    void clrscr() {
        for (long i = 0; i < 99999999; i++) {
            System.out.print((char) 8);
        }
    }
}



