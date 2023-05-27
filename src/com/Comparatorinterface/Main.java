package com.Comparatorinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //int[] input = new int[3];
        int t= sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            Pair array[] = new Pair[n];
            for (int i = 0; i < n; i++) {
                int day=sc.nextInt();
                int month=sc.nextInt();
                int year= sc.nextInt();
                array[i] = new Pair(day,month,year);
            }
            System.out.println("Your Dates :");
            for(int i=0;i<array.length;i++){
                System.out.println(array[i].day+" "+array[i].month+" "+array[i].year);
            }
            Arrays.sort(array, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    if(o1.year==o2.year){
                        if(o1.month==o2.month){
                            return o1.day-o2.day;
                        }
                        return o1.month-o2.month;
                    }
                    return o1.year-o2.year;
                }
            });
            System.out.println(" Dates sorted using comparator : ");
            for(int i=0;i<array.length;i++){
                System.out.println(array[i].day+" "+array[i].month+" "+array[i].year);
            }

        }

    }
}
/*class pair{
    String month;
    String year;
    pair(String month, String year){
        this.month=month;
        this.year=year;
    }
}
public class MyComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        pair[] arr=new pair[n];
        for(int i=0;i<n;i++){
            String s=sc.next();
            arr[i]=new pair(s.substring(0,2),s.substring(3));

        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i].month+" "+arr[i].year);
        }
        Arrays.sort(arr, new Comparator<pair>() {
            @Override
            public int compare(pair a, pair b) {
                if((a.year).equals(b.year)){
                    return (a.month).compareTo(b.month);
                }
                return (a.year).compareTo(b.year);
            }
        });
        System.out.println("---------------------------");
        for(int i=0;i<n;i++){
            System.out.println(arr[i].month+" "+arr[i].year);
        }
    }
}

 */