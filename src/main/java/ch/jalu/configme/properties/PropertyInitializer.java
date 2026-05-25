package ch.jalu.configme.properties;

import ch.jalu.configme.properties.builder.ArrayPropertyBuilder;
import ch.jalu.configme.properties.builder.CollectionPropertyBuilder;
import ch.jalu.configme.properties.builder.MapPropertyBuilder;
import ch.jalu.configme.properties.types.ArrayPropertyType;
import ch.jalu.configme.properties.types.BooleanType;
import ch.jalu.configme.properties.types.EnumPropertyType;
import ch.jalu.configme.properties.types.InlineArrayPropertyType;
import ch.jalu.configme.properties.types.ListPropertyType;
import ch.jalu.configme.properties.types.NumberType;
import ch.jalu.configme.properties.types.PropertyType;
import ch.jalu.configme.properties.types.RegexType;
import ch.jalu.configme.properties.types.SetPropertyType;
import ch.jalu.configme.properties.types.StringType;
import org.jetbrains.annotations.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.regex.Pattern;

/**
 * Convenience class for instantiating {@link Property} objects. You can use
 * a static import for the methods for a short, convenient way to declare properties.
 * <p>
 * If you use additional property types, it may make the most sense to write your own
 * property initializer class similar to this one, or extend this class to keep the
 * default methods.
 */
public class PropertyInitializer {

    protected PropertyInitializer() {
        // Protected constructor to allow inheritance
    }

    /**
     * Creates a new boolean property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static BooleanProperty newProperty(@NotNull String path, boolean defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new short property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static ShortProperty newProperty(@NotNull String path, short defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new integer property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static IntegerProperty newProperty(@NotNull String path, int defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new long property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static LongProperty newProperty(@NotNull String path, long defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new float property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static FloatProperty newProperty(@NotNull String path, float defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new double property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static DoubleProperty newProperty(@NotNull String path, double defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new String property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static StringProperty newProperty(@NotNull String path, @NotNull String defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new enum property.
     *
     * @param clazz the enum class
     * @param path the property's path
     * @param defaultValue the default value
     * @param <E> the enum type
     * @return the created enum property
     */
    @NotNull
    public static <E extends Enum<E>> EnumProperty<E> newProperty(@NotNull Class<E> clazz, @NotNull String path, @NotNull E defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new LocalDate property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static LocalDateProperty newProperty(@NotNull String path, @NotNull LocalDate defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new LocalTime property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static LocalTimeProperty newProperty(@NotNull String path, @NotNull LocalTime defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new LocalDateTime property.
     *
     * @param path the property's path
     * @param defaultValue the default value
     * @return the created property
     */
    @NotNull
    public static LocalDateTimeProperty newProperty(@NotNull String path, @NotNull LocalDateTime defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new regex pattern property.
     *
     * @param path the property's path
     * @param defaultRegexValue the default pattern of the property
     * @return the created regex property
     */
    @NotNull
    public static RegexProperty newRegexProperty(@NotNull String path, @NotNull String defaultRegexValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new regex pattern property.
     *
     * @param path the property's path
     * @param defaultRegexValue the default pattern of the property
     * @return the created regex property
     */
    @NotNull
    public static RegexProperty newRegexProperty(@NotNull String path, @NotNull Pattern defaultRegexValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new String list property.
     *
     * @param path the property's path
     * @param defaultValues the items in the default list
     * @return the created list property
     */
    @NotNull
    public static StringListProperty newListProperty(@NotNull String path, @NotNull String@NotNull ... defaultValues) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new String list property.
     *
     * @param path the property's path
     * @param defaultValues the default value of the property
     * @return the created list property
     */
    @NotNull
    public static StringListProperty newListProperty(@NotNull String path, @NotNull List<String> defaultValues) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new String set property.
     *
     * @param path the property's path
     * @param defaultValues the items in the default set
     * @return the created set property
     */
    @NotNull
    public static StringSetProperty newSetProperty(@NotNull String path, @NotNull String@NotNull ... defaultValues) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new String set property.
     *
     * @param path the property's path
     * @param defaultValues the default value of the property
     * @return the created set property
     */
    @NotNull
    public static StringSetProperty newSetProperty(@NotNull String path, @NotNull Set<String> defaultValues) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new String set property where all values are lowercase.
     *
     * @param path the property's path
     * @param defaultValues the items in the default set
     * @return the created set property
     */
    @NotNull
    public static LowercaseStringSetProperty newLowercaseStringSetProperty(@NotNull String path, @NotNull String@NotNull ... defaultValues) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new String set property where all values are lowercase.
     *
     * @param path the property's path
     * @param defaultValues the default value of the property
     * @return the created set property
     */
    @NotNull
    public static LowercaseStringSetProperty newLowercaseStringSetProperty(@NotNull String path, @NotNull Collection<String> defaultValues) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new bean property.
     *
     * @param path the property's path
     * @param beanClass the bean class
     * @param defaultValue default value
     * @param <B> the bean type
     * @return the created bean property
     */
    @NotNull
    public static <B> BeanProperty<B> newBeanProperty(@NotNull Class<B> beanClass, @NotNull String path, @NotNull B defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // --------------
    // Property builders
    // --------------
    @NotNull
    public static <T> CollectionPropertyBuilder<T, List<T>, ListProperty<T>> listProperty(@NotNull PropertyType<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> CollectionPropertyBuilder<T, Set<T>, SetProperty<T>> setProperty(@NotNull PropertyType<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <V> MapPropertyBuilder<V, Map<String, V>, MapProperty<V>> mapProperty(@NotNull PropertyType<V> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> ArrayPropertyBuilder<T, ArrayProperty<T>> arrayProperty(@NotNull PropertyType<T> type, @NotNull IntFunction<T[]> arrayProducer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> ArrayPropertyBuilder<T, ArrayProperty<T>> arrayProperty(@NotNull ArrayPropertyType<T> arrayType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <E> ArrayPropertyBuilder<E, InlineArrayProperty<E>> inlineArrayProperty(@NotNull InlineArrayPropertyType<E> inlineArrayType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // --------------
    // Optional flavors
    // --------------
    @NotNull
    public static <T> OptionalProperty<T> optionalProperty(@NotNull String path, PropertyType<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Boolean> optionalBooleanProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Short> optionalShortProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Integer> optionalIntegerProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Long> optionalLongProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Float> optionalFloatProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Double> optionalDoubleProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<String> optionalStringProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <E extends Enum<E>> OptionalProperty<E> optionalEnumProperty(@NotNull Class<E> clazz, @NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Pattern> optionalRegexProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<List<String>> optionalListProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> OptionalProperty<List<T>> optionalListProperty(@NotNull String path, @NotNull PropertyType<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static OptionalProperty<Set<String>> optionalSetProperty(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <T> OptionalProperty<Set<T>> optionalSetProperty(@NotNull String path, @NotNull PropertyType<T> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
