package ch.jalu.configme.configurationdata;

import ch.jalu.configme.Comment;
import ch.jalu.configme.SettingsHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.UnmodifiableView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Allows to register comments (intended via {@link SettingsHolder#registerComments}).
 */
public class CommentsConfiguration {

    /**
     * Fake path under which footer comments are registered.
     */
    public static final String FOOTER_KEY = "..FOOTER";

    @NotNull
    private final Map<String, List<String>> comments;

    /**
     * Constructor.
     */
    public CommentsConfiguration() {
        this.comments = new HashMap<>();
    }

    /**
     * Constructor.
     *
     * @param comments map to store comments in
     */
    public CommentsConfiguration(@NotNull Map<String, List<String>> comments) {
        this.comments = comments;
    }

    /**
     * Sets the given lines for the provided path, overriding any previously existing comments for the path.
     * An entry that is a sole new-line (i.e. "\n") will result in an empty line without any comment marker.
     *
     * @param path the path to register the comment lines for
     * @param commentLines the comment lines to set for the path
     */
    public void setComment(@NotNull String path, @NotNull String@NotNull ... commentLines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns a read-only view of the map with all comments.
     *
     * @return map with all comments
     */
    @NotNull
    @UnmodifiableView
    public Map<String, @UnmodifiableView List<String>> getAllComments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the given lines as footer comments. They will be written at the end of the configuration file.
     *
     * @param commentLines the comment lines to add as footer comments
     */
    public void setFooterComments(@NotNull String... commentLines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Adds the given lines as header comments. They will be written at the start of the configuration file.
     *
     * @param commentLines the comment lines to add as header comments
     */
    public void setHeaderComments(@NotNull String... commentLines) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
