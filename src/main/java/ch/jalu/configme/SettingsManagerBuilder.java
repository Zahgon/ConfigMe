package ch.jalu.configme;

import ch.jalu.configme.configurationdata.ConfigurationData;
import ch.jalu.configme.configurationdata.ConfigurationDataBuilder;
import ch.jalu.configme.migration.MigrationService;
import ch.jalu.configme.migration.PlainMigrationService;
import ch.jalu.configme.resource.PropertyResource;
import ch.jalu.configme.resource.YamlFileResource;
import ch.jalu.configme.resource.YamlFileResourceOptions;
import ch.jalu.configme.utils.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.io.File;
import java.nio.file.Path;
import java.util.Objects;

/**
 * Creates {@link SettingsManager} instances.
 */
public final class SettingsManagerBuilder {

    private final PropertyResource resource;

    private ConfigurationData configurationData;

    @Nullable
    private MigrationService migrationService;

    private SettingsManagerBuilder(@NotNull PropertyResource resource) {
        this.resource = resource;
    }

    /**
     * Creates a builder, using the given YAML file to use as property resource.
     *
     * @param file the yaml file to use
     * @return settings manager builder
     */
    @NotNull
    public static SettingsManagerBuilder withYamlFile(@NotNull Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a builder, using the given YAML file to use as property resource.
     *
     * @param file the yaml file to use
     * @return settings manager builder
     */
    @NotNull
    public static SettingsManagerBuilder withYamlFile(@NotNull File file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a builder, using the given YAML file to use as property resource with the given options.
     *
     * @param path the yaml file to use
     * @param resourceOptions the resource options
     * @return settings manager builder
     */
    @NotNull
    public static SettingsManagerBuilder withYamlFile(@NotNull Path path, @NotNull YamlFileResourceOptions resourceOptions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a builder, using the given YAML file to use as property resource with the given options.
     *
     * @param file the yaml file to use
     * @param resourceOptions the resource options
     * @return settings manager builder
     */
    @NotNull
    public static SettingsManagerBuilder withYamlFile(@NotNull File file, @NotNull YamlFileResourceOptions resourceOptions) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a new builder with the given property resource.
     *
     * @param resource the resource to use
     * @return settings manager builder
     */
    @NotNull
    public static SettingsManagerBuilder withResource(@NotNull PropertyResource resource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets up configuration data with the input of the given settings holder classes.
     *
     * @param classes the settings holder classes
     * @return this builder
     */
    @SafeVarargs
    @NotNull
    public final SettingsManagerBuilder configurationData(@NotNull Class<? extends SettingsHolder>@NotNull ... classes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the provided configuration data to the builder.
     *
     * @param configurationData the configuration data
     * @return this builder
     */
    @NotNull
    public SettingsManagerBuilder configurationData(@NotNull ConfigurationData configurationData) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Sets the given migration service to the builder.
     *
     * @param migrationService the migration service to use (or null)
     * @return this builder
     */
    @NotNull
    public SettingsManagerBuilder migrationService(@Nullable MigrationService migrationService) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Registers the default migration service to the builder, which triggers a rewrite of the
     * configuration file if a property is missing from it.
     *
     * @return this builder
     */
    @NotNull
    public SettingsManagerBuilder useDefaultMigrationService() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a settings manager instance. It is mandatory that resource and configuration data have been
     * configured beforehand.
     *
     * @return the settings manager
     */
    @NotNull
    public SettingsManager create() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
