package ch.jalu.configme.properties.types;

import ch.jalu.configme.internal.ConversionUtils;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.typeresolver.EnumUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Property type for an enum type.
 *
 * @param <E> the enum type
 */
public class EnumPropertyType<E extends Enum<E>> implements PropertyType<E> {

    private final Class<E> enumType;

    /**
     * Constructor. You can also create instances with {@link EnumPropertyType#of}.
     *
     * @param enumType the enum type this type should convert to
     */
    public EnumPropertyType(@NotNull Class<E> enumType) {
        this.enumType = enumType;
    }

    @NotNull
    public static <E extends Enum<E>> EnumPropertyType<E> of(@NotNull Class<E> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    @Nullable
    public E convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public String toExportValue(@NotNull E value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public final Class<E> getEnumClass() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return array property type whose elements are managed by {@code this} enum type
     */
    @NotNull
    public ArrayPropertyType<E> arrayType() {
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
    public InlineArrayPropertyType<E> inlineArrayType(@NotNull String separator) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
