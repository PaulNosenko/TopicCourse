package topiccourse.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import topiccourse.dao.CourseRepository;
import topiccourse.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public ArrayList<Course> findAll(){
		return (ArrayList<Course>) courseRepository.findAll();
	}

	public ArrayList<Course> findByTopicId(Long topicId) {
		return courseRepository.findByTopicId(topicId);
	}
	
	public Course findOne(Long id) {
		return courseRepository.findOne(id);
	}
	//get name of the topic to whic course belongs
	public String getName(Long id) {
		for (Course c : courseRepository.findAll()) {
			if(c.getId().equals(id)) {
				return c.getTopic().getName();
			}
		}
		return null;
	}
	
}
