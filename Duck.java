import java.time.LocalDate;
public class Duck extends Animal implements LowFlyable, Swimable, Huntable {
    public Duck (String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }
    public Duck(){
        super();
    }
    @Override
    public void eat() {
        System.out.println("Утка ест");
    }

}
