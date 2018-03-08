package topiccourse.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import topiccourse.dao.TopicRepository;
import topiccourse.model.Course;
import topiccourse.model.Topic;
import topiccourse.service.CourseService;
import topiccourse.service.TopicService;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private TopicService topicService;
	@Autowired
	private CourseService courseService;
	@Autowired
	private TopicRepository topicRepository;
	
	//ALL
	@CrossOrigin
	@RequestMapping(value = "/courses", method = RequestMethod.GET, produces = "application/json")
	public List<Course> findAllCourses(){
		return courseService.findAll();	
	}
	//COURSE WITH @ID
	@RequestMapping(value = "/courses/{id}", method = RequestMethod.GET, produces = "application/json")
	public Map<String, Course> findOneCourse(@PathVariable Long id){
		Map<String, Course> map = new HashMap<String, Course>();
		map.put("course", courseService.findOne(id));
		return map;
	}
	
	//all topics 
	@RequestMapping(value = "/topics", method = RequestMethod.GET, produces = "application/json")
	public Map<String, ArrayList<Topic>> findAllTopics(){
		Map<String, ArrayList<Topic>> map = new HashMap<String, ArrayList<Topic>>();
		map.put("results", (ArrayList<Topic>) topicRepository.findAll());
		return map;
	}

	// topic at  stated id
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.GET, produces = "application/json")
	public Map<String, Topic> findOneTopic(@PathVariable Long id){
		Map<String, Topic> map = new HashMap<String, Topic>();
		map.put("results", topicRepository.findOne(id));
		return map;
	}
	
	/*all courses
	@RequestMapping(value = "/courses", method = RequestMethod.GET, produces = "application/json")
	public ArrayList<Course> findAllCourses(){
		return courseService.findAll();
	}
	
	//return course with id stated
	@RequestMapping(value = "/courses/{id}", method = RequestMethod.GET, produces = "application/json")
	public Course findOneCourse(@PathVariable Long id){
		return courseService.findOne(id);
	}
	
	//all topics 
	@RequestMapping(value = "/topics", method = RequestMethod.GET, produces = "application/json")
	public ArrayList<Topic> findAllTopics(){
		return (ArrayList<Topic>) topicRepository.findAll();
	}

	// topic at  stated id
	@RequestMapping(value = "/topics/{id}", method = RequestMethod.GET, produces = "application/json")
	public Topic findOneTopic(@PathVariable Long id){
		return topicRepository.findOne(id);
	}*/
	
}
