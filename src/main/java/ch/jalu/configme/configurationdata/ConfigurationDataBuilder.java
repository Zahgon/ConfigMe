package ch.jalu.configme.configurationdata;

import ch.jalu.configme.Comment;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.internal.ReflectionHelper;
import ch.jalu.configme.properties.Property;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Utility class responsible for creating {@link ConfigurationData} by retrieving {@link Property} fields
 * from {@link SettingsHolder} implementations and gathering all comments.
 */
public class ConfigurationDataBuilder {

    @NotNull
    private final PropertyListBuilder propertyListBuilder;

    @NotNull
    private final CommentsConfiguration commentsConfiguration;

    /**
     * Constructor. Use {@link #createConfiguration(Class[])} or a similar static method to create configuration data.
     * Use the constructors of this class only if you are overriding specific behavior.
     */
    protected ConfigurationDataBuilder() {
        this(new PropertyListBuilder(), new CommentsConfiguration());
    }

    /**
     * Constructor. Use {@link #createConfiguration(Class[])} or a similar static method to create configuration data.
     * Use the constructors of this class only if you are overriding specific behavior.
     *
     * @param propertyListBuilder property list builder to order and validate property paths
     * @param commentsConfiguration comments configuration to keep track of all comments
     */
    public ConfigurationDataBuilder(@NotNull PropertyListBuilder propertyListBuilder, @NotNull CommentsConfiguration commentsConfiguration) {
        this.propertyListBuilder = propertyListBuilder;
        this.commentsConfiguration = commentsConfiguration;
    }

    /**
     * Collects all properties and comment data from the provided classes.
     * Properties are sorted by their group, and each group is sorted by order of encounter.
     *
     * @param classes the classes to scan for their property data
     * @return collected configuration data
     */
    @SafeVarargs
    @NotNull
    public static ConfigurationData createConfiguration(@NotNull Class<? extends SettingsHolder>@NotNull ... classes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Collects all properties and comment data from the provided classes.
     * Properties are sorted by their group, and each group is sorted by order of encounter.
     *
     * @param classes the classes to scan for their property data
     * @return collected configuration data
     */
    @NotNull
    public static ConfigurationData createConfiguration(@NotNull Iterable<Class<? extends SettingsHolder>> classes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Manually creates configuration data with the given properties, without any comments. Note that the given
     * properties must be in an order that is suitable for exporting. For instance, the default YAML file resource
     * requires that all properties with the same parent be grouped together (see {@link PropertyListBuilder}).
     *
     * @param properties the properties that make up the configuration data
     * @return configuration data with the given properties
     */
    @NotNull
    public static ConfigurationData createConfiguration(@NotNull List<? extends Property<?>> properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Manually creates configuration data with the given properties and comments. Note that the given
     * properties must be in an order that is suitable for exporting. For instance, the default YAML file resource
     * requires that all properties with the same parent be grouped together.
     *
     * @param properties the properties that make up the configuration data
     * @param commentsConfiguration the comments to include in the export
     * @return configuration data with the given properties
     */
    @NotNull
    public static ConfigurationData createConfiguration(@NotNull List<? extends Property<?>> properties, @NotNull CommentsConfiguration commentsConfiguration) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Collects property data and comment info from the given class and creates a configuration data
     * instance with it.
     *
     * @param classes the classes to process
     * @return configuration data with the classes' data
     */
    @NotNull
    public ConfigurationData collectData(@NotNull Iterable<Class<? extends SettingsHolder>> classes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Registers all property fields of the given class to this instance's property list builder.
     *
     * @param clazz the class to process
     */
    protected void collectProperties(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final PropertyListBuilder getPropertyListBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final CommentsConfiguration getCommentsConfiguration() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void setCommentForPropertyField(@NotNull Field field, @NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the given field's value if it is a static {@link Property}.
     *
     * @param field the field's value to return
     * @return the property the field defines, or null if not applicable
     */
    @Nullable
    protected Property<?> getPropertyField(@NotNull Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void collectSectionComments(@NotNull Class<? extends SettingsHolder> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates an instance of the given settings holder class.
     *
     * @param clazz the class to instantiate
     * @param <T> the class type
     * @return instance of the class
     */
    @NotNull
    protected <T extends SettingsHolder> T createSettingsHolderInstance(@NotNull Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns all fields of the class which should be considered as potential {@link Property} definitions.
     * Considers the class's parents.
     *
     * @param clazz the class whose fields should be returned
     * @return stream of all the fields to process
     */
    @NotNull
    protected Stream<Field> findFieldsToProcess(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
