package main.java.com.alexander_lysenko.javacore.chapter28.ForckJoinTask;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int treshold;
        if (args.length != 2) {
            System.out.println("FJExperiment  over");
            return;
        }
        pLevel = Integer.parseInt(args[0]);
        treshold = Integer.parseInt(args[1]);

        long beginT, endT;

        ForkJoinPool fjp = new ForkJoinPool(pLevel);

        double[] nums = new double[100000];
         for(int i = 0; i < nums.length; i++) {
             nums[i] = (double) i;
         }
         Transform task = new Transform(nums, 0, nums.length, treshold);
         beginT = System.nanoTime();
         fjp.invoke(task);
         endT = System.nanoTime();
        System.out.println("Parallelism " + pLevel);
    }
}
