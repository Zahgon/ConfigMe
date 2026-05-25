package ch.jalu.configme.beanmapper.leafvaluehandler;

import ch.jalu.configme.beanmapper.context.ExportContext;
import ch.jalu.configme.beanmapper.context.MappingContext;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.configme.properties.types.BooleanType;
import ch.jalu.configme.properties.types.NumberType;
import ch.jalu.configme.properties.types.RegexType;
import ch.jalu.configme.properties.types.StringType;
import ch.jalu.configme.properties.types.TemporalType;
import ch.jalu.typeresolver.TypeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Default implementation of {@link LeafValueHandler}. A leaf value handler is used in
 * {@link ch.jalu.configme.beanmapper.MapperImpl} to provide "simple" values that the mapper does not have to
 * visit further. This implementation uses {@link MapperLeafType} instances, which perform the actual conversions.
 */
public class LeafValueHandlerImpl implements LeafValueHandler {

    private final List<MapperLeafType> leafTypes;

    /**
     * Constructor.
     *
     * @param leafTypes the leaf types to use
     */
    public LeafValueHandlerImpl(@NotNull List<@NotNull MapperLeafType> leafTypes) {
        this.leafTypes = leafTypes;
    }

    /**
     * Constructor.
     *
     * @param leafTypes the leaf types to use
     */
    public LeafValueHandlerImpl(@NotNull MapperLeafType@NotNull ... leafTypes) {
        this.leafTypes = Arrays.stream(leafTypes).collect(Collectors.toList());
    }

    /**
     * Returns a builder to create a leaf value handler.
     *
     * @return leaf value handler builder
     */
    @NotNull
    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns all leaf types used by the default implementation of this class. This method specifically returns
     * an ArrayList to guarantee that the list can be modified without the need of creating a copy beforehand.
     *
     * @return mutable list of leaf types that are used by default
     */
    @NotNull
    public static ArrayList<@NotNull MapperLeafType> createDefaultLeafTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object convert(@Nullable Object value, @NotNull MappingContext mappingContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object toExportValue(@Nullable Object value, @NotNull ExportContext exportContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return leaf types used by this instance
     */
    @NotNull
    protected final List<MapperLeafType> getLeafTypes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builder for {@link LeafValueHandlerImpl}.
     */
    public static final class Builder {

        private final List<MapperLeafType> leafTypes = new ArrayList<>();

        /**
         * Adds the default leaf types from {@link #createDefaultLeafTypes()}.
         *
         * @return this builder
         */
        @NotNull
        public Builder addDefaults() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Adds the given leaf type to this builder.
         *
         * @param typeToAdd the leaf type to add
         * @return this builder
         */
        @NotNull
        public Builder addType(@NotNull MapperLeafType typeToAdd) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Adds the given leaf types to this builder.
         *
         * @param typesToAdd the leaf types to add
         * @return this builder
         */
        @NotNull
        public Builder addTypes(@NotNull MapperLeafType@NotNull ... typesToAdd) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Adds the given leaf types to this builder.
         *
         * @param typesToAdd the leaf types to add
         * @return this builder
         */
        @NotNull
        public Builder addTypes(@NotNull Collection<MapperLeafType> typesToAdd) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Removes the given type from this builder's list of types. Useful if you
         * {@link #addDefaults() add the default types} but want to remove an entry.
         *
         * @param typeToRemove the type to remove
         * @return this builder
         */
        @NotNull
        public Builder removeType(@NotNull MapperLeafType typeToRemove) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Removes all leaf types from this builder that match the given predicate.
         *
         * @param filterForRemoval predicate determining if a type should be removed
         * @return this builder
         */
        @NotNull
        public Builder removeMatchingTypes(@NotNull Predicate<MapperLeafType> filterForRemoval) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Creates a leaf value handler instance with all leaf types that were registered to this builder.
         *
         * @return new leaf value handler instance with all leaf types
         */
        @NotNull
        public LeafValueHandlerImpl build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
