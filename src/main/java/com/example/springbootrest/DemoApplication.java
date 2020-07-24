package com.example.springbootrest;

// import com.example.springbootrest.model.Emp;
// import com.example.springbootrest.repository.EmpRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.autoconfigure.domain.EntityScan;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*
@ComponentScan({"com.example.springbootrest.controller"})
@EntityScan({"com.example.springbootrest.model"})
@EnableJpaRepositories({"com.example.springbootrest.service"})
*/
public class DemoApplication /*implements CommandLineRunner*/  {
	/*
	@Autowired
	private EmpRepository empRepository;

	@Autowired
	public DemoApplication(EmpRepository empRepository ){
		this.empRepository = empRepository;
	}
	*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	/*
	@Override
           public void run(String... args) throws Exception {
                      // empRepository.save(new Emp(1, "이종철", 9000000));
                      empRepository.save(new Emp(2, "연개소문", 3000000));
                      empRepository.save(new Emp(3, "강감찬", 6000000));
                      empRepository.save(new Emp(4, "이순신", 7000000));
                      empRepository.save(new Emp(5, "김유신", 2000000));
 
		   }
	*/

}
