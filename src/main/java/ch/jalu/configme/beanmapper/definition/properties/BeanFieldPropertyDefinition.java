package ch.jalu.configme.beanmapper.definition.properties;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.internal.ReflectionHelper;
import ch.jalu.typeresolver.TypeInfo;
import ch.jalu.typeresolver.reflect.FieldUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Field;

/**
 * A bean property defined by a {@link Field}.
 */
public class BeanFieldPropertyDefinition implements BeanPropertyDefinition {

    private final Field field;

    @Nullable
    private final String exportName;

    private final BeanPropertyComments comments;

    /**
     * Constructor.
     *
     * @param field the field this definition is for
     * @param exportName the custom name of this property in the property resource, null for default
     * @param comments the comments associated with this property
     */
    public BeanFieldPropertyDefinition(@NotNull Field field, @Nullable String exportName, @NotNull BeanPropertyComments comments) {
        this.field = field;
        this.exportName = exportName;
        this.comments = comments;
    }

    /**
     * @return custom export name, or null if none present
     */
    @Nullable
    protected final String getExportName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public TypeInfo getTypeInformation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the provided value to the field wrapped by this instance on the given bean. This method does not
     * check whether the field is final; in some contexts (e.g. instantiating a record type), this method should not
     * be called.
     *
     * @param bean the bean to set the value to
     * @param value the value to set
     */
    // Surprisingly, setting a value to a final field is allowed in some circumstances, but the value doesn't seem to
    // actually be changed outside of the current context. For now, we keep this method free of any validation but
    // note that a final field here might NOT cause an exception.
    public void setValue(@NotNull Object bean, @NotNull Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object getValue(@NotNull Object bean) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public BeanPropertyComments getComments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
