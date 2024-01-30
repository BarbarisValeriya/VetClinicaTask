public interface LowFlyable extends Flyable {
    default void lowFly () {
        System.out.println("Животное летает очень низко");
    }
}
