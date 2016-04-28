package kz.tezdet.lessons.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId ;
    @Column(name = "first_name")
    private String firstName ;
    @Column(name = "last_name")
    private String lastName ;
    @Column(name = "email")
    private String email ;
    @Column(name = "phone")
    private String phone ;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private StudentAddress address ;

    public Student(){

    }

    public Student(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public StudentAddress getAddress() {
        return address;
    }

    public void setAddress(StudentAddress address) {
        this.address = address;
    }
}
