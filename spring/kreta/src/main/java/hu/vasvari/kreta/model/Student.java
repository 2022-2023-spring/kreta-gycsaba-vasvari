package hu.vasvari.kreta.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name="student")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected long id;
    @NotBlank(message = "Name is mandatory")
    @Column(name="name", length=30, nullable=false, unique=false)
    private String fullName;
    @Column(name = "birthday",nullable = true,unique = false)
    @JsonFormat(pattern="yyyy.MM.dd", timezone = "Europe/Budapest")
    private Date birthday;
    @Column(name = "iswoman",nullable = false,unique = false)
    private boolean isWoman;

    public boolean getIsWoman(){
        return isWoman;
    }

    public void setWoman(boolean isWoman)
    {
        this.isWoman=isWoman;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", isWoman=" + isWoman +
                '}';
    }
}
