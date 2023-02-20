public class Penguin extends Main implements CanRun, CanSwim{
    @Override
    public void run() {
        System.out.println("Пингвин бежит");
    }

    @Override
    public void swim() {
        System.out.println("Пингвин плавает");
    }
}
