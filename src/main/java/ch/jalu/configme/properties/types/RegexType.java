package ch.jalu.configme.properties.types;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Property type and mapper leaf type for regex.
 */
public class RegexType extends PropertyAndLeafType<Pattern> {

    /**
     * Default regex type.
     */
    public static final RegexType REGEX = new RegexType();

    /**
     * Case-insensitive regex type.
     */
    public static final RegexType REGEX_CASE_INSENSITIVE = new RegexType() {

        @Override
        @NotNull
        protected Pattern compileToPattern(@NotNull String regex) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    };

    /**
     * Constructor. Use {@link RegexType#REGEX} for the standard behavior.
     */
    protected RegexType() {
        super(Pattern.class);
    }

    @Override
    @Nullable
    public Pattern convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object toExportValue(@NotNull Pattern value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Compiles the given string to a pattern object.
     *
     * @param regex the string to compile
     * @return the pattern object
     */
    @NotNull
    protected Pattern compileToPattern(@NotNull String regex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
