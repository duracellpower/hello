package firstProject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;


    @BeforeEach
    void setUp() {
        person = new Person();
    }

   //@Test
   //void getFirstName() {
   //    person.setFirstName("Ilona");
   //    assertEquals("Ilona", person.getFirstName());
   //}


    @Test
    void getFirstName() {
        person.setFirstName("Ilona");
        assertEquals("Ilona", person.getFirstName());
    }

    @Test
    void setFirstName() {
        String expected ="Siegrist";
        String result = person.getFirstName();
        assertEquals("Siegrist", result);
    }

    @Test
    void getLastName() {
    }

    @Test
    void setLastName() {
    }

    @Test
    void getBirthDate() {
    Date result = person.getBirthDate();
    assertEquals("28-10-1991", result);
    }

    @Test
    void setBirthDate() throws ParseException {
        Date expected = new SimpleDateFormat("dd/MM/yyyy").parse("28/10/1991");
        person.setBirthDate(expected);
        Date result = person.getBirthDate();
        assertEquals(expected, result);
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }
}