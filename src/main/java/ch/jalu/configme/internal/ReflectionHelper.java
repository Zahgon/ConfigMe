package ch.jalu.configme.internal;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.typeresolver.classutil.ClassUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * Internal helper for reflective operations.
 */
public class ReflectionHelper {

    /**
     * Loads the class by fully qualified name, throwing an exception if the class does not exist.
     *
     * @param name the name of the class to return (e.g. java.lang.Integer)
     * @return the requested class
     */
    // Note: Needed as separate method so it can be mocked in tests to return classes in our control
    @NotNull
    public Class<?> getClassOrThrow(@NotNull String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the method with the given name on the given class. The method is assumed to have no arguments;
     * if it doesn't exist, a runtime exception is thrown.
     *
     * @param declarer the class declaring the method
     * @param name the name of the method to retrieve
     * @return the specified method
     */
    @NotNull
    public Method getNoArgMethod(@NotNull Class<?> declarer, @NotNull String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Invokes the given method (which takes no arguments) on the given {@code instance} object. A runtime exception is
     * thrown if the method invocation failed. An exception is thrown if the return value is null.
     *
     * @param method the method to invoke
     * @param instance the object to invoke it on
     * @param <T> the return type (type is not statically checked)
     * @return the return value of the method
     */
    @SuppressWarnings("unchecked")
    @NotNull
    public <T> T invokeNoArgMethod(@NotNull Method method, @Nullable Object instance) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Makes the given accessible object (e.g. a field) accessible if it isn't yet.
     *
     * @param accessibleObject the reflected object to make accessible (if needed)
     */
    public static void setAccessibleIfNeeded(@NotNull AccessibleObject accessibleObject) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
