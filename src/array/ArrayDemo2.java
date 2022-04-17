package array;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = {3,1,3,4,5,67,3,5,2};
        System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] a){
        int t = 0;
        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j+1]<a[j]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return a;
    }
}
