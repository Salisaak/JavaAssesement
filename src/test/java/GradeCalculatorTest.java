import org.junit.Assert;
import org.junit.Test;
import one2eight.GradeCalculator;
public class GradeCalculatorTest extends GradeCalculator {

        @Test
                public void calculateTest() {
            int[] leGrades = {50, 40, 60, 80, 90};
            int expected =320;
            int actual = calculateGrades(leGrades);
            Assert.assertEquals(expected,actual);


            System.out.println(calculateGrades(leGrades));


        }
}
