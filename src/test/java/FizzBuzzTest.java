import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz=new FizzBuzz();

    @Test
    void shouldReturnOneWhenInputIsOne(){
      assertThat(fizzBuzz.of(1),is("1"));
    }

    @Test
    void shouldReturnFizzWhenInputIsThreeAndItsMultiples(){
        assertThat(fizzBuzz.of(3),is("Fizz"));
    }

    @Test
    void shouldReturnFizzWhenInputContainThreeInIt(){
        assertThat(fizzBuzz.of(13),is("Fizz"));
    }

    @Test
    void shouldReturnBuzzWhenInputIsFiveAndItsMultiples(){
        assertThat(fizzBuzz.of(5),is("Buzz"));
//        assertThat(fizzBuzz.of(160),is("Buzz"));
    }

    @Test
    void shouldReturnFizzWhenInputContainFiveInIt(){
        assertThat(fizzBuzz.of(52),is("Buzz"));
    }

    @Test
    void shouldReturnFizzBuzzWhenInputIsMultipleOfThreeAndContainFiveInItAndOtherWayAround(){
        assertThat(fizzBuzz.of(51),is("FizzBuzz"));
        assertThat(fizzBuzz.of(130),is("FizzBuzz"));
    }

    @Test
    void shouldReturnFizzBuzzWhenInputContainThreeAndFiveInIt(){
        assertThat(fizzBuzz.of(53),is("MasterFizzBuzz"));
    }

    @Test
    void shouldReturnMasterFizzBuzzWhenInputIsDivisibleByThreeAndFive(){
        assertThat(fizzBuzz.of(60),is("MasterFizzBuzz"));
    }

    @Test
    void shouldReturnGrandMasterWhenInputIsDivisibleByThreeAndFiveAndContainThreeOrFiveInIt(){
        assertThat(fizzBuzz.of(15),is("GrandMasterFizzBuzz"));
    }

    @Test
    void shouldReturnGrandMasterWhenInputContainThreeAndFiveInItAndDivisibleByThreeOrFive(){
        assertThat(fizzBuzz.of(35),is("GrandMasterFizzBuzz"));
    }

    @Test
    void shouldReturnLegendaryGrandMasterFizzBuzzWhenInputIsDivisibleByThreeAndFiveOrContainThreeAndFiveInIt(){
        assertThat(fizzBuzz.of(135),is("LegendaryGrandMasterFizzBuzz"));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenInputIsBeyondRange(){
        assertThrows(IllegalArgumentException.class,()-> fizzBuzz.of(200));
    }

}
