package com.programs.arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {
                {1993,1999},
                {2000,2010}
        };
        int result = maximumPopulation(logs);
        System.out.println(result);

    }

    public static int maximumPopulation(int[][] logs){
        int[] tally = new int[101];
        for(int[] log : logs){
            int birth = log[0] - 1950;
            int death = log[1] - 1950;
            tally[birth]++;
            tally[death]--;
        }

        int maxPopulation = tally[0];
        int maxYear = 1950;

        for(int i=1; i<tally.length;i++){
            tally[i] = tally[i] + tally[i-1];
            if(tally[i]>maxPopulation){
                maxPopulation = tally[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }
}
