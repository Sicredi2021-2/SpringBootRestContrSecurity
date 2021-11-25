package br.pucrs.sicredi.sprbootsecurity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/students/{studentId}/courses")
	//@GetMapping("/students/courses")S
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
		System.out.println("ENTROU AQUI");
		return studentService.retrieveCourses(studentId);
	}
}