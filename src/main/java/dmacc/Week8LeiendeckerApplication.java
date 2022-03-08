package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.PC;
import dmacc.controller.BeanConfig;
import dmacc.repository.PCRepo;

@SpringBootApplication
public class Week8LeiendeckerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Week8LeiendeckerApplication.class, args);
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		PC pc = appContext.getBean("pc", PC.class);
		System.out.println(pc.toString());
	}
	
	@Autowired
	PCRepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
				ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
		//Using an existing bean
				PC pc = appContext.getBean("pc", PC.class);
				pc.setProcessor(3500);
				repo.save(pc);
		//Creating a bean to use – not managed by Spring

				PC mypc = new PC("Nvidia GTX 1660ti", 9600, "Asus Rog Strix 750", 64 );
				
				repo.save(mypc);
				List<PC> allPCs = repo.findAll();
				
				for (PC pcs : allPCs) {
					System.out.println(pcs.toString());
				}
				((AbstractApplicationContext) appContext).close();
		
	}

}
