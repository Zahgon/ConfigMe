package ch.jalu.configme.beanmapper.definition.properties;

import ch.jalu.configme.Comment;
import ch.jalu.configme.beanmapper.ConfigMeMapperException;
import ch.jalu.configme.beanmapper.ExportName;
import ch.jalu.configme.beanmapper.IgnoreInMapping;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.internal.record.RecordComponent;
import ch.jalu.typeresolver.reflect.FieldUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 * Default implementation of {@link BeanPropertyExtractor}: creates all {@link BeanPropertyDefinition}
 * objects for a given class. You can override the default name of a property with &#64;{@link ExportName}.
 * <p>
 * See <a href="https://github.com/AuthMe/ConfigMe/wiki/Bean-properties">Bean properties</a> on the ConfigMe wiki
 * for more details about how properties are extracted.
 */
public class BeanPropertyExtractorImpl implements BeanPropertyExtractor {

    @Override
    @NotNull
    public List<BeanPropertyDefinition> collectPropertiesForRecord(@NotNull Class<?> clazz, RecordComponent @NotNull [] components) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Constructs property definitions based on the given class's instance fields (i.e. non-static), including the
     * instance fields of all parent classes. If a non-static field of a bean class has the same name as a field of a
     * parent type, the parent field is ignored.
     * <p>
     * Instance fields can be ignored by declaring them as {@code transient} or by annotating them with
     * &#64;{@link IgnoreInMapping}.
     *
     * @param clazz the bean type
     * @return the properties of the given bean type
     */
    @Override
    @NotNull
    public List<BeanFieldPropertyDefinition> collectProperties(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Validates the component and its associated field for a class that is a record.
     *
     * @param clazz the record type the component belongs to
     * @param component the record component to validate
     * @param field the field associated with the record (nullable)
     */
    protected void validateFieldForRecord(@NotNull Class<?> clazz, @NotNull RecordComponent component, @Nullable Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Validates the given field that belongs to a bean class.
     *
     * @param clazz the class the field belongs to (the bean type)
     * @param field the field to validate
     */
    protected void validateFieldForBean(@NotNull Class<?> clazz, @NotNull Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected BeanFieldPropertyDefinition createDefinition(@NotNull Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean isFieldIgnored(@NotNull Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the comments that are defined on the property. Comments are found by looking for an &#64;{@link Comment}
     * annotation on a field with the same name as the property.
     *
     * @param field the field associated with the property (may be null)
     * @return comments for the property (never null)
     */
    @NotNull
    protected BeanPropertyComments getComments(@Nullable Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Validates the class's properties.
     *
     * @param clazz the class to which the properties belong
     * @param properties the properties that were constructed from the given class
     */
    protected void validateProperties(@NotNull Class<?> clazz, @NotNull Collection<? extends BeanPropertyDefinition> properties) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a custom name that the property should have in property resources for reading and writing. This method
     * returns null if the field name should be used.
     *
     * @param field the field to process
     * @return the custom name the property has in resources, null otherwise
     */
    @Nullable
    protected String getCustomExportName(@NotNull Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
