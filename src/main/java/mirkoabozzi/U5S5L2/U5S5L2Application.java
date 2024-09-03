package mirkoabozzi.U5S5L2;

import mirkoabozzi.U5S5L2.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5S5L2Application {

	public static void main(String[] args) {
		SpringApplication.run(U5S5L2Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5S5L2Application.class);

		Menu menu = ctx.getBean(Menu.class);

		menu.getProduct().forEach(System.out::println);
	}

}
