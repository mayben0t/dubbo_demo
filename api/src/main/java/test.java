import model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.PersonService;

public class test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        PersonService bean = context.getBean(PersonService.class);
        Person personById = bean.findPersonById(1);
        System.out.println("result: "+personById);
    }
}
