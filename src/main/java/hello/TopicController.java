package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicServices topicSerivces;

	/*@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicSerivces.getAllTopics();
	}*/
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id){
		return topicSerivces.getTopic(id);

	}
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic){
		topicSerivces.addTopic(topic);

	}
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
		topicSerivces.updateTopic(id,topic);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		 topicSerivces.deleteTopic(id);

	}
}
