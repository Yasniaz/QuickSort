package com.company;

import java.util.Random;

public class Main {

    public static QuickLink rll(int n){
        QuickLink l = new QuickLink();
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            l.appendData(rd.nextInt(n*10));
        }
        return l;
    }



    public static void main(String[] args) {


     /*   int[] array = array(10);
        QuickSort.quickSort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

     /*    QuickLink ls = rll(10);
        System.out.println(ls);
        QuickLink.quickSortll(ls.head, ls.tail);
        System.out.println(ls); */

        Benchmark.benchmark(1000);

    }
}
