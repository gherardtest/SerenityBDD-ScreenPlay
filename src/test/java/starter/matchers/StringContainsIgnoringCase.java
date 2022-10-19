package starter.matchers;

import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.core.SubstringMatcher;

public class StringContainsIgnoringCase extends SubstringMatcher {
    public StringContainsIgnoringCase(String substring) {
        super(substring);
    }

    protected boolean evalSubstringOf(String string) {
        return string.toLowerCase().contains(this.substring.toLowerCase());
    }

    protected String relationship() {
        return "containing";
    }

    @Factory
    public static Matcher<String> containsIgnoringCase(String substring) {
        return new StringContainsIgnoringCase(substring);
    }
}
