import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {

    public void addAnimals(){
        List<Animal> listAnimals = new ArrayList<Animal>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Snake snake = new Snake();
        Egle egle = new Egle();

        listAnimals.add(cat);
        listAnimals.add(dog);
        listAnimals.add(duck);
        listAnimals.add(fish);
        listAnimals.add(snake);
        listAnimals.add(egle);
        System.out.println(listAnimals);
    }
    void getRunableAnimals(){
        List<Runable> listRunableAnimals = new ArrayList<Runable>();
        Cat cat = new Cat();
        Dog dog = new Dog();

        listRunableAnimals.add(cat);
        listRunableAnimals.add(dog);
        System.out.println(listRunableAnimals);
    }
    void getSwimableAnimals(){
        List<Swimable> listSwimableAnimals = new ArrayList<Swimable>();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Snake snake = new Snake();

        listSwimableAnimals.add(duck);
        listSwimableAnimals.add(fish);
        listSwimableAnimals.add(snake);
        listSwimableAnimals.add(cat);
        listSwimableAnimals.add(dog);
        System.out.println(listSwimableAnimals);
    }
    void getFlyableAnimals(){
        List<Flyable> listFlyableAnimals = new ArrayList<Flyable>();
        Duck duck = new Duck();
        Egle egle = new Egle();

        listFlyableAnimals.add(duck);
        listFlyableAnimals.add(egle);
        System.out.println(listFlyableAnimals);
    }

    void addEmployee(){
        List<Employee> listEmployee = new ArrayList<Employee>();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();

        listEmployee.add(doctor);
        listEmployee.add(nurse);
        System.out.println(listEmployee);
    }

}
