package ch.jalu.configme.properties.types;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.typeresolver.TypeInfo;
import ch.jalu.typeresolver.primitives.PrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Property type and mapper leaf type for boolean values.
 */
public class BooleanType extends PropertyAndLeafType<Boolean> {

    /**
     * Instance of this class. Named {@code BOOLEAN} rather than {@code INSTANCE} so it can be statically imported.
     */
    public static final BooleanType BOOLEAN = new BooleanType();

    /**
     * Constructor. Use {@link BooleanType#BOOLEAN} for the standard behavior.
     */
    protected BooleanType() {
        super(Boolean.class);
    }

    @Override
    @Nullable
    public Boolean convert(@Nullable Object object, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Boolean toExportValue(@NotNull Boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean canConvertToType(@NotNull TypeInfo typeInformation) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Converts the String value to its boolean value, if applicable.
     *
     * @param value the value to convert
     * @return boolean value represented by the string, or null if not applicable
     */
    @Nullable
    protected Boolean convertFromString(@NotNull String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return array property type whose elements are managed by {@code this} boolean type
     */
    @NotNull
    public ArrayPropertyType<Boolean> arrayType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
