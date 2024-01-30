public interface Runable extends Goable{
    default void run(){
        System.out.println("Животное побежало");
    }

}
