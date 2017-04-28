package com.festival.zerocross;

import java.util.ArrayList;

public class Game {

    private static GameHelper helper = new GameHelper();
    private static GameField field = new GameField();
    private static AI ai = new AI();
    private static Player player = new Player();

    public static void main(String[] args) {
        field.initVerificationList();
        field.initField();
        String[][] gameField = field.getMainField();
        ArrayList<String> vList = field.getvList();
        field.drawField(gameField);//выводим в консоль массив из точек

        while (!vList.isEmpty()) {
            player.setUserField(gameField);//отправляем классу Player текущее состояние поля
            player.makeMove(vList);//изменяем состояние поля в классе Player
            gameField = player.getUserField();//получаем текущее состояние поля от класса Player
            vList = player.getUserVList();//получаем текущее значение vList от Player
            helper.clrscr();//очищаем консоль
            field.drawField(gameField);//отрисовываем текущее состояние поля
            helper.checkWinner(gameField);//проверка на победителя
            ai.setAiField(gameField);//передаём AI текущее состояние поля
            ai.makeMove(vList);//изменяем состояние поля в классе AI
            gameField = ai.getAiField();//получаем текуще состояние поля от класса AI
            vList = ai.getAiVList();
            helper.clrscr();//очищаем консоль
            field.drawField(gameField);//отрисовываем текущее состояние поля
            helper.checkWinner(gameField);//проверка на победителя
        }


    }
}
