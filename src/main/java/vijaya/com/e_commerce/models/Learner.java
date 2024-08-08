package vijaya.com.e_commerce.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Learner extends User{
    private String university;
    private Double psp;
}
