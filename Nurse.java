import java.time.LocalDate;

public class Nurse extends Employee implements Workable {
    public Nurse (String surName, String name, String lastName, String specialization, LocalDate birthDate, Double salary) {
        super(surName, name, lastName, specialization, birthDate, salary);
    }
    public Nurse() {
        super();
        this.salary = 15000.50D;
    }
    @Override
    public void workSurgery() {
        System.out.println("Сотрудник НЕ допущен к проведению операций");
    }
}
