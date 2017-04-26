package com.festival.zerocross;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class GameHelper {
    public ArrayList<String> verifList = new ArrayList<>();
    private String[][] modField = new String[3][3];

    public String[][] initialField() {


        verifList.add(0, "a1");
        verifList.add(1, "a2");
        verifList.add(2, "a3");
        verifList.add(3, "b1");
        verifList.add(4, "b2");
        verifList.add(5, "b3");
        verifList.add(6, "c1");
        verifList.add(7, "c2");
        verifList.add(8, "c3");

        modField[0][0] = ".";
        modField[0][1] = ".";
        modField[0][2] = ".";
        modField[1][0] = ".";
        modField[1][1] = ".";
        modField[1][2] = ".";
        modField[2][0] = ".";
        modField[2][1] = ".";
        modField[2][2] = ".";

        return modField;

    }

    void drawField() {

        System.out.println("1| " + modField[0][0] + "  " + modField[1][0] + "  " + modField[2][0] + " |");
        System.out.println("2| " + modField[0][1] + "  " + modField[1][1] + "  " + modField[2][1] + " |");
        System.out.println("3| " + modField[0][2] + "  " + modField[1][2] + "  " + modField[2][2] + " |");
        System.out.println("   -  -  -");
        System.out.println("   a  b  c");
        System.out.println("Доступные ходы: " + verifList);
    }

    private String getUserInput() {
        String inputLane = null;

        System.out.println("Введите свой ход:");
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputLane = is.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputLane.toLowerCase();
    }

    String[][] play() {
        boolean weHaveAWinner = false;
        String[][] mField = new String[3][3];
        while (!verifList.isEmpty()) {
            String winner = null;
            String inputLane = getUserInput();
            switch (inputLane) {
                case ("a1"):
                    modField[0][0] = "x";
                    verifList.remove("a1");
                    break;
                case ("a2"):
                    modField[0][1] = "x";
                    verifList.remove("a2");
                    break;
                case ("a3"):
                    modField[0][2] = "x";
                    verifList.remove("a3");
                    break;
                case ("b1"):
                    modField[1][0] = "x";
                    verifList.remove("b1");
                    break;
                case ("b2"):
                    modField[1][1] = "x";
                    verifList.remove("b2");
                    break;
                case ("b3"):
                    modField[1][2] = "x";
                    verifList.remove("b3");
                    break;
                case ("c1"):
                    modField[2][0] = "x";
                    verifList.remove("c1");
                    break;
                case ("c2"):
                    modField[2][1] = "x";
                    verifList.remove("c2");
                    break;
                case ("c3"):
                    modField[2][2] = "x";
                    verifList.remove("c3");
                    break;
            }

            if (verifList.isEmpty()){
                System.out.println("Game Over");
                System.exit(0);
            }

            int rnd;
            String aiMove;
            rnd = (int) (Math.random() * verifList.size());
            aiMove = verifList.get(rnd);
//начало блока логики компьютера
// 1ряд x x .
            if (modField[2][0] == ".") {
                if ((modField[0][0] == "x") && (modField[1][0] == "x")) {
                    aiMove = "c1";
                }
            }
// 2ряд x x .
            if (modField[2][1] == ".") {
                if ((modField[0][1] == "x") && (modField[1][1] == "x")) {
                    aiMove = "c2";
                }
            }
// 3ряд x x .
            if (modField[2][2] == ".") {
                if ((modField[0][2] == "x") && (modField[1][2] == "x")) {
                    aiMove = "c3";
                }
            }
// 1ряд x . x
            if (modField[1][0] == ".") {
                if ((modField[0][0] == "x") && (modField[2][0] == "x")) {
                    aiMove = "b1";
                }
            }
// 2ряд x . x
            if (modField[1][1] == ".") {
                if ((modField[0][1] == "x") && (modField[2][1] == "x")) {
                    aiMove = "b2";
                }
            }
// 3ряд x . x
            if (modField[1][2] == ".") {
                if ((modField[0][2] == "x") && (modField[2][2] == "x")) {
                    aiMove = "b3";
                }
            }
// 1ряд . x x
            if (modField[0][0] == ".") {
                if ((modField[1][0] == "x") && (modField[2][0] == "x")) {
                    aiMove = "a1";
                }
            }
// 2ряд . x x
            if (modField[0][1] == ".") {
                if ((modField[1][1] == "x") && (modField[2][1] == "x")) {
                    aiMove = "a2";
                }
            }
// 3ряд . x x
            if (modField[0][2] == ".") {
                if ((modField[1][2] == "x") && (modField[2][2] == "x")) {
                    aiMove = "a3";
                }
            }
// 1столбец . x x
            if (modField[0][0] == ".") {
                if ((modField[0][1] == "x") && (modField[0][2] == "x")) {
                    aiMove = "a1";
                }
            }
// 2столбец . x x
            if (modField[1][0] == ".") {
                if ((modField[1][1] == "x") && (modField[1][2] == "x")) {
                    aiMove = "b1";
                }
            }
// 3столбец . x x
            if (modField[2][0] == ".") {
                if ((modField[2][1] == "x") && (modField[2][2] == "x")) {
                    aiMove = "c1";
                }
            }
// 1столбец x . x
            if (modField[0][1] == ".") {
                if ((modField[0][0] == "x") && (modField[0][2] == "x")) {
                    aiMove = "a2";
                }
            }
// 2столбец x . x
            if (modField[1][1] == ".") {
                if ((modField[1][0] == "x") && (modField[1][2]== "x")) {
                    aiMove = "b2";
                }
            }
// 3столбец x . x
            if (modField[2][1] == ".") {
                if ((modField[2][0] == "x") && (modField[2][2] == "x")) {
                    aiMove = "c2";
                }
            }
// 1столбец x x .
            if (modField[0][2] == ".") {
                if ((modField[0][1] == "x") && (modField[0][0] == "x")) {
                    aiMove = "a3";
                }
            }
// 2столбец x x .
            if (modField[1][2] == ".") {
                if ((modField[1][1] == "x") && (modField[1][0] == "x")) {
                    aiMove = "b3";
                }
            }
// 3столбец x x .
            if (modField[2][2] == ".") {
                if ((modField[2][1] == "x") && (modField[2][0] == "x")) {
                    aiMove = "c3";
                }
            }
// возростающая диагональ x x .
            if (modField[2][0] == ".") {
                if ((modField[1][1] == "x") && (modField[0][2] == "x")) {
                    aiMove = "c1";
                }
            }
// возростающая диагональ x . x.
            if (modField[1][1] == ".") {
                if ((modField[0][2] == "x") && (modField[2][0] == "x")) {
                    aiMove = "b2";
                }
            }
// возростающая диагональ . x x
            if (modField[0][2] == ".") {
                if ((modField[1][1] == "x") && (modField[2][0] == "x")) {
                    aiMove = "a3";
                }
            }
// убывающая диагональ x x .
            if (modField[2][2] == ".") {
                if ((modField[1][1] == "x") && (modField[0][0] == "x")) {
                    aiMove = "c3";
                }
            }
// убывающая диагональ x . x.
            if (modField[1][1] == ".") {
                if ((modField[0][0] == "x") && (modField[2][2] == "x")) {
                    aiMove = "b2";
                }
            }
// убывающая диагональ . x x
            if (modField[0][0] == ".") {
                if ((modField[1][1] == "x") && (modField[2][2] == "x")) {
                    aiMove = "a1";
                }
            }

//конец блока логики компьютера
            System.out.println("Ход компьютера:");
            System.out.println(aiMove);
            switch (aiMove) {
                case ("a1"):
                    modField[0][0] = "0";
                    verifList.remove("a1");
                    break;
                case ("a2"):
                    modField[0][1] = "0";
                    verifList.remove("a2");
                    break;
                case ("a3"):
                    modField[0][2] = "0";
                    verifList.remove("a3");
                    break;
                case ("b1"):
                    modField[1][0] = "0";
                    verifList.remove("b1");
                    break;
                case ("b2"):
                    modField[1][1] = "0";
                    verifList.remove("b2");
                    break;
                case ("b3"):
                    modField[1][2] = "0";
                    verifList.remove("b3");
                    break;
                case ("c1"):
                    modField[2][0] = "0";
                    verifList.remove("c1");
                    break;
                case ("c2"):
                    modField[2][1] = "0";
                    verifList.remove("c2");
                    break;
                case ("c3"):
                    modField[2][2] = "0";
                    verifList.remove("c3");
                    break;
            }

            if ((modField[0][0] == "x" && modField[0][1] == "x" && modField[0][2] == "x") ||
                    (modField[1][0] == "x" && modField[1][1] == "x" && modField[1][2] == "x") ||
                    (modField[2][0] == "x" && modField[2][1] == "x" && modField[2][2] == "x") ||
                    (modField[0][0] == "x" && modField[1][0] == "x" && modField[2][0] == "x") ||
                    (modField[0][1] == "x" && modField[1][1] == "x" && modField[2][1] == "x") ||
                    (modField[0][2] == "x" && modField[1][2] == "x" && modField[2][2] == "x") ||
                    (modField[0][0] == "x" && modField[1][1] == "x" && modField[2][2] == "x") ||
                    (modField[0][2] == "x" && modField[1][1] == "x" && modField[2][0] == "x")) {
                weHaveAWinner = true;
                winner = "игрок";
            }
            if ((modField[0][0] == "0" && modField[0][1] == "0" && modField[0][2] == "0") ||
                    (modField[1][0] == "0" && modField[1][1] == "0" && modField[1][2] == "0") ||
                    (modField[2][0] == "0" && modField[2][1] == "0" && modField[2][2] == "0") ||
                    (modField[0][0] == "0" && modField[1][0] == "0" && modField[2][0] == "0") ||
                    (modField[0][1] == "0" && modField[1][1] == "0" && modField[2][1] == "0") ||
                    (modField[0][2] == "0" && modField[1][2] == "0" && modField[2][2] == "0") ||
                    (modField[0][0] == "0" && modField[1][1] == "0" && modField[2][2] == "0") ||
                    (modField[0][2] == "0" && modField[1][1] == "0" && modField[2][0] == "0")) {
                weHaveAWinner = true;
                winner = "компьютер";
            }
            System.out.println("1| " + modField[0][0] + "  " + modField[1][0] + "  " + modField[2][0] + " |");
            System.out.println("2| " + modField[0][1] + "  " + modField[1][1] + "  " + modField[2][1] + " |");
            System.out.println("3| " + modField[0][2] + "  " + modField[1][2] + "  " + modField[2][2] + " |");
            System.out.println("   -  -  -");
            System.out.println("   a  b  c");
            if (weHaveAWinner) {
                System.out.println("У нас есть победитель!");
                System.out.println("Победил - " + winner + "!");
                break;
            }
            if (verifList.isEmpty()){
                System.out.println("Game Over");
                System.exit(0);
            }
            System.out.println("Доступные ходы: " + verifList);
            mField = modField;
        }
        return mField;
    }

}
