public interface Goable {
    default void go(){
        System.out.println("Животное идет своим путем");
    }
    default double getGoSpeed(){
        return 10;
    }

}
