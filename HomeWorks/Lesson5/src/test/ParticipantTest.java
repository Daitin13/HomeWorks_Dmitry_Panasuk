
import com.levelup.lesson5.Task1.Participant;
import com.levelup.lesson5.Task1.Status;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParticipantTest {
    Participant participant;


    @Test
    public void shouldOnStartLineTrue() {
        //GIVEN
        boolean expectedResult = true;
        participant = new Participant();
        //WHEN
        boolean actualResult = participant.onStartLine();
        //THEN
        assertTrue("Should on strt line is true", actualResult == expectedResult);
    }
    @Test
    public void shouldGoTrue() {
        //GIVEN
        boolean expectedResult = true;
        participant = new Participant(Status.GO);

        //WHEN
        boolean actualResult = participant.go();
        //THEN
        assertTrue("Should go is true", actualResult == expectedResult);
    }
    @Test
    public void shouldFinishTrue() {
        //GIVEN
        boolean expectedResult = true;
        ;
        participant = new Participant(Status.FINISH);

        //WHEN
        boolean actualResult = participant.finish();
        //THEN
        assertTrue("Should go is true", actualResult == expectedResult);
    }
    @Test
    public void shouldOnStartLineFalse() {
        //GIVEN
        boolean expectedResult = false;
        participant = new Participant(Status.FINISH);
        //WHEN
        boolean actualResult = participant.onStartLine();
        //THEN
        assertTrue("Should on strt line is true", actualResult == expectedResult);
    }
    @Test
    public void shouldGoFalse() {
        //GIVEN
        boolean expectedResult = false;
        participant = new Participant(Status.FINISH);

        //WHEN
        boolean actualResult = participant.go();
        //THEN
        assertTrue("Should go is true", actualResult == expectedResult);
    }
    @Test
    public void shouldFinishFalse() {
        //GIVEN
        boolean expectedResult = false;
        ;
        participant = new Participant(Status.GO);

        //WHEN
        boolean actualResult = participant.finish();
        //THEN
        assertTrue("Should go is true", actualResult == expectedResult);
    }
}
