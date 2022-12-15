package learn.spring.studentmanagementsystemcrud.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    // Student a Entity having
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false) //for custom name and not null
    private String fName;
    @Column(name = "last_name", nullable = false)
    private String lName;
    private String email; //will create column name as of the field i.e. email if not assigned

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Student (){

    }

    public Student(String fName, String lName, String email) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }
}
