package golf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import golf.beans.Course;
import golf.controller.BeanConfiguration;
import golf.repository.CourseRepository;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Apr 26, 2023
 */

@SpringBootApplication
public class SpringGolfCoursesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringGolfCoursesApplication.class, args);
	}
	
	@Autowired
	CourseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// using an existing bean
		Course c = appContext.getBean("course", Course.class);
		c.setCity("Granger");
		repo.save(c);
		
		// using another existing bean
		Course d = appContext.getBean("course2", Course.class);
		d.setCity("Waukee");
		d.setHoleAmount(9);
		repo.save(d);
		
		// creating a bean to use that's not managed by Spring
		Course e = new Course("Glen Oaks Country Club", "West Des Moines", false, 18);
		repo.save(e);
		
		// creating list to store golf courses
		List<Course> allMyCourses = repo.findAll();
		
		// for loop to print all courses in the database
		for(Course courses: allMyCourses) {
			System.out.println(courses.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
