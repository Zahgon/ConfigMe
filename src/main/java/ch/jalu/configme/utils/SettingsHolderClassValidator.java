package ch.jalu.configme.utils;

import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.configurationdata.ConfigurationData;
import ch.jalu.configme.configurationdata.ConfigurationDataBuilder;
import ch.jalu.configme.migration.MigrationService;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.resource.PropertyReader;
import ch.jalu.configme.resource.PropertyResource;
import ch.jalu.typeresolver.EnumUtils;
import ch.jalu.typeresolver.reflect.FieldUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Validates various characteristics of the property implementations of SettingsHolder classes for consistency.
 * Finds potential technical or quality issues with a project's property declarations. This class is intended to
 * be used in a unit test.
 * <p>
 * This class's methods can be overridden for custom behavior. Depending on your needs, you can call the main
 * {@code validate} method and override single validation methods you want to customize or disable, or call the
 * individual validation methods separately.
 */
public class SettingsHolderClassValidator {

    private static final int DEFAULT_MAX_COMMENTS_LENGTH = 90;

    // ---- Main validation methods (with default settings)
    /**
     * Runs all validations of this class with the given settings holder classes.
     * More details at {@link #validate(Iterable)}.
     *
     * @param settingHolders settings holder classes that make up the configuration data of the project
     */
    @SafeVarargs
    public final void validate(@NotNull Class<? extends SettingsHolder>@NotNull ... settingHolders) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Runs all validations of this class with the given settings holder classes. Some of the validations
     * are not needed from a technical point of view and may be undesired in your project. They can all be
     * run individually and can be customized by supplying different method parameters or by overriding methods
     * in this class.
     *
     * @param settingHolders settings holder classes that make up the configuration data of the project
     */
    public void validate(@NotNull Iterable<Class<? extends SettingsHolder>> settingHolders) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Validates that the migration service does not declare that a migration is required for the given
     * configuration data, which gets saved to the provided resource beforehand. This is intended to
     * validate that the default values of a configuration do not trigger a migration:
     * <ul>
     *   <li>the configuration data should only have default values</li>
     *   <li>the resource should only be for this method and thus use a temporary file</li>
     * </ul>
     *
     * @param configurationData the configuration data (with default values, i.e. as created from the properties)
     * @param resource property resource to save to and read from (temporary medium for testing)
     * @param migrationService the migration service to check
     */
    public void validateConfigurationDataValidForMigrationService(@NotNull ConfigurationData configurationData, @NotNull PropertyResource resource, @NotNull MigrationService migrationService) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // ---- Individual validations
    /**
     * Throws an exception if any Property field of the given classes is not public, static, or final.
     *
     * @param settingHolders the classes to check
     */
    public void validateAllPropertiesAreConstants(@NotNull Iterable<Class<? extends SettingsHolder>> settingHolders) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Throws an exception if any of the provided settings holder classes is not final.
     *
     * @param settingHolders the classes to check
     */
    public void validateSettingsHolderClassesFinal(@NotNull Iterable<Class<? extends SettingsHolder>> settingHolders) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Throws an exception if any of the provided setting holder classes does not have a single private
     * no-arg constructor.
     *
     * @param settingHolders the classes to check
     */
    public void validateClassesHaveHiddenNoArgConstructor(@NotNull Iterable<Class<? extends SettingsHolder>> settingHolders) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Throws an exception if there isn't a non-empty comment for every property in the configuration data.
     *
     * @param configurationData the configuration data to check
     * @param propertyFilter predicate determining which properties are checked (if null, are properties are checked)
     */
    public void validateHasCommentOnEveryProperty(@NotNull ConfigurationData configurationData, @Nullable Predicate<Property<?>> propertyFilter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Throws an exception if any comment line in the configuration data has a length is not between the given
     * minLength and maxLength, inclusive: {@code minLength <= length <= maxLength}. Either argument is nullable
     * if no min or max, respectively, is desired, but both arguments may not be null.
     *
     * @param configurationData the configuration data with the comments to check
     * @param minLength the number of characters each comment line must at least have (null to disable check)
     * @param maxLength the number of characters each comment may not surpass (null to disable check)
     */
    public void validateCommentLengthsAreWithinBounds(@NotNull ConfigurationData configurationData, @Nullable Integer minLength, @Nullable Integer maxLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Throws an exception if the comments of an enum property do not list all entries of the enum type.
     *
     * @param configurationData the configuration data whose properties and comments should be checked
     * @param propertyFilter predicate determining which properties are checked (if null, are properties are checked)
     */
    public void validateHasAllEnumEntriesInComment(@NotNull ConfigurationData configurationData, @Nullable Predicate<Property<?>> propertyFilter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // ---- Validation helpers
    protected boolean isValidConstantField(@NotNull Field field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected ConfigurationData createConfigurationData(@NotNull Iterable<Class<? extends SettingsHolder>> classes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean hasNonEmptyComment(@Nullable List<String> comments) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a predicate based on input min length and max length that evaluates successfully for a string if
     * its length is within the given bounds: {@code minLength <= length <= maxLength}. Either length may be null,
     * but an exception is thrown if both are null.
     *
     * @param minLength the min length (nullable)
     * @param maxLength the max length (nullable)
     * @return predicate based on the supplied length parameters
     */
    @NotNull
    protected Predicate<String> createValidLengthPredicate(@Nullable Integer minLength, @Nullable Integer maxLength) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the type of the given property if it is an enum, otherwise null.
     *
     * @param property the property to process
     * @return the enum type it wraps, or null if not applicable
     */
    @Nullable
    protected Class<? extends Enum<?>> getEnumTypeOfProperty(@NotNull Property<?> property) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @NotNull
    protected List<String> gatherExpectedEnumNames(@NotNull Class<? extends Enum<?>> enumClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean hasValidConstructorSetup(@NotNull Class<? extends SettingsHolder> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
