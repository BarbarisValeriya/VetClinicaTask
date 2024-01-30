public interface HIghFlyable extends Flyable{
    default void hIghFly () {
        System.out.println("Животное умеет летать высоко");
    }
}
