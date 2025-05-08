package com.java.ciclabile;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = { 1, 2, 4, 6, 5 };

        ElencoInteri integer = new ElencoInteri(arrayInt);

        while (integer.hasAncoraElementi()) {

            System.out.println(integer.getElementoSuccessivo());

        }


        ElencoInteri integerBonus = new ElencoInteri();

        System.out.println("new elements:");
        integerBonus.addElemento(2);
        integerBonus.addElemento(3);

        while (integerBonus.hasAncoraElementi()) {
            System.out.println(integerBonus.getElementoSuccessivo());
        }









    }

}
