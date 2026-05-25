package ch.jalu.configme.beanmapper.leafvaluehandler;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.typeresolver.EnumUtils;
import ch.jalu.typeresolver.TypeInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Handles enum type conversions for the bean mapper.
 */
public class EnumLeafType implements MapperLeafType {

    @Override
    @Nullable
    public Object convert(@Nullable Object value, @NotNull TypeInfo targetType, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @Nullable
    public Object toExportValueIfApplicable(@Nullable Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
