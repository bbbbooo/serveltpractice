package com.ohgiraffers.menu.model;

public class MenuPriceCalculator {
    public int calcOrderPrice(String menuName, int amount) {

        int orderprice=0;
        switch (menuName){
            case "햄버거": orderprice = 6000 * amount; break;
            case "짜장면": orderprice = 7000 * amount; break;
            case "짬뽕": orderprice = 8000 * amount; break;
            case "순대국": orderprice = 9000 * amount; break;
        }
        return orderprice;
    }
}
