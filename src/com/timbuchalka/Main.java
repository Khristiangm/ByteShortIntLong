package com.timbuchalka;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

   public static void main(String[] args) {
    /* INT HAS A WIDTH OF 32
	int myMinValue = -2147483648;
    int myMaxValue = 2147483647;
    int myTotal =  (myMinValue/2);
    System.out.println("myTotal ="+ myTotal);

    //SHORT HAS A WIDTH OF 16
    short myShortValue = 32767;

    //BYTE HAS A WIDTH OF 8
    byte myByteValue = -128;
    byte myNewByteValue = (byte) (myByteValue/2);
    System.out.println("MyNewByteValue = " + myNewByteValue);

    //LONG HAS A WIDTH OF 64
    long myLongValue = 100L;*/
/****************************************************************************************************************/
    //EXERCISE

        //Create Byte any value
        //Create Short any value
        //Create int any value
        //create  a variable of type long and make it equals 50000 + 10 times the above variables plus.

        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 30;

        // O (L) ao lado do numero indica que ele e um numero do tipo LONG.
        long longTotal = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

        //O (short) indica que toda a operacao a seguir sera convertida em um short (tipo).
        short shortTotal = (short) (1000 + 10 *(myByteValue + myShortValue + myIntValue));

        //O (byte) Indica que toda operacao a seguir sera convertida em um byte (tipo).
        byte byteTotal = (byte) (100000 + 100000 * (myByteValue + myShortValue + myIntValue));

        //Resultados das operacoes acima printados na tela.
        System.out.println("LongTOTAL Is:" + longTotal);
        System.out.println("ShortTOTAL Is:" + shortTotal);
        System.out.println("ByteTOTAL Is:" + byteTotal);





    }

}
