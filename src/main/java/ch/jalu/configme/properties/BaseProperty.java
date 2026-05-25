package ch.jalu.configme.properties;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.configme.properties.convertresult.PropertyValue;
import ch.jalu.configme.resource.PropertyReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Objects;

/**
 * Base implementation of {@link Property}. All properties should extend from this class.
 * <p>
 * This base implementation makes interacting with properties null safe by guaranteeing that the default value
 * and its {@link #determineValue determined value} can never be null.
 *
 * @param <T> the property type
 */
public abstract class BaseProperty<T> implements Property<T> {

    private final String path;

    private final T defaultValue;

    /**
     * Constructor.
     *
     * @param path the path of the property
     * @param defaultValue the default value of the property
     */
    public BaseProperty(@NotNull String path, @NotNull T defaultValue) {
        Objects.requireNonNull(path, "path");
        Objects.requireNonNull(defaultValue, "defaultValue");
        this.path = path;
        this.defaultValue = defaultValue;
    }

    @Override
    @NotNull
    public String getPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public T getDefaultValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public PropertyValue<T> determineValue(@NotNull PropertyReader reader) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isValidValue(@Nullable T value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Constructs the value of the property from the property reader. Returns null if no value is
     * available in the reader or if it cannot be used to construct a value for this property.
     *
     * @param reader the reader to read from
     * @param errorRecorder error recorder to register errors even if a valid value is returned
     * @return value based on the reader, or null if not applicable
     */
    @Nullable
    protected abstract T getFromReader(@NotNull PropertyReader reader, @NotNull ConvertErrorRecorder errorRecorder);

    @Override
    @NotNull
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
