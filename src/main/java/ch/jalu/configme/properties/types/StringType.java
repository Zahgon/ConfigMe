package ch.jalu.configme.properties.types;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Locale;

/**
 * Property type and mapper leaf type for strings.
 */
public class StringType extends PropertyAndLeafType<String> {

    /**
     * Default string type.
     */
    public static final StringType STRING = new StringType();

    /**
     * Lowercase string type.
     */
    public static final StringType STRING_LOWER_CASE = new StringType() {

        @Override
        @NotNull
        protected String transformToString(@NotNull Object object) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    };

    /**
     * Constructor.
     */
    protected StringType() {
        super(String.class);
    }

    @Override
    @Nullable
    public String convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public String toExportValue(@NotNull String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Converts the given object to a string.
     *
     * @param object the object to convert
     * @return the converted object
     */
    @NotNull
    protected String transformToString(@NotNull Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return array property type whose elements are managed by {@code this} String type
     */
    @NotNull
    public ArrayPropertyType<String> arrayType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates an inline array property type with the given separator.
     * See {@link InlineArrayPropertyType} for more details.
     *
     * @param separator the sequence that acts as separator for multiple entries
     * @return inline array type with {@code this} type and the given separator
     */
    @NotNull
    public InlineArrayPropertyType<String> inlineArrayType(@NotNull String separator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
