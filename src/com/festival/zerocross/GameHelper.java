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
        verifList.add(0, "b1");
        verifList.add(1, "b2");
        verifList.add(2, "b3");
        verifList.add(0, "c1");
        verifList.add(1, "c2");
        verifList.add(2, "c3");

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

        String[][] mField = new String[3][3];
        while (!verifList.isEmpty()) {
            String winner = null;
            boolean weHaveAWinner = false;
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

            int rnd;
            String aiMove;
            rnd = (int) (Math.random() * verifList.size());
            aiMove = verifList.get(rnd);
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
            System.out.println("Доступные ходы: " + verifList);
            mField = modField;
        }
        return mField;
    }

}
