package com.birdwatcher;

public class BDApplication {
    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 2, 7, 4, 3};
        BirdWatcher birdWatcher = new BirdWatcher(birdsPerDay);

        int[] lastWeekBirds = birdWatcher.getLastWeek();
        System.out.println("Last Week Birds");
        for(int b: lastWeekBirds)
            System.out.print(b + " ");

        System.out.println();
        System.out.println("Number of birds visited today");
        System.out.println(birdWatcher.getToday());

        System.out.println("incremented Today's Count");
        System.out.println(birdWatcher.incrementTodaysCount());

        System.out.println("a day with no visiting birds");
        System.out.println(birdWatcher.hasDayWithoutBirds());

        System.out.println("number of visiting birds for the first number of days");
        System.out.println(birdWatcher.getCountForFirstDays(3));

        System.out.println("number of busy days");
        System.out.println(birdWatcher.getBusyDays());
    }
}
