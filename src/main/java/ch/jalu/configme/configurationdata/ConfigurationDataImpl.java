package ch.jalu.configme.configurationdata;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.convertresult.PropertyValue;
import ch.jalu.configme.resource.PropertyReader;
import org.jetbrains.annotations.NotNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.lang.String.format;

/**
 * Contains information about the available properties and their associated comments.
 */
public class ConfigurationDataImpl implements ConfigurationData {

    @NotNull
    private final List<Property<?>> properties;

    @NotNull
    private final Map<String, List<String>> allComments;

    @NotNull
    private final Map<String, Object> values;

    private boolean allPropertiesValidInResource;

    /**
     * Constructor. See also {@link ConfigurationDataBuilder}.
     *
     * @param allProperties all known properties
     * @param allComments map of comments by path
     */
    protected ConfigurationDataImpl(@NotNull List<? extends Property<?>> allProperties, @NotNull Map<String, List<String>> allComments) {
        this.properties = Collections.unmodifiableList(allProperties);
        this.allComments = Collections.unmodifiableMap(allComments);
        this.values = new HashMap<>();
    }

    @Override
    @NotNull
    public List<Property<?>> getProperties() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public List<String> getCommentsForSection(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Map<String, List<String>> getAllComments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    @NotNull
    public <T> T getValue(@NotNull Property<T> property) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <T> void setValue(@NotNull Property<T> property, @NotNull T value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void initializeValues(@NotNull PropertyReader reader) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
     * Saves the value for the provided property as determined from the reader and returns whether the
     * property is represented in a fully valid way in the resource.
     */
    protected <T> boolean setValueForProperty(@NotNull Property<T> property, @NotNull PropertyReader reader) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean areAllValuesValidInResource() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected Map<String, Object> getValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
