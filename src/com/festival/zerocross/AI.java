package com.festival.zerocross;

import java.util.ArrayList;

class AI {
    private AILogic logic = new AILogic();
    private String [][] aiField = new String[3][3];
    private ArrayList<String> aiVList;

    void makeMove(ArrayList<String> vList) {

        String aiMove;
        if(logic.makeSomeLogic(aiField) == null) {
            int rnd;

            rnd = (int) (Math.random() * vList.size()); //реализовать от размера листа

            if (vList.isEmpty()) {
                System.out.println("GameOver");
                System.exit(0);
            }
            aiMove = vList.get(rnd);
        }else{
            aiMove =logic.makeSomeLogic(aiField);
        }
        System.out.println("Ход компьютера:");
        System.out.println(aiMove);
        switch (aiMove) {
            case ("a1"):
                aiField[0][0] = "0";
                vList.remove("a1");
                break;
            case ("a2"):
                aiField[0][1] = "0";
                vList.remove("a2");
                break;
            case ("a3"):
                aiField[0][2] = "0";
                vList.remove("a3");
                break;
            case ("b1"):
                aiField[1][0] = "0";
                vList.remove("b1");
                break;
            case ("b2"):
                aiField[1][1] = "0";
                vList.remove("b2");
                break;
            case ("b3"):
                aiField[1][2] = "0";
                vList.remove("b3");
                break;
            case ("c1"):
                aiField[2][0] = "0";
                vList.remove("c1");
                break;
            case ("c2"):
                aiField[2][1] = "0";
                vList.remove("c2");
                break;
            case ("c3"):
                aiField[2][2] = "0";
                vList.remove("c3");
                break;
        }

        aiVList = vList;
    }

    String[][] getAiField() {
        return aiField;
    }

    void setAiField(String[][] aiField) {
        this.aiField = aiField;
    }

    ArrayList<String> getAiVList() {
        return aiVList;
    }
}
