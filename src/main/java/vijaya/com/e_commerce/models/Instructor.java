package vijaya.com.e_commerce.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Instructor extends User{
    private Double salary;
    private String skill;


}
