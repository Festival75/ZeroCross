package com.festival.zerocross;

import java.util.Objects;

class AILogic {
    private String aiMove = null;

    String makeSomeLogic(String[][] modField) {
        //начало блока логики компьютера
// 1ряд x x .
        if (Objects.equals(modField[2][0], ".")) {
            if ((Objects.equals(modField[0][0], "x")) && (Objects.equals(modField[1][0], "x"))) {
                aiMove = "c1";
            }
        }
// 2ряд x x .
        if (Objects.equals(modField[2][1], ".")) {
            if ((Objects.equals(modField[0][1], "x")) && (Objects.equals(modField[1][1], "x"))) {
                aiMove = "c2";
            }
        }
// 3ряд x x .
        if (Objects.equals(modField[2][2], ".")) {
            if ((Objects.equals(modField[0][2], "x")) && (Objects.equals(modField[1][2], "x"))) {
                aiMove = "c3";
            }
        }
// 1ряд x . x
        if (Objects.equals(modField[1][0], ".")) {
            if ((Objects.equals(modField[0][0], "x")) && (Objects.equals(modField[2][0], "x"))) {
                aiMove = "b1";
            }
        }
// 2ряд x . x
        if (Objects.equals(modField[1][1], ".")) {
            if ((Objects.equals(modField[0][1], "x")) && (Objects.equals(modField[2][1], "x"))) {
                aiMove = "b2";
            }
        }
// 3ряд x . x
        if (Objects.equals(modField[1][2], ".")) {
            if ((Objects.equals(modField[0][2], "x")) && (Objects.equals(modField[2][2], "x"))) {
                aiMove = "b3";
            }
        }
// 1ряд . x x
        if (Objects.equals(modField[0][0], ".")) {
            if ((Objects.equals(modField[1][0], "x")) && (Objects.equals(modField[2][0], "x"))) {
                aiMove = "a1";
            }
        }
// 2ряд . x x
        if (Objects.equals(modField[0][1], ".")) {
            if ((Objects.equals(modField[1][1], "x")) && (Objects.equals(modField[2][1], "x"))) {
                aiMove = "a2";
            }
        }
// 3ряд . x x
        if (Objects.equals(modField[0][2], ".")) {
            if ((Objects.equals(modField[1][2], "x")) && (Objects.equals(modField[2][2], "x"))) {
                aiMove = "a3";
            }
        }
// 1столбец . x x
        if (Objects.equals(modField[0][0], ".")) {
            if ((Objects.equals(modField[0][1], "x")) && (Objects.equals(modField[0][2], "x"))) {
                aiMove = "a1";
            }
        }
// 2столбец . x x
        if (Objects.equals(modField[1][0], ".")) {
            if ((Objects.equals(modField[1][1], "x")) && (Objects.equals(modField[1][2], "x"))) {
                aiMove = "b1";
            }
        }
// 3столбец . x x
        if (Objects.equals(modField[2][0], ".")) {
            if ((Objects.equals(modField[2][1], "x")) && (Objects.equals(modField[2][2], "x"))) {
                aiMove = "c1";
            }
        }
// 1столбец x . x
        if (Objects.equals(modField[0][1], ".")) {
            if ((Objects.equals(modField[0][0], "x")) && (Objects.equals(modField[0][2], "x"))) {
                aiMove = "a2";
            }
        }
// 2столбец x . x
        if (Objects.equals(modField[1][1], ".")) {
            if ((Objects.equals(modField[1][0], "x")) && (Objects.equals(modField[1][2], "x"))) {
                aiMove = "b2";
            }
        }
// 3столбец x . x
        if (Objects.equals(modField[2][1], ".")) {
            if ((Objects.equals(modField[2][0], "x")) && (Objects.equals(modField[2][2], "x"))) {
                aiMove = "c2";
            }
        }
// 1столбец x x .
        if (Objects.equals(modField[0][2], ".")) {
            if ((Objects.equals(modField[0][1], "x")) && (Objects.equals(modField[0][0], "x"))) {
                aiMove = "a3";
            }
        }
// 2столбец x x .
        if (Objects.equals(modField[1][2], ".")) {
            if ((Objects.equals(modField[1][1], "x")) && (Objects.equals(modField[1][0], "x"))) {
                aiMove = "b3";
            }
        }
// 3столбец x x .
        if (Objects.equals(modField[2][2], ".")) {
            if ((Objects.equals(modField[2][1], "x")) && (Objects.equals(modField[2][0], "x"))) {
                aiMove = "c3";
            }
        }
// возростающая диагональ x x .
        if (Objects.equals(modField[2][0], ".")) {
            if ((Objects.equals(modField[1][1], "x")) && (Objects.equals(modField[0][2], "x"))) {
                aiMove = "c1";
            }
        }
// возростающая диагональ x . x.
        if (Objects.equals(modField[1][1], ".")) {
            if ((Objects.equals(modField[0][2], "x")) && (Objects.equals(modField[2][0], "x"))) {
                aiMove = "b2";
            }
        }
// возростающая диагональ . x x
        if (Objects.equals(modField[0][2], ".")) {
            if ((Objects.equals(modField[1][1], "x")) && (Objects.equals(modField[2][0], "x"))) {
                aiMove = "a3";
            }
        }
// убывающая диагональ x x .
        if (Objects.equals(modField[2][2], ".")) {
            if ((Objects.equals(modField[1][1], "x")) && (Objects.equals(modField[0][0], "x"))) {
                aiMove = "c3";
            }
        }
// убывающая диагональ x . x.
        if (Objects.equals(modField[1][1], ".")) {
            if ((Objects.equals(modField[0][0], "x")) && (Objects.equals(modField[2][2], "x"))) {
                aiMove = "b2";
            }
        }
// убывающая диагональ . x x
        if (Objects.equals(modField[0][0], ".")) {
            if ((Objects.equals(modField[1][1], "x")) && (Objects.equals(modField[2][2], "x"))) {
                aiMove = "a1";
            }
        }

//конец блока логики компьютера
        return aiMove;
    }
}
