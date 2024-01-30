public interface Crawlable extends Goable{
    default void crawl() {
        System.out.println("Животное поползло");
    }
}
