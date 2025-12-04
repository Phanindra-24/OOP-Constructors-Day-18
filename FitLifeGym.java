package com.codegnan.oopexamples;

import java.util.Scanner;

class FitLifeGym {
    private int memberID;
    private int steps;

    
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

   
    public int getMemberID() {
        return memberID;
    }

    public int getSteps() {
        return steps;
    }

    
    public int calcFromSteps(int steps) {
        int calories = (int) (steps * 0.05);
        if (calories > 1000) {
            calories = 1000;
        }
        return calories;
    }

    
    public int calcFixed() {
        return 10;
    }

    
    public int calcStepsPlusFixed(int steps) {
        int calories = (int) (steps * 0.05 + 10);
        if (calories > 1000) {
            calories = 1000;
        }
        return calories;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int memberID = scanner.nextInt();
        int steps = scanner.nextInt();
        int steps2 = scanner.nextInt();
        scanner.nextInt();
        int steps3 = scanner.nextInt();

        FitLifeGym tracker = new FitLifeGym();

        
        tracker.setMemberID(memberID);
        tracker.setSteps(steps);
        System.out.println(tracker.calcFromSteps(steps2));
        System.out.println(tracker.calcFixed());
        System.out.println(tracker.calcStepsPlusFixed(steps3));
        System.out.println(tracker.getMemberID());
        System.out.println(tracker.getSteps());

        scanner.close();
    }
}
