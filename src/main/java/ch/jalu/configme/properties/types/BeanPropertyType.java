package ch.jalu.configme.properties.types;

import ch.jalu.configme.beanmapper.DefaultMapper;
import ch.jalu.configme.beanmapper.Mapper;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.typeresolver.TypeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Property type that maps values to a specific bean class.
 *
 * @param <B> the bean type
 */
public class BeanPropertyType<B> implements PropertyType<B> {

    private final TypeInfo beanType;

    private final Mapper mapper;

    public BeanPropertyType(@NotNull TypeInfo beanType, @NotNull Mapper mapper) {
        this.beanType = beanType;
        this.mapper = mapper;
    }

    @NotNull
    public static <B> BeanPropertyType<B> of(@NotNull Class<B> type, @NotNull Mapper mapper) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public static <B> BeanPropertyType<B> of(@NotNull Class<B> type) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    public B convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object toExportValue(@NotNull B value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
