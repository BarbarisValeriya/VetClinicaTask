public interface ShortSwimable extends Swimable {
    default void shortSwim() {
        System.out.println("Животное плавает на поверхности");
    }
}
