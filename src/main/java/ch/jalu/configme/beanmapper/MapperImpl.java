package ch.jalu.configme.beanmapper;

import ch.jalu.configme.beanmapper.context.ExportContext;
import ch.jalu.configme.beanmapper.context.ExportContextImpl;
import ch.jalu.configme.beanmapper.context.MappingContext;
import ch.jalu.configme.beanmapper.context.MappingContextImpl;
import ch.jalu.configme.beanmapper.definition.BeanDefinition;
import ch.jalu.configme.beanmapper.definition.BeanDefinitionService;
import ch.jalu.configme.beanmapper.definition.BeanDefinitionServiceImpl;
import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyComments;
import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyDefinition;
import ch.jalu.configme.beanmapper.leafvaluehandler.LeafValueHandler;
import ch.jalu.configme.beanmapper.leafvaluehandler.LeafValueHandlerImpl;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.configme.properties.convertresult.ValueWithComments;
import ch.jalu.typeresolver.TypeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.stream.Collectors;
import static ch.jalu.configme.internal.PathUtils.OPTIONAL_SPECIFIER;
import static ch.jalu.configme.internal.PathUtils.pathSpecifierForIndex;
import static ch.jalu.configme.internal.PathUtils.pathSpecifierForMapKey;

/**
 * Default implementation of {@link Mapper}.
 * <p>
 * Maps a section of a property resource to the provided Java class (called a "bean" type). The mapping is based on the
 * bean's properties, whose names must correspond to the names in the property resource. For example, if a bean
 * has a property {@code length} and it should be mapped from the property resource's value at path {@code definition},
 * the mapper will look up {@code definition.length} in the resource to determine the value of the bean's property.
 * <p>
 * Classes are created by the {@link BeanDefinitionService}. The {@link BeanDefinitionServiceImpl
 * default implementation} supports Java classes with a no-arg constructor, as well as Java records.
 * The service can be extended to support more types of classes.
 * <br>For Java classes with a no-arg constructor, the class's instance fields (= non-static fields) are considered
 * as properties. You can change the behavior of the fields with &#64;{@link ExportName} and
 * &#64;{@link IgnoreInMapping}. There must be at least one property for a class to be treated as a bean.
 * <p>
 * <b>Recursion:</b> the mapping of values to a bean is performed recursively, i.e. a bean may have other beans
 * as fields and generic types at any arbitrary "depth".
 * <p>
 * <b>Collections</b> are only supported if they have an explicit type argument, i.e. a field of {@code List<String>}
 * is supported but {@code List<?>} and {@code List<T extends Number>} are not supported. Specifically, you may
 * only declare fields of type {@link java.util.List} or {@link java.util.Set}, or a parent type ({@link Collection}
 * or {@link Iterable}) by default.
 * Fields of type <b>Map</b> are supported also, with similar limitations. Additionally, maps may only have
 * {@code String} as key type, but no restrictions are imposed on the value type.
 * <p>
 * Beans may have <b>optional fields</b>. If the mapper cannot map the property resource value to the corresponding
 * field, it only treats it as a failure if the field's value is {@code null}. If the field has a default value assigned
 * to it on initialization, the default value remains and the mapping process continues. If a bean is constructed to
 * have a property with a null value, the mapping is considered unsuccessful, and the mapping process is stopped
 * immediately.
 * <br>Optional properties can also be defined by declaring them with {@link Optional}.
 */
public class MapperImpl implements Mapper {

    // ---------
    // Fields and general configurable methods
    // ---------
    private final LeafValueHandler leafValueHandler;

    private final BeanDefinitionService beanDefinitionService;

    public MapperImpl() {
        this(new BeanDefinitionServiceImpl(), new LeafValueHandlerImpl(LeafValueHandlerImpl.createDefaultLeafTypes()));
    }

    public MapperImpl(@NotNull BeanDefinitionService beanDefinitionService, @NotNull LeafValueHandler leafValueHandler) {
        this.beanDefinitionService = beanDefinitionService;
        this.leafValueHandler = leafValueHandler;
    }

    @NotNull
    protected final BeanDefinitionService getBeanDefinitionService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final LeafValueHandler getLeafValueHandler() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected MappingContext createRootMappingContext(@NotNull TypeInfo beanType, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected ExportContext createRootExportContext() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // ---------
    // Export
    // ---------
    @Override
    @Nullable
    public Object toExportValue(@NotNull Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Transforms the given value to an object suitable for the export to a configuration file.
     *
     * @param value the value to transform
     * @param exportContext export context
     * @return export value to use
     */
    @Nullable
    protected Object toExportValue(@Nullable Object value, @NotNull ExportContext exportContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected List<BeanPropertyDefinition> getBeanProperties(@NotNull Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Handles values of types which need special handling (such as Optional). Null means the value is not
     * a special type and that the export value should be built differently. Use {@link LeafValueHandler#RETURN_NULL} to
     * signal that null should be used as the export value of the provided value.
     *
     * @param value the value to convert
     * @param exportContext export context
     * @return the export value to use or {@link LeafValueHandler#RETURN_NULL}, or null if not applicable
     */
    @Nullable
    protected Object createExportValueForSpecialTypes(@Nullable Object value, @NotNull ExportContext exportContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // ---------
    // Bean mapping
    // ---------
    @Override
    @Nullable
    public Object convertToBean(@Nullable Object value, @NotNull TypeInfo targetType, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Main method for converting a value to another type.
     *
     * @param context the mapping context
     * @param value the value to convert from
     * @return object whose type matches the one in the mapping context, or null if not applicable
     */
    @Nullable
    protected Object convertValueForType(@NotNull MappingContext context, @Nullable Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Converts types in the bean mapping process which require special handling.
     *
     * @param context the mapping context
     * @param value the value to convert from
     * @return object whose type matches the one in the mapping context, or null if not applicable
     */
    @Nullable
    protected Object convertSpecialTypes(@NotNull MappingContext context, @Nullable Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // -- Collection
    /**
     * Handles the creation of Collection properties.
     *
     * @param context the mapping context
     * @param value the value to map from
     * @return Collection property from the value, or null if not applicable
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Nullable
    protected Collection<?> convertToCollection(@NotNull MappingContext context, @Nullable Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a Collection of a type which can be assigned to the provided type.
     *
     * @param mappingContext the current mapping context with a collection type
     * @return Collection of matching type
     */
    @NotNull
    protected Collection<?> createCollectionMatchingType(@NotNull MappingContext mappingContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // -- Map
    /**
     * Handles the creation of a Map property.
     *
     * @param context mapping context
     * @param value value to map from
     * @return Map property, or null if not applicable
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Nullable
    protected Map<?, ?> convertToMap(@NotNull MappingContext context, @Nullable Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a Map of a type which can be assigned to the provided type.
     *
     * @param mappingContext the current mapping context with a map type
     * @return Map of matching type
     */
    @NotNull
    protected Map<?, ?> createMapMatchingType(@NotNull MappingContext mappingContext) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // -- Optional
    // Return value is never null, but if someone wants to override this, it's fine for it to be null
    @Nullable
    protected Object convertOptional(@NotNull MappingContext context, @Nullable Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // -- Bean
    /**
     * Converts the provided value to the requested bean class if possible.
     *
     * @param context mapping context (incl. desired type)
     * @param value the value from the property resource
     * @return the converted value, or null if not possible
     */
    @Nullable
    protected Object createBean(@NotNull MappingContext context, @Nullable Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
