package ec.clicka.springboot.learnjpaandhibernate.course.springdatajpa;

import ec.clicka.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

}
