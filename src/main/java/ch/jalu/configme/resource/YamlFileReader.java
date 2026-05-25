package ch.jalu.configme.resource;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.internal.PathUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.error.YAMLException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * YAML file reader.
 */
public class YamlFileReader implements PropertyReader {

    private final Path path;

    private final Charset charset;

    @Nullable
    private final Map<String, Object> root;

    /**
     * Constructor.
     *
     * @param path the file to load
     */
    public YamlFileReader(@NotNull Path path) {
        this(path, StandardCharsets.UTF_8);
    }

    /**
     * Constructor.
     *
     * @param path the file to load
     * @param charset the charset to read the data as
     */
    public YamlFileReader(@NotNull Path path, @NotNull Charset charset) {
        this.path = path;
        this.charset = charset;
        this.root = loadFile();
    }

    @Override
    @Nullable
    public Object getObject(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public String getString(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Integer getInt(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Double getDouble(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Boolean getBoolean(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public List<?> getList(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean contains(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Set<String> getKeys(boolean onlyLeafNodes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Set<String> getChildKeys(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Recursively collects keys from maps into the given set.
     *
     * @param path the path of the given map
     * @param map the map to process recursively
     * @param result set to save keys to
     * @param onlyLeafNodes whether only leaf nodes should be added to the result set
     */
    private void collectKeysIntoSet(@NotNull String path, @NotNull Map<String, Object> map, @NotNull Set<String> result, boolean onlyLeafNodes) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String childPath = PathUtils.concat(path, entry.getKey());
            if (!onlyLeafNodes || isLeafValue(entry.getValue())) {
                result.add(childPath);
            }
            if (entry.getValue() instanceof Map) {
                collectKeysIntoSet(childPath, (Map) entry.getValue(), result, onlyLeafNodes);
            }
        }
    }

    private static boolean isLeafValue(@Nullable Object o) {
        return !(o instanceof Map) || ((Map) o).isEmpty();
    }

    /**
     * Loads the values of the file.
     *
     * @return map with the values from the file
     */
    @Nullable
    protected Map<String, Object> loadFile() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Processes the map as read from SnakeYAML and may return a new, adjusted one.
     *
     * @param map the map to normalize
     * @return the normalized map (or same map if no changes are needed)
     */
    @Nullable
    protected Map<String, Object> normalizeMap(@Nullable Map<Object, Object> map) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final Path getPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the root value; may be null if the file was empty
     * @deprecated use {@code getObject("")} instead
     */
    @Deprecated
    @Nullable
    protected final Map<String, Object> getRoot() {
        return root;
    }

    /**
     * Gets the object at the given path and safely casts it to the given class's type. Returns null
     * if no value is available or if it cannot be cast.
     *
     * @param path the path to retrieve
     * @param clazz the class to cast to
     * @param <T> the class type
     * @return cast value at the given path, null if not applicable
     */
    @Nullable
    protected <T> T getTypedObject(@NotNull String path, @NotNull Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    private static Object getEntryIfIsMap(@NotNull String key, @Nullable Object value) {
        if (value instanceof Map<?, ?>) {
            return ((Map<?, ?>) value).get(key);
        }
        return null;
    }
}
