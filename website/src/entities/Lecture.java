package entities;

public class Lecture {
    private int id;
    private String lectureName;
    private String category;
    private String lecturer;
    private double price;


    public Lecture() {
    }

    public Lecture(int id, String lectureName, String category, String lecturer, double price) {
        this.id = id;
        this.lectureName = lectureName;
        this.category = category;
        this.lecturer = lecturer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLectureName() {
        return lectureName;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
