package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pet {

    protected int petId;
    protected String name;
    protected LocalDate birthday;

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdayDate() {
        return birthday;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, дата рождения: %s ", getPetId(), getClass().getSimpleName(), name, getBirthday());
    }
}
