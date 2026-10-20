package Logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private static final Logger log = 
            LoggerFactory.getLogger(StudentService.class);

    public String registerStudent(String name) {
        log.info("Registering student: {}", name);
        
        if (name == null || name.isBlank()) {
            log.warn("Student name is empty");
            throw new IllegalArgumentException(
                    "Student name cannot be empty");
        }
        
        log.info("Student registered successfully: {}", name);
        return "Student registered: " + name;
    }
}