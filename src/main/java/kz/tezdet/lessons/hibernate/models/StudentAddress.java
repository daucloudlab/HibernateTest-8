package kz.tezdet.lessons.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "student_address")
public class StudentAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id ;
    @Column(name = "address")
    private String address ;
    @Column(name="city")
    private String city ;
    @Column(name = "country")
    private String country ;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Student student ;

    public StudentAddress(){

    }
    public StudentAddress(String address, String city, String country) {
        this.address = address;
        this.city = city;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
