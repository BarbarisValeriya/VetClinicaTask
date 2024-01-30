
    public interface Flyable {
        default void fly(){
            System.out.println("Животное умеет летать");
        }
        default double getFlySpeed(){
            return 20;
        }
    }

