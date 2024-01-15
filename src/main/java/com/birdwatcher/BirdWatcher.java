package com.birdwatcher;

public class BirdWatcher {
    private int[] birdsPerDay = new int[7];

    BirdWatcher(int[] birdsPerDay){
        this.birdsPerDay = birdsPerDay;
    }

    //  <---  1. Check what the counts were last week --->
    public int[] getLastWeek(){
        return this.birdsPerDay;
    }

    //  <---  2. Check how many birds visited today --->
    public int getToday(){
        return birdsPerDay[birdsPerDay.length-1];
    }

    //  <---  3. Increment today's count --->
    public int incrementTodaysCount(){
        int todaysBird = getToday();
        return todaysBird+1;
    }

    //  <---  4. Check if there was a day with no visiting birds --->
    public boolean hasDayWithoutBirds(){
        for(int b: birdsPerDay){
            if (b == 0){
                return true;
            }
        }
        return false;
    }

    // <---   5. Calculate the number of visiting birds for the first number of days --->
    public int getCountForFirstDays(int limit){
        int count = 0;
        for(int i = 0; i < limit; i++){
            count += birdsPerDay[i];
        }
        return count;
    }

    //  <---  6. Calculate the number of busy days --->
    public int getBusyDays(){
        int count = 0;
        for(int b: birdsPerDay){
            if(b >= 5){
                count++;
            }
        }
        return count;
    }
}
