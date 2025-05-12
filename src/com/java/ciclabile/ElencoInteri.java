package com.java.ciclabile;

public class ElencoInteri {

    private int[] arrayInt;
    private int counter = 0;

    public ElencoInteri(int[] arrayIntParameter) {

        this.arrayInt = arrayIntParameter;

    }

    public int[] getArrayInt() {
        return this.arrayInt;
    }

    public void setArrayInt(int[] arrayInt) {
        this.arrayInt = arrayInt;
    }

    public boolean hasAncoraElementi() {

        if (arrayInt.length == 0) {

            return false;

        }

        return this.counter < this.arrayInt.length;

    }

    public int getElementoSuccessivo() {

        int nextInt = 0;

        nextInt = arrayInt[counter];

        counter++;

        return nextInt;

    }

    // for the bonus
    public ElencoInteri() {
        this.arrayInt = new int[0];
    }

    public void addElemento(int element) {

        int[] arrayClone = new int[arrayInt.length + 1];

        for (int i = 0; i < arrayInt.length; i++) {

            arrayClone[i] = arrayInt[i];

        }

        arrayClone[arrayInt.length] = element;
        arrayInt = arrayClone;

    }

}
