package ch.jalu.configme.properties.types;

import ch.jalu.configme.internal.ConversionUtils;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Property type for collections of elements. This class and its extensions delegate individual element operations to
 * another property type, which defines the behavior of the elements.
 * <p>
 * This property type never produces collections that have any {@code null} elements. If an entry cannot be converted
 * by the entry type (the property type that converts individual elements), it is skipped in the result.
 *
 * @param <E> the type of the elements in the collection
 * @param <C> the collection type
 * @see ListPropertyType
 * @see SetPropertyType
 */
public abstract class CollectionPropertyType<E, C extends Collection<E>> implements PropertyType<C> {

    private final PropertyType<E> entryType;

    /**
     * Constructor.
     *
     * @param entryType the type for the entries in the collection
     */
    public CollectionPropertyType(@NotNull PropertyType<E> entryType) {
        this.entryType = entryType;
    }

    /**
     * Creates a new collection type for the given entry type and collector. See also {@link ListPropertyType},
     * {@link SetPropertyType} and {@link EnumSetPropertyType}.
     *
     * @param entryType property type for the elements in the collection
     * @param collector collector to the desired collection type
     * @param <E> the type of the elements in the collection
     * @param <C> the collection type
     * @return collection type for the given entry type and collector
     */
    @NotNull
    public static <E, C extends Collection<E>> CollectionPropertyType<E, C> of(@NotNull PropertyType<E> entryType, @NotNull Collector<E, ?, C> collector) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public C convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public List<?> toExportValue(@NotNull C value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return the property type used for the collection's entries
     */
    @NotNull
    public PropertyType<E> getEntryType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return collector to collect the converted entries to the appropriate type of collection
     */
    @NotNull
    protected abstract Collector<E, ?, C> resultCollector();
}
