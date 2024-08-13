package com.net.medium;


import java.util.Arrays;

public class MergeLinkedList {
    public static void main(String args[]) {

        int a[]={1,2,3,45};
        int b[]={4,6,0};

        int c[]= new int[a.length+b.length];
        for(int i=0,j=0;i<a.length;i++)
        {
            c[i]=a[i];
        }

        for(int i=a.length,j=0;i<a.length+b.length;i++)
        {
            c[i]=b[j];
            j++;
        }

        System.out.println(Arrays.toString(c));
    }

}
