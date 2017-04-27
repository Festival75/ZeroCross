package com.festival.zerocross;

import java.util.ArrayList;

class GameField {
    private String[][] mainField = new String[3][3];
    private ArrayList<String> vList = new ArrayList<>();

    void initField(){
        mainField[0][0] = ".";
        mainField[0][1] = ".";
        mainField[0][2] = ".";
        mainField[1][0] = ".";
        mainField[1][1] = ".";
        mainField[1][2] = ".";
        mainField[2][0] = ".";
        mainField[2][1] = ".";
        mainField[2][2] = ".";
    }

    void initVerificationList(){
        vList.add(0, "a1");
        vList.add(1, "a2");
        vList.add(2, "a3");
        vList.add(3, "b1");
        vList.add(4, "b2");
        vList.add(5, "b3");
        vList.add(6, "c1");
        vList.add(7, "c2");
        vList.add(8, "c3");
    }

    String[][] getMainField() {
        return mainField;
    }

    ArrayList<String> getvList() {
        return vList;
    }

    void drawField(String [][] fieldToDraw) {

        System.out.println("1| " + fieldToDraw[0][0] + "  " + fieldToDraw[1][0] + "  " + fieldToDraw[2][0] + " |");
        System.out.println("2| " + fieldToDraw[0][1] + "  " + fieldToDraw[1][1] + "  " + fieldToDraw[2][1] + " |");
        System.out.println("3| " + fieldToDraw[0][2] + "  " + fieldToDraw[1][2] + "  " + fieldToDraw[2][2] + " |");
        System.out.println("   -  -  -");
        System.out.println("   a  b  c");
        System.out.println("Доступные ходы: " + vList);
    }
}
