package ch.jalu.configme.beanmapper.context;

import ch.jalu.configme.beanmapper.definition.properties.BeanPropertyComments;
import ch.jalu.configme.internal.PathUtils;
import org.jetbrains.annotations.NotNull;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Standard implementation of {@link ExportContext}.
 */
public class ExportContextImpl implements ExportContext {

    private final String beanPath;

    private final Set<UUID> usedUniqueCommentIds;

    /**
     * Constructor.
     *
     * @param beanPath path relative to the bean root
     * @param usedUniqueCommentIds set of unique comment UUIDs that have already been used
     */
    protected ExportContextImpl(@NotNull String beanPath, @NotNull Set<UUID> usedUniqueCommentIds) {
        this.beanPath = beanPath;
        this.usedUniqueCommentIds = usedUniqueCommentIds;
    }

    /**
     * Creates an initial context for the export of a bean value.
     *
     * @return root export context
     */
    @NotNull
    public static ExportContextImpl createRoot() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public ExportContext createChildContext(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public String getBeanPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean shouldInclude(@NotNull BeanPropertyComments comments) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void registerComment(@NotNull BeanPropertyComments comments) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
