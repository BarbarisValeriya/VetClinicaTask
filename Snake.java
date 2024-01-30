import java.time.LocalDate;

public class Snake extends Animal implements Crawlable, Huntable, LongSwimable {
    public Snake (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Snake(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("Змея проглотила пищу");
    }
}

