package entity;

import java.util.Objects;

public class Genre {
    private int id;
    private String titleGenre;

    public Genre() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitleGenre() {
        return titleGenre;
    }

    public void setTitleGenre(String titleGenre) {
        this.titleGenre = titleGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Genre genre = (Genre) o;
        return id == genre.id &&
                Objects.equals(titleGenre, genre.titleGenre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titleGenre);
    }

    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", titleGenre='" + titleGenre + '\'' +
                '}';
    }
}
