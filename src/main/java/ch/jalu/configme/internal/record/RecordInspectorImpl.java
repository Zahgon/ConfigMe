package ch.jalu.configme.internal.record;

import ch.jalu.configme.internal.ReflectionHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * Inspects classes and returns Record information (Java 16+). The inspection is performed by reflection
 * because ConfigMe is still compiled with Java 8.
 */
public class RecordInspectorImpl implements RecordInspector {

    private final ReflectionHelper reflectionHelper;

    // Class#isRecord
    private Method isRecordMethod;

    // Class#getRecordComponents
    private Method getRecordComponentsMethod;

    // RecordComponent#getName
    private Method getComponentNameMethod;

    // RecordComponent#getType
    private Method getComponentTypeMethod;

    // RecordComponent#getGenericType
    private Method getComponentGenericTypeMethod;

    public RecordInspectorImpl(@NotNull ReflectionHelper reflectionHelper) {
        this.reflectionHelper = reflectionHelper;
    }

    /**
     * Returns whether the given class is a record.
     * <p>
     * This method uses {@code Class#isRecord} in a way that is compatible with Java 8 and above.
     *
     * @param clazz the class to inspect
     * @return true if it's a record, false otherwise
     */
    boolean isRecord(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public RecordComponent @Nullable [] getRecordComponents(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean hasRecordAsSuperclass(@NotNull Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    private RecordComponent mapComponent(@NotNull Object component) {
        String name = reflectionHelper.invokeNoArgMethod(getComponentNameMethod, component);
        Class<?> type = reflectionHelper.invokeNoArgMethod(getComponentTypeMethod, component);
        Type genericType = reflectionHelper.invokeNoArgMethod(getComponentGenericTypeMethod, component);
        return new RecordComponent(name, type, genericType);
    }
}
