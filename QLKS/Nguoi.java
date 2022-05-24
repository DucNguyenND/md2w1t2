package QLKS;

import java.sql.Date;
import java.util.zip.DataFormatException;

public class Nguoi {
    private String name;
    private Date date;
    private int id;

    public Nguoi() {
    }

    public Nguoi(String name, Date date, int id) {
        this.name = name;
        this.date = date;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
