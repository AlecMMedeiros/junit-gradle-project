import br.com.bcoder.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PersonTest {
  @Test
  void validateGetAge(){
    Person testPerson = new Person("MrTest", LocalDate.of(2004, 1, 1 ));
    Assertions.assertEquals(19, testPerson.getAge());
  }

}
