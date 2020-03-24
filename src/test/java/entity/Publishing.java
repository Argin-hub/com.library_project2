package entity;

import java.util.Objects;

public class Publishing {
    private int idPublishing;
    private String titlePublishing;
    private String address;

    public Publishing() {
    }

    public int getIdPublishing() {
        return idPublishing;
    }

    public void setIdPublishing(int idPublishing) {
        this.idPublishing = idPublishing;
    }

    public String getTitlePublishing() {
        return titlePublishing;
    }

    public void setTitlePublishing(String titlePublishing) {
        this.titlePublishing = titlePublishing;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publishing that = (Publishing) o;
        return idPublishing == that.idPublishing &&
                Objects.equals(titlePublishing, that.titlePublishing) &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPublishing, titlePublishing, address);
    }

    @Override
    public String toString() {
        return "Publishing{" +
                "idPublishing=" + idPublishing +
                ", titlePublishing='" + titlePublishing + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
