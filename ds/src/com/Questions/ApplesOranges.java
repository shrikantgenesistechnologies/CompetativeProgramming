package com.Questions;

public class ApplesOranges {
    public static void main(String[] args) {
        int s=7; //s: integer, starting point of Sam's house location.
        int t=11; //t: integer, ending location of Sam's house location.
        int a=5; //a: integer, location of the Apple tree.
        int b=15; //b: integer, location of the Orange tree.
        int m = 3; //m: size of apples array
        int n = 2; //n: size of oranges array
        int[] apples = {-2, 2, 1}; //apples: integer array, distances at which each apple falls from the tree.
        int[] oranges = {5, -6}; //oranges: integer array, distances at which each orange falls from the tree.
        int apple = 0, orange = 0;
        for(int i = 0; i < apples.length; i++) {
            apples[i] = a + apples[i];
            if(apples[i]>=s && apples[i]<=t) {
                apple++;
            }
        }
        for(int j = 0; j < oranges.length; j++) {
            oranges[j] = b + oranges[j];
            if(oranges[j]>=s && oranges[j]<=t) {
                orange++;
            }
        }
        System.out.println(apple);
        System.out.println(orange);
    }
}
