import java.time.LocalDate;

public abstract class Employee extends VeterinaryClinic {
    protected String surName;
    protected String name;
    protected String lastName;
    protected String specialization;
    protected LocalDate birthDate;
    protected Double salary;

    public Employee (String surName, String name, String lastName, String specialization, LocalDate birthDate, Double salary) {
        this.surName = surName;
        this.name = name;
        this.lastName = lastName;
        this.specialization = specialization;
        this.birthDate = birthDate;
        this.salary = salary;
    }
        public Employee() {
            this("Фамилия", "Имя", "Отчество", "Специализация", LocalDate.now(), 10000D);
        }
    public String getSurName() {
        return surName;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSpecialization() {
        return specialization;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public Double getSalary() {
        return salary;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("surName = %s, name = %s, lastName = %s, specialization = %s, bd = %s, salary = %s", surName, name, lastName, specialization, birthDate, salary);
    }


    }


