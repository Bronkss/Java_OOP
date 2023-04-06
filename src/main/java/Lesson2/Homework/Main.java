package Lesson2.Homework;

/**
 * К сожаления пока что нет времени все это довести до ума, но главное чтобы работал принцип ООП, он есть.
 */
public class Main {
    public static void main(String[] args) {
        ActionsWithCalculator calculator = new ActionsWithCalculator(1,0,"+",0);
        System.out.println(calculator.additionNumber(10.0,20.0,"+"));
        System.out.println(calculator.subtractionNumber(10.0,5.0,"-"));
        System.out.println(calculator.multiplicationNumber(10.0,2.0,"*"));
        System.out.println(calculator.divisionNumber(30.0,2.0,"/"));
    }
}
