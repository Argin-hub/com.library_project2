package entity;

import java.util.Date;
import java.util.Objects;

public class Readers {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private Date birthday;
    private String address;
    private int telefon;

    public Readers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Readers readers = (Readers) o;
        return id == readers.id &&
                telefon == readers.telefon &&
                Objects.equals(surname, readers.surname) &&
                Objects.equals(name, readers.name) &&
                Objects.equals(patronymic, readers.patronymic) &&
                Objects.equals(birthday, readers.birthday) &&
                Objects.equals(address, readers.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, birthday, address, telefon);
    }

    @Override
    public String toString() {
        return "Readers{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", telefon=" + telefon +
                '}';
    }
}
