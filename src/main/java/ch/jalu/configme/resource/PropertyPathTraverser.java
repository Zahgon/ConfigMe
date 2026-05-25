package ch.jalu.configme.resource;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for the export of properties: it keeps track of the previously traversed property
 * and returns which path parts are new.
 * <p>
 * For example, if the property for path {@code config.datasource.mysql.type} was exported and we now
 * encounter the property for path {@code config.datasource.driver.version}, the newly encountered
 * sections are {@code driver} and {@code version}.
 */
public class PropertyPathTraverser {

    /**
     * The last path that was processed.
     */
    private String lastPath;

    private boolean isFirstElement = true;

    /**
     * Returns all path elements of the given path.
     *
     * @param path the path to inspect
     * @return path elements (with useful information)
     */
    @NotNull
    public List<PathElement> getPathElements(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the hierarchy level of the highest path element that is being visited for the first time. For example,
     * if we previously processed {@code config.datasource.mysql.type} and the given path is
     * {@code config.datasource.driver.version}, then the level for the path element "driver" is returned (i.e. 2).
     *
     * @param path the new path
     * @return the level of the first new path element
     */
    protected int returnLevelOfFirstNewPathElement(@NotNull String path) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Represents the current element of a path which is currently being handled. This consists of a part of a
     * property's path or may be a property's full path.
     */
    public static class PathElement {

        private final int indentationLevel;

        private final String name;

        private final String fullPath;

        private final boolean isFirstElement;

        private boolean isFirstOfGroup;

        private boolean isEndOfPath;

        public PathElement(int indentationLevel, @NotNull String name, @NotNull String fullPath, boolean isFirstElement) {
            this.indentationLevel = indentationLevel;
            this.name = name;
            this.fullPath = fullPath;
            this.isFirstElement = isFirstElement;
        }

        /**
         * @return the hierarchy level of this path element
         */
        public int getIndentationLevel() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * @return the name of this path element (e.g. "driver")
         */
        @NotNull
        public String getName() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * @return the full path of this element (e.g. "config.datasource.driver")
         */
        @NotNull
        public String getFullPath() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * @return true if this path element is the <b>very first</b> element returned by the traverser; false otherwise
         */
        public boolean isFirstElement() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Returns if this path element is the first new path element of a property. For example, if a property
         * {@code config.datasource.mysql.type} was previously processed and we're now processing the path
         * {@code config.datasource.driver.version}, then the path element representing {@code driver} is considered
         * to be the first of the group.
         *
         * @return true if this path element is the first new element of the path, false otherwise
         */
        public boolean isFirstOfGroup() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        protected void setFirstOfGroup(boolean firstOfGroup) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Returns whether this path element represents the final part of a path, indicating that it is associated with
         * a property. For example, given a property {@code config.datasource.driver.version}, the path element for
         * {@code version} returns true for this method.
         *
         * @return true if this element is the last part of the path (i.e. if it's a "leaf element")
         */
        public boolean isEndOfPath() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        protected void setEndOfPath(boolean isEndOfPath) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
