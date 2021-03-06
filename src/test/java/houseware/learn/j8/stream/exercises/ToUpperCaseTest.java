package houseware.learn.j8.stream.exercises;

import org.junit.Test;

import java.util.List;

import static houseware.learn.j8.stream.exercises.ToUpperCase.transform7;
import static houseware.learn.j8.stream.exercises.ToUpperCase.transform8;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author fphilip@houseware.es
 */
public class ToUpperCaseTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        List<String> expected = asList("MY", "NAME", "IS", "JOHN", "DOE");
        assertThat(transform7(collection)).hasSameElementsAs(expected);
    }

    @Test
    public void compare() {
        List<String> collection = asList("My", "name", "is", "John", "Doe");
        assertThat(transform7(collection)).hasSameElementsAs(transform8(collection));
    }

}
