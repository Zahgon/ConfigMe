package ch.jalu.configme.beanmapper.definition;

import ch.jalu.configme.beanmapper.definition.properties.BeanFieldPropertyDefinition;
import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyDefinition;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.internal.ReflectionHelper;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Definition of a bean based on a regular Java class with a no-arg constructor.
 */
public class NoArgConstructorBeanDefinition implements BeanDefinition {

    private final Constructor<?> noArgConstructor;

    private final List<BeanFieldPropertyDefinition> properties;

    public NoArgConstructorBeanDefinition(@NotNull Constructor<?> noArgConstructor, @NotNull List<BeanFieldPropertyDefinition> properties) {
        this.noArgConstructor = noArgConstructor;
        this.properties = properties;
    }

    @NotNull
    protected final Constructor<?> getNoArgConstructor() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final List<BeanFieldPropertyDefinition> getFieldProperties() {
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

    /**
     * Creates a new instance with the constructor.
     *
     * @return the new instance
     */
    @NotNull
    protected Object createNewInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Processes one property and its value, returning whether the bean is still valid, i.e. if this method returns
     * false, the entire instantiation should be aborted.
     *
     * @param bean the bean to modify
     * @param property the property to handle
     * @param value the value given for the property
     * @param errorRecorder error recorder for conversion errors
     * @return false if the bean cannot be constructed, true otherwise (to continue)
     */
    protected boolean handleProperty(@NotNull Object bean, @NotNull BeanFieldPropertyDefinition property, @Nullable Object value, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
