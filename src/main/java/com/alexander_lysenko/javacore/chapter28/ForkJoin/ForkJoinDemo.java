package main.java.com.alexander_lysenko.javacore.chapter28.ForkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[100000];
        for (int i = 0; i < nums.length; i++) {
           nums[i] = (double) i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i] + " ");
            System.out.println("\n");
        }

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
        fjp.invoke(task);

        System.out.println();
        for(int i = 0; i< 10; i++) {
            System.out.println("%.4f " + nums[i]);
            System.out.println();
        }
    }
}
