package com.pluralsight;

public class MathApp {
        public static void main(String[] args) {
// Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE

            int bobsalary = 20000;
            int garysalary=30000;
            int highestsalary= Math.max(bobsalary,garysalary);
            System.out.println(highestsalary);
//2
            int carprice=50000;
            int truckprice=70000;
            int smallestprice= Math.min(carprice,truckprice);
            System.out.println(smallestprice);

//3
            double pi =3.14159;
            double radius =7.25;
            double area =pi*radius*radius;
            System.out.println(area);

//4

            double x = 5.0;
            double squareroot =Math.sqrt(x);
            System.out.println(squareroot);





        }
}


