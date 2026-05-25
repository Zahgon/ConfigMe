package ch.jalu.configme.resource;

import ch.jalu.configme.configurationdata.CommentsConfiguration;
import ch.jalu.configme.configurationdata.ConfigurationData;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.internal.StreamUtils;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.resource.PropertyPathTraverser.PathElement;
import ch.jalu.configme.resource.yaml.SnakeYamlNodeBuilder;
import ch.jalu.configme.resource.yaml.SnakeYamlNodeBuilderImpl;
import ch.jalu.configme.resource.yaml.SnakeYamlNodeContainer;
import ch.jalu.configme.resource.yaml.SnakeYamlNodeContainerImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.comments.CommentLine;
import org.yaml.snakeyaml.nodes.Node;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Property resource based on a YAML file.
 */
public class YamlFileResource implements PropertyResource {

    private final Path path;

    @NotNull
    private final YamlFileResourceOptions options;

    public YamlFileResource(@NotNull Path path) {
        this(path, YamlFileResourceOptions.builder().build());
    }

    public YamlFileResource(@NotNull Path path, @NotNull YamlFileResourceOptions options) {
        this.path = path;
        this.options = options;
    }

    @Override
    @NotNull
    public PropertyReader createReader() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void exportProperties(@NotNull ConfigurationData configurationData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a YAML node for the export value and stores it, along with any comments for intermediate paths that
     * have not been visited yet.
     *
     * @param exportValue the export value to store
     * @param path the path the export value is for
     * @param pathElements the path elements of this property's path
     * @param rootContainer the root YAML node container for storing the export value
     * @param configurationData the configuration data (for the retrieval of comments)
     * @param nodeBuilder YAML node builder
     */
    protected void createAndAddYamlNode(@NotNull Object exportValue, @NotNull String path, @NotNull List<PathElement> pathElements, @NotNull SnakeYamlNodeContainer rootContainer, @NotNull ConfigurationData configurationData, @NotNull SnakeYamlNodeBuilder nodeBuilder) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected List<String> getCommentsForPathElement(@NotNull ConfigurationData configurationData, @NotNull PathElement pathElement) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final Path getPath() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new SnakeYAML object with the appropriate options.
     *
     * @return the YAML instance for exporting values
     */
    @NotNull
    protected Yaml createSnakeYamlInstance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected final YamlFileResourceOptions getOptions() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected SnakeYamlNodeBuilder createNodeBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected SnakeYamlNodeContainer createNodeContainerForRoot(@NotNull List<String> rootComments) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Nullable
    private <T> Object getExportValue(@NotNull Property<T> property, @NotNull ConfigurationData configurationData) {
        return property.toExportValue(configurationData.getValue(property));
    }
}
