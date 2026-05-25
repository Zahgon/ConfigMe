package ch.jalu.configme.beanmapper.definition;

import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyDefinition;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.typeresolver.reflect.ConstructorUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Definition of a bean based on a Java record class.
 */
public class RecordBeanDefinition implements BeanDefinition {

    private final Constructor<?> canonicalConstructor;

    private final List<BeanPropertyDefinition> properties;

    /**
     * Constructor.
     *
     * @param clazz the record type
     * @param properties the properties of the record
     */
    public RecordBeanDefinition(@NotNull Class<?> clazz, @NotNull List<BeanPropertyDefinition> properties) {
        this.properties = properties;
        Class<?>[] paramTypes = properties.stream().map(property -> property.getTypeInformation().toClass()).toArray(Class[]::new);
        this.canonicalConstructor = ConstructorUtils.getConstructorOrNull(clazz, paramTypes);
        if (this.canonicalConstructor == null) {
            throw new ConfigMeException("Could not get canonical constructor of " + clazz);
        }
    }

    @NotNull
    protected final Constructor<?> getCanonicalConstructor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public List<BeanPropertyDefinition> getProperties() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object create(@NotNull List<Object> propertyValues, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
