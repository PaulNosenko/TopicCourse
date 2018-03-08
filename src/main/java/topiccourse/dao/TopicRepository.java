package topiccourse.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import topiccourse.model.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long>{

}
