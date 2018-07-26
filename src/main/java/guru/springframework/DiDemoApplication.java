package guru.springframework;

import guru.springframework.controllers.MyController;
import guru.springframework.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println("Username: " + fakeDataSource.getUsername());
	}
}
