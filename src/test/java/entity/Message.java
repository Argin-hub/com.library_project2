package entity;

import java.util.Date;
import java.util.Objects;

public class Message {
  //  private int id;
    private String text;
    private Date writtenDay;
    private String authorNickName;
    private int reader_fk;
    private int worker_fk;

    public Message() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getWrittenDay() {
        return writtenDay;
    }

    public void setWrittenDay(Date writtenDay) {
        this.writtenDay = writtenDay;
    }

    public String getAuthorNickName() {
        return authorNickName;
    }

    public void setAuthorNickName(String authorNickName) {
        this.authorNickName = authorNickName;
    }

    public int getReader_fk() {
        return reader_fk;
    }

    public void setReader_fk(int reader_fk) {
        this.reader_fk = reader_fk;
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
        Message message = (Message) o;
        return
                reader_fk == message.reader_fk &&
                worker_fk == message.worker_fk &&
                Objects.equals(text, message.text) &&
                Objects.equals(writtenDay, message.writtenDay) &&
                Objects.equals(authorNickName, message.authorNickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, writtenDay, authorNickName, reader_fk, worker_fk);
    }

    @Override
    public String toString() {
        return "Message{" +
              //  "id=" + id +
                ", text='" + text + '\'' +
                ", writtenDay=" + writtenDay +
                ", authorNickName='" + authorNickName + '\'' +
                ", reader_fk=" + reader_fk +
                ", worker_fk=" + worker_fk +
                '}';
    }
}
