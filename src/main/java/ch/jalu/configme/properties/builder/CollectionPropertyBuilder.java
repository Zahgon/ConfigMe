package ch.jalu.configme.properties.builder;

import ch.jalu.configme.properties.ListProperty;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.SetProperty;
import ch.jalu.configme.properties.types.PropertyType;
import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;

/**
 * Builder for properties of collection type. See {@link #listBuilder} and {@link #setBuilder}.
 *
 * @param <E> the entry type
 * @param <C> the collection type
 * @param <P> type of property the builder creates
 */
public class CollectionPropertyBuilder<E, C extends Collection<E>, P extends Property<? super C>> {

    private String path;

    private final C defaultValue;

    private final BiFunction<String, C, P> createPropertyFunction;

    /**
     * Constructor. See also the static methods of this class to create a builder, {@link #listBuilder}
     * and {@link #setBuilder}.
     *
     * @param createPropertyFunction function taking a path and default value which returns a property
     * @param defaultValue empty collection that can be modified, used as default value
     */
    public CollectionPropertyBuilder(@NotNull BiFunction<String, C, P> createPropertyFunction, @NotNull C defaultValue) {
        this.createPropertyFunction = createPropertyFunction;
        this.defaultValue = defaultValue;
    }

    /**
     * Creates a builder that constructs a {@link ListProperty}.
     *
     * @param entryType the property type of the list's entries
     * @param <E> type of elements in the list
     * @return builder for a list property
     */
    @NotNull
    public static <E> CollectionPropertyBuilder<E, List<E>, ListProperty<E>> listBuilder(@NotNull PropertyType<E> entryType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a builder that constructs a {@link SetProperty}.
     *
     * @param entryType the property type of the set's entries
     * @param <E> type of elements in the set
     * @return builder for a set property
     */
    @NotNull
    public static <E> CollectionPropertyBuilder<E, Set<E>, SetProperty<E>> setBuilder(@NotNull PropertyType<E> entryType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the path of the property to create.
     *
     * @param path the property path to set
     * @return this builder
     */
    @NotNull
    public CollectionPropertyBuilder<E, C, P> path(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the given entries to this builder's collection that will be used as the default value of the property.
     * This method throws an exception if entries have already been added to the default value; use either this method
     * once to define all entries, or use {@link #addToDefaultValue} to add entries to the default value individually.
     * It is not recommended to mix both methods.
     *
     * @param entries the entries to be part of the default value collection
     * @return this builder
     */
    @SafeVarargs
    @NotNull
    public final CollectionPropertyBuilder<E, C, P> defaultValue(@NotNull E@NotNull ... entries) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets all entries of the given collection to this builder's default values.
     * This method throws an exception if entries have already been added to the default value; use either this method
     * once to define all entries, or use {@link #addToDefaultValue} to add entries to the default value individually.
     * It is not recommended to mix both methods.
     *
     * @param entries the entries to be part of the default value collection
     * @return this builder
     */
    @NotNull
    public CollectionPropertyBuilder<E, C, P> defaultValue(@NotNull Collection<? extends E> entries) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the given entry to the builder's default value.
     *
     * @param entry entry to add to the default value
     * @return this builder
     */
    @NotNull
    public CollectionPropertyBuilder<E, C, P> addToDefaultValue(@NotNull E entry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Constructs the property and returns it.
     *
     * @return the property
     */
    @NotNull
    public P build() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
