package houseware.learn.j8.stream.exercises;

import org.junit.Test;

import java.util.List;

import static houseware.learn.j8.stream.exercises.Sum.*;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author fphilip@houseware.es
 */
public class SumTest {

    @Test
    public void transformShouldConvertCollectionElementsToUpperCase() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate7(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

    @Test
    public void compare() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        List<Integer> nulls = asList(null,null);
        assertThat(calculate7(numbers)).isEqualTo(calculate8_(nulls));
    }

}
