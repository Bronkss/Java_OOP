package Lesson2.Seminar;

public class Human extends Actor{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder() {
        makeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        takeOrder = true;
    }
}
