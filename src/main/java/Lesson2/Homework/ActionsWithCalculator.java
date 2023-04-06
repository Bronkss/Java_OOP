package Lesson2.Homework;

public class ActionsWithCalculator implements Calculator {
    private double number1;
    private double number2;
    private String userAction;
    private double result;


    @Override
    public String toString() {
        return "ActionsWithCalculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", userAction='" + userAction + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public double additionNumber(double number1, double number2, String userAction) {
        if(userAction.contains("+")){
            result = number1 + number2;
        }
        return result;
    }

    @Override
    public double subtractionNumber(double number1, double number2, String userAction) {
        if(userAction.contains("-")){
            result = number1 - number2;
        }
        return result;
    }

    @Override
    public double multiplicationNumber(double number1, double number2, String userAction) {
        if(userAction.contains("*")){
            result = number1 * number2;
        }
        return result;
    }

    @Override
    public double divisionNumber(double number1, double number2, String userAction) {
        if(userAction.contains("/")){
            result = number1 / number2;
        }
        return result;
    }

    public ActionsWithCalculator(double number1, double number2, String userAction, double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.userAction = userAction;
        this.result = result;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public String getUserAction() {
        return userAction;
    }

    public void setUserAction(String userAction) {
        this.userAction = userAction;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
