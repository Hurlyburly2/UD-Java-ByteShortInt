package com.company;

public class Main {

    public static void main(String[] args) {

        //WHOLE NUMBER DATA TYPES:

        // Byte has a width of 8
        byte minByteValue = -128;
        byte maxByteValue = 127;
        byte myNewByteValue = (byte) (maxByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        // Short has a width of 16
        short minShortValue = -32768;
        short maxShortValue = 32767;
        short myNewShortValue = (short) (maxShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // Integer has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = myMinValue/2;
        System.out.println("myTotal = " + myTotal);

        // Long has a width of 64
        long minLongValue = -9_223_372_036_854_775_808L;
        long maxLongValue = -9_223_372_036_854_775_807L;

        //CHALLENGE
        //1. CREATE A BYTE VALUE AND SET IT TO ANY VALID BYTE NUMBER
        //2. CREATE A SHORT VARIABLE AND SET IT TO ANY VALID SHORT NUMBER
        //3. CREATE AN INT VARIABLE AND SET IT TO ANY VALID INT NUMBER
        //4. CREATE A LONG VARIABLE AND SET IT EQUAL TO 50000 + 10(BYTEVALUE + SHORTVALUE + INTVALUE)
    }
}
