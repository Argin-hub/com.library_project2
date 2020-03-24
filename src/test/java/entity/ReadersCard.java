package entity;

import java.util.Date;
import java.util.Objects;

public class ReadersCard {
    private int idReadersCard;
    private int readers_fk;
    private int books_fk;
    private Date dateOfIssue;
    private Date dateOfCompleitor;
    private int worker_fk;

    public ReadersCard() {
    }

    public int getIdReadersCard() {
        return idReadersCard;
    }

    public void setIdReadersCard(int idReadersCard) {
        this.idReadersCard = idReadersCard;
    }

    public int getReaders_fk() {
        return readers_fk;
    }

    public void setReaders_fk(int readers_fk) {
        this.readers_fk = readers_fk;
    }

    public int getBooks_fk() {
        return books_fk;
    }

    public void setBooks_fk(int books_fk) {
        this.books_fk = books_fk;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfCompleitor() {
        return dateOfCompleitor;
    }

    public void setDateOfCompleitor(Date dateOfCompleitor) {
        this.dateOfCompleitor = dateOfCompleitor;
    }

    public int getWorker_fk() {
        return worker_fk;
    }

    public void setWorker_fk(int worker_fk) {
        this.worker_fk = worker_fk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReadersCard that = (ReadersCard) o;
        return idReadersCard == that.idReadersCard &&
                readers_fk == that.readers_fk &&
                books_fk == that.books_fk &&
                worker_fk == that.worker_fk &&
                Objects.equals(dateOfIssue, that.dateOfIssue) &&
                Objects.equals(dateOfCompleitor, that.dateOfCompleitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReadersCard, readers_fk, books_fk, dateOfIssue, dateOfCompleitor, worker_fk);
    }

    @Override
    public String toString() {
        return "ReadersCard{" +
                "idReadersCard=" + idReadersCard +
                ", readers_fk=" + readers_fk +
                ", books_fk=" + books_fk +
                ", dateOfIssue=" + dateOfIssue +
                ", dateOfCompleitor=" + dateOfCompleitor +
                ", worker_fk=" + worker_fk +
                '}';
    }
}
