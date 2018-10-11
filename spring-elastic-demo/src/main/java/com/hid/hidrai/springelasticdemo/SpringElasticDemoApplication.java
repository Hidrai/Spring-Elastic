package com.hid.hidrai.springelasticdemo;

import com.hid.hidrai.springelasticdemo.developer.model.Developer;
import com.hid.hidrai.springelasticdemo.developer.service.DeveloperService;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class SpringElasticDemoApplication implements CommandLineRunner{

	@Autowired
	private ElasticsearchOperations es;

	@Autowired
	private DeveloperService developerService;

	public static void main(String[] args) {
		SpringApplication.run(SpringElasticDemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception
	{
		printElasticSearchInfo();

		developerService.save(new Developer("1","Hidrai","Kairys","Java","hidrai13@gmail.com"));
		developerService.save(new Developer("2","Darius","Kairys","Java","13@gmail.com"));
		developerService.save(new Developer("3","Jhon","Seen","C++","drai@gmail.com"));
		developerService.save(new Developer("4","Lee","Long","Java","rai@gmail.com"));
		developerService.save(new Developer("5","Adam","Thoryy","C#","asd@gmail.com"));
		List<Developer> developersName = developerService.findByName("Hidrai");
		List<Developer> developersEmail = developerService.findByEmail("hidrai13@gmail.com");
		List<Developer> developersSpec = developerService.findBySpec("Java");

		//developersName.forEach(x -> System.out.println(x));

		developerService.delete(developersName.get(0));

	}

	private void printElasticSearchInfo() {

		System.out.println("--ElasticSearch--");
		Client client = es.getClient();
		Map<String, String> asMap = client.settings().getAsMap();

		asMap.forEach((k, v) -> {
			System.out.println(k + " = " + v);
		});
		System.out.println("--ElasticSearch--");
	}
}
