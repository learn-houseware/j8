package houseware.learn.j8.stream.exercises;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static houseware.learn.j8.stream.exercises.Grouping.groupByNationality7;
import static houseware.learn.j8.stream.exercises.Grouping.groupByNationality8;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author fphilip@houseware.es
 */
public class GroupingTest {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Francisco", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>> result = groupByNationality7(collection);
        assertThat(result.get("Norwegian")).hasSameElementsAs(asList(sara, eva));
        assertThat(result.get("Serbian")).hasSameElementsAs(asList(viktor));
    }

    @Test
    public void compare() {
        Person sara = new Person("Sara", 4, "Norwegian");
        Person viktor = new Person("Francisco", 40, "Serbian");
        Person eva = new Person("Eva", 42, "Norwegian");
        List<Person> collection = asList(sara, eva, viktor);
        Map<String, List<Person>>  g7= groupByNationality7(collection);
        Map<String, List<Person>>  g8= groupByNationality8(collection);
        assertThat(g7.get("Norwegian")).hasSameElementsAs(g8.get("Norwegian"));
        assertThat(g7.get("Serbian")).hasSameElementsAs(g8.get("Serbian"));
    }

}
