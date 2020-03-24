package entity;

import java.util.Date;
import java.util.Objects;

public class Books {
    private int id;
    private String title;
    private Date yearPublished;
    private int author_books_fk;
    private int genre_fk;
    private int publishing_fk;

    public Books() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Date yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getAuthor_books_fk() {
        return author_books_fk;
    }

    public void setAuthor_books_fk(int author_books_fk) {
        this.author_books_fk = author_books_fk;
    }

    public int getGenre_fk() {
        return genre_fk;
    }

    public void setGenre_fk(int genre_fk) {
        this.genre_fk = genre_fk;
    }

    public int getPublishing_fk() {
        return publishing_fk;
    }

    public void setPublishing_fk(int publishing_fk) {
        this.publishing_fk = publishing_fk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id &&
                author_books_fk == books.author_books_fk &&
                genre_fk == books.genre_fk &&
                publishing_fk == books.publishing_fk &&
                Objects.equals(title, books.title) &&
                Objects.equals(yearPublished, books.yearPublished);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, yearPublished, author_books_fk, genre_fk, publishing_fk);
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                ", author_books_fk=" + author_books_fk +
                ", genre_fk=" + genre_fk +
                ", publishing_fk=" + publishing_fk +
                '}';
    }
}
