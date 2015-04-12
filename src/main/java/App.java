import java.util.List;
import java.util.Random;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bizarq.sgt.domain.Person;
import com.bizarq.sgt.service.Service;

public class App {
	private static Log log = LogFactory.getLog(App.class);

	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
		Service service = (Service) cxt.getBean("service");

		log.info("Running App...");

		System.out.println("List<Person> persons = service.selectAllPerson()");
		List<Person> persons = service.selectAllPerson();
		System.out.println("-> " + persons + "\n");
		System.out.println(persons.size());

		System.out.println("Person person = service.selectPerson(2)");
		Person person = service.selectPerson(2);
		System.out.println("-> " + person.getName() + "\n");

		System.out.println("service.insertPerson(person)");
		person.setId(5);
		person.setName("Inserted person");
		service.insertPerson(person);
		System.out.println("-> inserted..." + "\n");

		System.out.println("List<Person> persons = service.selectAllPerson()");
		persons = service.selectAllPerson();
		System.out.println("-> " + persons + "\n");
	}
}
