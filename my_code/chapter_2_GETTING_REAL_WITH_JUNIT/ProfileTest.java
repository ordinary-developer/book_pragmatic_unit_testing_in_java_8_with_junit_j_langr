//import static org.junit.Assert.*;
import org.junit.*;
import static org.hamcrest.CoreMatchers.*;

public class ProfileTest {
    private Profile profile;
    private BooleanQuestion question;
    private Criteria criteria;

    @Before 
    public void create() {
        profile = new Profile("Bull Hocky, Inc.");
        question = new BooleanQuestion(1, "Got bonuses?");
        criteria = new Criteria();
    }    

    @Test
    public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
        // [ARRANGE]
        profile.add(new Answer(question, Bool.FALSE));
        criteria.add(new Criterion(new Answer(question, Bool.TRUE),
                                   Weight.MustMatch));
        // [ACT]
        boolean matches = profile.matches(criteria);
        // [ASSERT]
        Assert.assertFalse(matches);
    }

    @Test
    public void matchAnswersTrueForAnyDontCareCriteria() {
        // [ARRANGE]
        profile.add(new Answer(question, Bool.FALSE));
        criteria.add(new Criterion(new Answer(question, Bool.TRUE),
                                   Weight.DontCare));
        // [ACT]
        boolean matches = profile.matches(criteria);
        // [ASSERT]
        Assert.assertTrue(matches);
    }
}
