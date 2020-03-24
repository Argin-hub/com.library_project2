package entity;

import java.util.Objects;

public class PositionWorker {
    private int idWorker;
    private int salary;
    private String position;

    public PositionWorker() {
    }

    public int getIdWorker() {
        return idWorker;
    }

    public void setIdWorker(int idWorker) {
        this.idWorker = idWorker;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionWorker that = (PositionWorker) o;
        return idWorker == that.idWorker &&
                salary == that.salary &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWorker, salary, position);
    }

    @Override
    public String toString() {
        return "PositionWoker{" +
                "idWoker=" + idWorker +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
