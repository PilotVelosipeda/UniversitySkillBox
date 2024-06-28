import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Purchaselist {

@Column (name = "student_name")
private String studentName;
@Column (name = "course_name")
private String courseName;

private int price;
@Column (name = "subscription_date")
private Date subscriptionDate;
}
