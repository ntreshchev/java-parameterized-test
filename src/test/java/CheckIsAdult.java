import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {0, false},
                {12, false},
                {19, true},
                {22, true},
                /* {1, false},
                 {16, false},
                 {18, true},
                 {21, true},
                 {19, true},
                 {20, true},
                 {22, true},
                 {23, true},*/
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Программа работает некорректно", result, isAdult);
    }
}