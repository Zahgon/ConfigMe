package ch.jalu.configme.utils;

import ch.jalu.configme.exception.ConfigMeException;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Class with file utilities.
 */
public final class FileUtils {

    private FileUtils() {
    }

    /**
     * Attempts to create the given Path (as file) if it doesn't exist. If creating the file
     * is unsuccessful, an exception is thrown. If the given path exists but is not a file,
     * an exception is thrown, too.
     *
     * @param file the file to create if it doesn't exist
     */
    public static void createFileIfNotExists(@NotNull Path file) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
