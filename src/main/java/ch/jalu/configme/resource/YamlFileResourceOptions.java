package ch.jalu.configme.resource;

import ch.jalu.configme.resource.PropertyPathTraverser.PathElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.ToIntFunction;

/**
 * Options for {@link YamlFileResource} to configure reading and writing YAML.
 */
public class YamlFileResourceOptions {

    @NotNull
    private final Charset charset;

    @Nullable
    private final ToIntFunction<PathElement> numberOfLinesBeforeFunction;

    private final int indentationSize;

    /**
     * Constructor. Use {@link #builder()} to instantiate option objects.
     *
     * @param charset the charset
     * @param numberOfLinesBeforeFunction function defining how many lines before a path element should be in the export
     * @param indentationSize number of spaces to use for each level of indentation
     */
    protected YamlFileResourceOptions(@Nullable Charset charset, @Nullable ToIntFunction<PathElement> numberOfLinesBeforeFunction, int indentationSize) {
        this.charset = charset == null ? StandardCharsets.UTF_8 : charset;
        this.numberOfLinesBeforeFunction = numberOfLinesBeforeFunction;
        this.indentationSize = indentationSize;
    }

    @NotNull
    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    public Charset getCharset() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNumberOfEmptyLinesBefore(@NotNull PathElement pathElement) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getIndentationSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    protected final ToIntFunction<PathElement> getIndentFunction() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Builder to create YAML file resource options.
     */
    public static class Builder {

        private static final int DEFAULT_INDENTATION_SIZE = 4;

        private Charset charset;

        private ToIntFunction<PathElement> numberOfLinesBeforeFunction;

        private int indentationSize = DEFAULT_INDENTATION_SIZE;

        @NotNull
        public Builder charset(@Nullable Charset charset) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @NotNull
        public Builder numberOfLinesBeforeFunction(@NotNull ToIntFunction<PathElement> numberOfLinesBeforeFunction) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @NotNull
        public Builder indentationSize(final int indentationSize) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @NotNull
        public YamlFileResourceOptions build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
