import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Subscription {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "student_id")
    private int Id;
    @Column (name = "course_id")
    private int course;
    @Column (name = "subscription_date")
    private Date subsctiptionDate;
}
