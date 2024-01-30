import java.time.LocalDate;

public class Doctor extends Employee implements Workable {
    public Doctor(String surName, String name, String lastName, String specialization, LocalDate birthDate, Double salary) {
        super(surName, name, lastName, specialization, birthDate, salary);
    }
    public Doctor() {
        super();
        this.salary = 30000.50D;
    }
    @Override
    public void workAssistance() {
        System.out.println("Сотрудник НЕ ассистирует");
    }
}
