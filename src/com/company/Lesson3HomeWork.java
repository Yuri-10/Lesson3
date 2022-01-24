package com.company;

import java.util.Arrays;

public class Lesson3HomeWork {

    public static void main(String[] args) {
        arrayElements();
        arrayFill();
        arrayMultiply();
        arrayDiagonal();
        twoArguments(7,5);
        minMaxValue();
        int [] array = {1,3,2,3,2,1};
        System.out.println(trueAndFalse(array));
    }
    static void arrayElements()
    {
        int [] array = {1,1,0,0,0,1,1};
        for (int i =0; i < array.length; i++)
        {
            array[i] = array[i]>=1? 0:1;
        }
        System.out.println(Arrays.toString(array));
    }

    static void arrayFill(){
        int [] array = new int[100];
        for(int i = 0; i<array.length; i++)
        {
            array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    static void arrayMultiply()
    {
        int [] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i=0; i<array.length; i++)
        {
            array[i] = array[i]<6? array[i]*2:array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    static void arrayDiagonal()
    {
        int [][] array =new int [10][10];
        for (int i = 0; i < array.length;i++)
        {
            for(int j = 0; j < array.length;j++)
            {
                array[i][j]=1;
                if(i != j)
                    array[i][j]=0;

                if(i + j == 9)
                    array[i][j]=1;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static void  twoArguments(int len, int initialValue){
        int [] array = new int [len];
        for(int i=0; i< array.length; i++){
            array[i] = initialValue;
        }System.out.println(Arrays.toString(array));
    }

    static void minMaxValue(){
        int [] array = new int[9];
        for(int i = 0; i < array.length; i++)
        {
            array[i]=(i+7)*4;
        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        System.out.println("Valur random array " + Arrays.toString(array));
        System.out.println("Min = " + min );
        System.out.println("Max = " + max);

    }

    public static boolean trueAndFalse(int [] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int tempLeft = 0;
            int tempRight = 0;
            for (int j = 0; j <= i; j++)
            {
                tempLeft += array[j];
            }
            for (int j = array.length - 1; j > i; j--)
            {
                tempRight += array[j];
            }
            if (tempLeft == tempRight)
            {
                return true;
            }
        }
        return false;
    }
}
