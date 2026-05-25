package ch.jalu.configme.beanmapper.context;

import ch.jalu.configme.internal.PathUtils;
import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.typeresolver.TypeInfo;
import org.jetbrains.annotations.NotNull;

/**
 * Standard implementation of {@link MappingContext}.
 */
public class MappingContextImpl implements MappingContext {

    private final String beanPath;

    private final TypeInfo targetType;

    private final ConvertErrorRecorder errorRecorder;

    protected MappingContextImpl(@NotNull String beanPath, @NotNull TypeInfo targetType, @NotNull ConvertErrorRecorder errorRecorder) {
        this.beanPath = beanPath;
        this.targetType = targetType;
        this.errorRecorder = errorRecorder;
    }

    /**
     * Creates an initial context (used at the start of a mapping process).
     *
     * @param targetType the required type
     * @param errorRecorder error recorder to register errors even if a valid value is returned
     * @return root mapping context
     */
    @NotNull
    public static MappingContextImpl createRoot(@NotNull TypeInfo targetType, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public MappingContext createChild(@NotNull String subPath, @NotNull TypeInfo targetType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public String getBeanPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public TypeInfo getTargetType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public String createDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public ConvertErrorRecorder getErrorRecorder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
