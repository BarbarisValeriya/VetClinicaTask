import java.time.LocalDate;

public class Egle extends Animal implements HIghFlyable, Huntable {
    public Egle (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Egle(){
        super();
    }
    @Override
    public void eat() {
        System.out.println("Орел ест");
    }

}
