package testtaskclasses;

import org.junit.Test;
import by.epam.learn.taskclasses.StudentAction;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public  void studentFindIdByName(){
        long actual = 1;
        long expected = StudentAction.studentFindIdByName(StudentAction.studentCreator(),"Fedor");
        assertEquals(expected, actual);

    }

}
