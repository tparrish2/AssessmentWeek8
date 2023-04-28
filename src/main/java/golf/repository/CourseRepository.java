package golf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import golf.beans.Course;

/**
 * @author Trevor Parrish - tparrish2
 * CIS175 - Spring 2023
 * Apr 26, 2023
 */

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> { }
