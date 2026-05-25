package ch.jalu.configme.properties.types;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Optional;

/**
 * Property type for optionals. Wraps another property type.
 *
 * @param <T> the value type of the optional
 */
public class OptionalPropertyType<T> implements PropertyType<Optional<T>> {

    private final PropertyType<T> valueType;

    /**
     * Constructor.
     *
     * @param valueType the property type to handle the value inside the optional
     */
    public OptionalPropertyType(PropertyType<T> valueType) {
        this.valueType = valueType;
    }

    @Override
    @NotNull
    public Optional<T> convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object toExportValue(@NotNull Optional<T> value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
