public interface LongSwimable extends Swimable {
    default void longSwim() {
        System.out.println("Животное проводит много времени в воде и под водой");
    }
}
