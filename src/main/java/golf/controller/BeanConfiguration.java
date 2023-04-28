package golf.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import golf.beans.Course;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Apr 26, 2023
 */

@Configuration
public class BeanConfiguration {

	@Bean
	public Course course() {
		Course bean = new Course();
		bean.setCourseName("Jester Park");
		return bean;
	}
	
	@Bean
	public Course course2() {
		Course bean = new Course();
		bean.setCourseName("Sugar Creek");
		return bean;
	}
}
