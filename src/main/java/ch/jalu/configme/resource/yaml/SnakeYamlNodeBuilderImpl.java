package ch.jalu.configme.resource.yaml;

import ch.jalu.configme.configurationdata.ConfigurationData;
import ch.jalu.configme.internal.StreamUtils;
import ch.jalu.configme.properties.convertresult.ValueWithComments;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.comments.CommentLine;
import org.yaml.snakeyaml.comments.CommentType;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import static ch.jalu.configme.internal.PathUtils.concatSpecifierAware;
import static ch.jalu.configme.internal.PathUtils.pathSpecifierForIndex;
import static ch.jalu.configme.internal.PathUtils.pathSpecifierForMapKey;

/**
 * Default implementation of {@link SnakeYamlNodeBuilder}: creates SnakeYAML nodes for values and comments.
 */
public class SnakeYamlNodeBuilderImpl implements SnakeYamlNodeBuilder {

    private final Set<UUID> usedUniqueCommentIds = new HashSet<>();

    @Override
    @NotNull
    public Node createYamlNode(@NotNull Object obj, @NotNull String path, @NotNull ConfigurationData configurationData, int numberOfNewLines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Node createKeyNode(@NotNull String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Stream<CommentLine> createCommentLines(@NotNull String comment) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void transferComments(@NotNull Node valueNode, @NotNull Node keyNode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected Node createStringNode(@NotNull String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected Node createNumberNode(@NotNull Number value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected Node createBooleanNode(boolean value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a SnakeYAML node representing a sequence of the entries in the stream.
     *
     * @param entries stream of the entries (from a Java collection or array)
     * @param path the property path
     * @param configurationData the configuration data (to retrieve comments)
     * @return SnakeYAML node representing the entries
     */
    @NotNull
    protected Node createSequenceNode(@NotNull Stream<?> entries, @NotNull String path, @NotNull ConfigurationData configurationData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a SnakeYAML node representing a map (collection of key-value pairs).
     *
     * @param value the map whose values should be in the returned node
     * @param path the property path
     * @param configurationData the configuration data (to retrieve comments)
     * @return SnakeYAML node representing the given map
     */
    @NotNull
    protected Node createMapNode(@NotNull Map<String, ?> value, @NotNull String path, @NotNull ConfigurationData configurationData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates comments based on all possible sources (number of empty lines, configuration data,
     * {@link ValueWithComments}) and returns them as SnakeYAML comment lines.
     *
     * @param value the export value
     * @param path the path the value is located at
     * @param configurationData the configuration data instance
     * @param numberOfNewLines number of new lines to add to the beginning of the comments
     * @return comment lines representing all defined comments
     */
    @NotNull
    protected List<CommentLine> collectComments(@NotNull Object value, @NotNull String path, @NotNull ConfigurationData configurationData, int numberOfNewLines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @return UUIDs of comments which should not be repeated that have already been included
     */
    @NotNull
    protected final Set<UUID> getUsedUniqueCommentIds() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
