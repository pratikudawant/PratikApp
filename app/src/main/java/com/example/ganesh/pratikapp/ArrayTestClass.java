package com.example.ganesh.pratikapp;

/**
 * Created by Ganesh on 2018-08-01.
 */
public class ArrayTestClass {

    int [][]a = new int[10][10];
    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 10; j++)
        {
            System.out.printf("%2d ", a[i][j]);
        }
        System.out.println();
    }
}
