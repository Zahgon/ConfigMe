package ch.jalu.configme.properties.types;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Property types for maps with strings as keys and any value type. The produced maps keep insertion order (as given
 * in the property resource). Maps produced by this type never have a null key or a null value.
 *
 * @param <V> the type of values in the map
 */
public class MapPropertyType<V> implements PropertyType<Map<String, V>> {

    private final PropertyType<V> valueType;

    /**
     * Constructor.
     *
     * @param valueType property type to handle the map's values
     */
    public MapPropertyType(@NotNull PropertyType<V> valueType) {
        this.valueType = valueType;
    }

    @Override
    @Nullable
    public Map<String, V> convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Map<String, Object> toExportValue(@NotNull Map<String, V> value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public final PropertyType<V> getValueType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return new map to which entries are added when converting
     */
    @NotNull
    protected Map<String, V> createResultMap() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Converts the given key value from the property reader to a String to be used as key. Returns null if
     * the value is invalid and has no appropriate representation.
     *
     * @param key the key to convert
     * @return string key, or null if not applicable
     */
    @Nullable
    protected String convertKeyToString(@Nullable Object key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
