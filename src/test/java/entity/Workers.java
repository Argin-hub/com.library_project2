package entity;

import java.util.Date;
import java.util.Objects;

public class Workers {
    private int idWokers;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int telefon;
    private int position_fk;
    private Date birthday;

    public Workers() {
    }

    public int getIdWokers() {
        return idWokers;
    }

    public void setIdWokers(int idWokers) {
        this.idWokers = idWokers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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

    public int getPosition_fk() {
        return position_fk;
    }

    public void setPosition_fk(int position_fk) {
        this.position_fk = position_fk;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Workers workers = (Workers) o;
        return idWokers == workers.idWokers &&
                telefon == workers.telefon &&
                position_fk == workers.position_fk &&
                Objects.equals(name, workers.name) &&
                Objects.equals(surname, workers.surname) &&
                Objects.equals(patronymic, workers.patronymic) &&
                Objects.equals(address, workers.address) &&
                Objects.equals(birthday, workers.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWokers, name, surname, patronymic, address, telefon, position_fk, birthday);
    }

    @Override
    public String toString() {
        return "Workers{" +
                "idWokers=" + idWokers +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", telefon=" + telefon +
                ", position_fk=" + position_fk +
                ", birthday=" + birthday +
                '}';
    }
}
