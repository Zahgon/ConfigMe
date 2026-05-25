package ch.jalu.configme.beanmapper;

import org.jetbrains.annotations.NotNull;

/**
 * Provides the {@link Mapper} instance which is used by default.
 */
public final class DefaultMapper extends MapperImpl {

    private static DefaultMapper instance;

    private DefaultMapper() {
    }

    /**
     * @return default mapper instance
     */
    @NotNull
    public static Mapper getInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
