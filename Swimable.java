public interface Swimable {
    default void swim() {
        System.out.println("Животное умеет плавать");
    }
    default double getSwimSpeed(){
        return 50;
    }

}