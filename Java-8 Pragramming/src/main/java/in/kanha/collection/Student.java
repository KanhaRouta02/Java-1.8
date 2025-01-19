package in.kanha.collection;
import java.util.List;

public class Student {
    private Integer id;
    private Integer roll;
    private String name;
    private String email;
    private String address;
    private List<String> activities;

    public Student(Integer id, Integer roll, String name, String email, String address, List<String> activities) {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.email = email;
        this.address = address;
        this.activities = activities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", activities=" + activities +
                '}';
    }




}
