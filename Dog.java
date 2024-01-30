import java.time.LocalDate;

public class Dog extends Animal implements Runable, Huntable, ShortSwimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("Собака ест с миски");
    }

}
