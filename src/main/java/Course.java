import jakarta.persistence.*;

@Entity //для связи таблицей с данным класом

public class Course {
    @Id //
    @GeneratedValue (strategy = GenerationType.IDENTITY) //

    private int Id;
    private String name;
    private String description;
    @Column (name = "teacher_id")
    private int teacherId;
    @Column(name = "student_count") // название должно соответсвовать названию столбца
    private int studentsCount;
    private int price;
    @Column(name = "price_per_hour")
    private float pricePerHoue;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public int getPrice() {
        return price;
    }

    public float getPricePerHoue() {
        return pricePerHoue;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPricePerHoue(float pricePerHoue) {
        this.pricePerHoue = pricePerHoue;
    }

    @Override
    public String toString() {
        return "Course{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", teacherId=" + teacherId +
                ", studentsCount=" + studentsCount +
                ", price=" + price +
                ", pricePerHoue=" + pricePerHoue +
                '}';
    }
}
