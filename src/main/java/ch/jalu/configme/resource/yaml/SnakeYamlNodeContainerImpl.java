package ch.jalu.configme.resource.yaml;

import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.comments.CommentLine;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.Tag;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Implementation of {@link SnakeYamlNodeContainer}.
 */
public class SnakeYamlNodeContainerImpl implements SnakeYamlNodeContainer {

    private final List<String> comments;

    private final Map<String, Object> values = new LinkedHashMap<>();

    public SnakeYamlNodeContainerImpl(@NotNull List<String> comments) {
        this.comments = comments;
    }

    @Override
    @NotNull
    public SnakeYamlNodeContainer getOrCreateChildContainer(@NotNull String name, @NotNull Supplier<List<String>> commentsSupplier) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Node getRootValueNode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void putNode(@NotNull String name, @NotNull Node node) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    @NotNull
    public Node convertToNode(@NotNull SnakeYamlNodeBuilder nodeBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected Node createRootNode(@NotNull List<NodeTuple> entryNodes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final List<String> getComments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final Map<String, Object> getValues() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
