package vijaya.com.e_commerce.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
// telling hibernate to create a table for you
@Entity
public class User {
    @Id
    @GeneratedValue
    private UUID id;
    // 49d97be6-a46c-4ea5-8f38-056e59dada8a

    private String name;
    @Column(name = "email_address", unique = true)
    private String email;
}
