package delta.common.utils.application.config.path;

import java.nio.file.Path;

/**
 * Configuration for application paths.
 * @author MaxThlon
 */
public interface ApplicationPathConfiguration
{
  /**
   * Get the path.
   * @return a directory path.
   */
  public Path getPath();

  /**
   * Set the path.
   * @param path a directory path.
   */
  public void setPath(Path path);

  /**
   * Get the user path.
   * @return a user directory path.
   */
  public Path getUserPath();

  /**
   * Set the user path.
   * @param userPath a user directory path.
   */
  public void setUserPath(Path userPath);
}
