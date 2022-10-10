package games;


import java.util.Random;

public class Fist {

    public static int datorVal() {


        int min = 1;
        int max = 3;
        Random random = new Random();
        int datorVal = random.nextInt(max + 1 - min) + min;
        return datorVal;
    }




    //public static final int ROCK = 1;
    //public static final int PAPER = 2;
    //public static final int SCISSORS = 3;


    //private Random random;

    //Fist (){
        //random = new Random();
    }
    //public int play() {
        //int min = 1;
        //int max = 3;
        //Random slump = new Random();
        //int datorVal = slump.nextInt(max + 1 - min ) + min ;

        //return (int) (Math.floor(Math.random() * 3) + 1);
     // en metod som när den anropas returnerar 0, 1 eller 2
    //public int pay(){
      //  int min = 1;
        //int max = 3;
         //eturn (int) (Math.random() * (max - min)) + 1;
         // return ska returnera något mellan 1 till 3





