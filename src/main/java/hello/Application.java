package hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello worldddddddddddd";
    }
    @Autowired
	private TopicServices topicSerivces;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicSerivces.getAllTopics();
	}
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}