package vijaya.com.e_commerce.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import vijaya.com.e_commerce.models.Instructor;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {

    List<Instructor> findByName(String name);
}
