package ch.jalu.configme.internal;

import ch.jalu.configme.properties.convertresult.ConvertErrorRecorder;
import ch.jalu.configme.properties.types.PropertyType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Array;
import java.util.function.Function;

/**
 * Internal utilities for property type conversions.
 */
public final class ConversionUtils {

    private ConversionUtils() {
    }

    /**
     * Converts the given element with the provided property type, logging an error with the error recorder if
     * the element could not be converted.
     *
     * @param element the element to convert
     * @param type the property type to convert with
     * @param errorRecorder the error recorder
     * @param <T> type of values the property type produces
     * @return the converted element, or null if not possible
     */
    @Nullable
    public static <T> T convertOrLogError(@Nullable Object element, @NotNull PropertyType<T> type, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Converts the given element with the provided function, logging an error with the error recorder if
     * the element could not be converted.
     *
     * @param element the element to convert
     * @param conversionFunction callback to convert with
     * @param errorRecorder the error recorder
     * @param <I> the input type
     * @param <T> type of values the conversion function produces
     * @return the converted element, or null if not possible
     */
    @Nullable
    public static <I, T> T convertOrLogError(@Nullable I element, @NotNull Function<? super I, T> conversionFunction, @NotNull ConvertErrorRecorder errorRecorder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates an array of the given size whose component type is the specified class. An exception is thrown
     * if the component type is a primitive type, or void.
     *
     * @param component the component class the array must have
     * @param size the size the array must have
     * @param <T> type of array elements
     * @return array of the given type and size
     */
    @SuppressWarnings("unchecked")
    public static <T> T @NotNull [] createArrayForReferenceType(@NotNull Class<T> component, int size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
