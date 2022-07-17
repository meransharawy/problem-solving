package problems.leetcode;

import java.util.Scanner;

public class Main {

    static void main(String[] args){

        System.out.println("choose a problem: ");
        System.out.println("1: Two Sum ");

        Scanner sc = new Scanner(System.in);
        Integer problemNumber = sc.nextInt();

        switch(problemNumber){
            case 1:
                Scanner input = new Scanner(System.in);
                int[] numbers = new int[5];
                for (int i = 0; i < numbers.length; i++)
                {
                    System.out.println("Please enter number");
                    numbers[i] = input.nextInt();
                }
                Scanner input2 = new Scanner(System.in);
                Integer target = input2.nextInt();

                System.out.println(TwoSum.twoSum(numbers, target));
        }

    }
}
