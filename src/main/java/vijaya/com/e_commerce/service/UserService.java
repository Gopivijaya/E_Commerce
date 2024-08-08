package vijaya.com.e_commerce.service;


import org.springframework.stereotype.Service;
import vijaya.com.e_commerce.models.Instructor;
import vijaya.com.e_commerce.models.User;
import vijaya.com.e_commerce.repository.InstructorRepository;
import vijaya.com.e_commerce.repository.UserRepository;

import java.util.List;

@Service
public class UserService {


    private final UserRepository userRepository;
    private final InstructorRepository instructorRepository;

    public UserService(UserRepository userRepository, InstructorRepository instructorRepository) {
        this.userRepository = userRepository;
        this.instructorRepository = instructorRepository;
    }

    public User createUser(String name, String email) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }

    public Instructor createInstructor(String name, String email) {
        Instructor instructor = new Instructor();
        instructor.setName(name);
        instructor.setEmail(email);
        instructor.setSalary(20000.0);
        instructor.setSkill("Backend");

        instructorRepository.save(instructor);
        return instructor;
    }

    public List<User> getUserByName(String name) {
        return userRepository.findByName(name);

    }

    public List<Instructor> getInstructorByName(String name) {
        return instructorRepository.findByName(name);
    }
}
