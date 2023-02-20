public class Main implements CanFly, CanSwim, CanRun {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        Penguin penguin = new Penguin();
        penguin.run();
        penguin.swim();
        Toad toad = new Toad();
        toad.swim();
    }

    @Override
    public void fly() {

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
