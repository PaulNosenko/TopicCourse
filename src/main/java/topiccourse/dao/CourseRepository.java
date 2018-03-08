package topiccourse.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import topiccourse.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

	ArrayList<Course> findByTopicId(Long topicId);
}
