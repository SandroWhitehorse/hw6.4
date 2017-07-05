package com.trylabs;

public class Main {

    private static int[] BubbleSort(int array[]){
        int temp=0;
        boolean f=false;
        for (int j=0;j<array.length-1;j++) {
        f=false;
         for (int i=0;i<array.length-1;i++)
         {
             if (array[i]>array[i+1])
             {temp=array[i];
             array[i]=array[i+1];
             array[i+1]=temp;
             f=true;
             }
            }
            if (f=false) break;
        }
            return array;
            }
            private static void Print(int sortedArray[]){
            for (int a:sortedArray){
                System.out.println(a);
            }

            }

    public static void main(String[] args) {
        int array[]={11,56,87,55,11,34,6};
        Print(BubbleSort(array));

    }
}
