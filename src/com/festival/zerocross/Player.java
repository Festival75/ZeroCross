package com.festival.zerocross;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Player {
    private String [][] userField = new String[3][3];
    private ArrayList<String> userVList;


    void makeMove(ArrayList<String> vList){

        if (vList.isEmpty()){
            System.out.println("GameOver");
            System.exit(0);
        }
        String inputLane = getUserInput();
        switch (inputLane) {
            case ("a1"):
                userField[0][0] = "x";
                vList.remove("a1");
                break;
            case ("a2"):
                userField[0][1] = "x";
                vList.remove("a2");
                break;
            case ("a3"):
                userField[0][2] = "x";
                vList.remove("a3");
                break;
            case ("b1"):
                userField[1][0] = "x";
                vList.remove("b1");
                break;
            case ("b2"):
                userField[1][1] = "x";
                vList.remove("b2");
                break;
            case ("b3"):
                userField[1][2] = "x";
                vList.remove("b3");
                break;
            case ("c1"):
                userField[2][0] = "x";
                vList.remove("c1");
                break;
            case ("c2"):
                userField[2][1] = "x";
                vList.remove("c2");
                break;
            case ("c3"):
                userField[2][2] = "x";
                vList.remove("c3");
                break;
        }
        userVList = vList;
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
        assert inputLane != null;
        return inputLane.toLowerCase();
    }

    String[][] getUserField() {
        return userField;
    }

    void setUserField(String[][] userField) {
        this.userField = userField;
    }

    ArrayList<String> getUserVList() {
        return userVList;
    }
}
