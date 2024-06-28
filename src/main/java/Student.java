import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    private int age;
    @Column (name = "registration_date")
    private Date registrationDate;

}
