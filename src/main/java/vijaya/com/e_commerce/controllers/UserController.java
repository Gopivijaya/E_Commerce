package vijaya.com.e_commerce.controllers;

import org.springframework.web.bind.annotation.*;
import vijaya.com.e_commerce.dtos.CreateUserDto;
import vijaya.com.e_commerce.models.Instructor;
import vijaya.com.e_commerce.models.User;
import vijaya.com.e_commerce.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User createUser(@RequestBody CreateUserDto createUserDto) {
        return userService.
                createUser(createUserDto.getName(), createUserDto.getEmail());
    }

    @PostMapping("/instructor")
    public Instructor createInstructor(@RequestBody CreateUserDto createUserDto) {
        return userService.
                createInstructor(createUserDto.getName(), createUserDto.getEmail());
    }

    @GetMapping("/{name}")
    public List<User> getUserByName(@PathVariable(name = "name") String name) {
        return userService.getUserByName(name);
    }

    @GetMapping("/instructor/{name}")
    public List<Instructor> getInstructorByName(@PathVariable(name = "name") String name) {
        return userService.getInstructorByName(name);
    }

}
