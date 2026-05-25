package ch.jalu.configme.resource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * Normalizes the keys of maps, ensuring that all keys are Strings.
 */
public class MapNormalizer {

    /**
     * Normalizes the raw map read from a property resource for further use in a property reader.
     *
     * @param loadedMap the map to normalize
     * @return new map with sanitized structure (or same if no changes are needed)
     */
    @SuppressWarnings("unchecked")
    @Nullable
    public Map<String, Object> normalizeMap(@Nullable Map<Object, Object> loadedMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Processes the given value if it is a Map and returns an Optional with a new Map if the input
     * value is not in its "normalized form". Recursively visits and replaces nested maps.
     *
     * @param value the value to process
     * @return optional with a new map to replace the given one with, empty optional if not needed or not applicable
     */
    @NotNull
    protected Optional<Map<String, Object>> createNormalizedMapIfNeeded(@NotNull Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean isKeyInvalid(@NotNull Object key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the provided value into the given map, keeping any intermediate nested maps which may already exist.
     *
     * @param map the map to add the value to
     * @param path the path to store the value under
     * @param value the value to store
     */
    protected void addValueIntoMap(@NotNull Map<String, Object> map, @NotNull String path, @NotNull Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the nested map in the given {@code parentMap} at the given {@code path}, inserting
     * one if none is yet present. Periods in the path argument are not handled by this method.
     * Note that this method overrides any non-Map values stored at the given path.
     *
     * @param parentMap the map to retrieve the nested map from
     * @param path the key with which the value should be looked up from the map
     * @return the nested map, as stored under the path in the given map
     */
    @NotNull
    protected Map<String, Object> getOrInsertMap(@NotNull Map<String, Object> parentMap, @NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
