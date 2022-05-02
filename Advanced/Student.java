
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "SCET")
public class Student {
    
    @Id
    @GeneratedValue
    private int Sid;
    @Column (name= "Student_Name" , length = 30)
    private String Name;
    private String City;
    private String Email;
    public Student() {

    }
    public Student(int Sid, String Name, String City, String Email) {
        super();
        this.Sid = Sid;
        this.Name = Name;
        this.City = City;
        this.Email = Email;
    }
    int getSid() {
        return Sid;
    }
    String getName() {
        return Name;
    }
    String getEmail() {
        return Email;
    }
    String getCity() {
        return City;
    }
    void setSid(int Sid) {
        this.Sid = Sid;
    }
    void setName(String Name) {
        this.Name = Name;
    }
    void setEmail(String Email) {
        this.Email = Email;
    }
    void setCity(String City) {
        this.City = City;
    }
}
