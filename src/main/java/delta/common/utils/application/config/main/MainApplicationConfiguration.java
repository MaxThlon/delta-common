package delta.common.utils.application.config.main;

import delta.common.utils.application.config.path.ApplicationPathConfiguration;

/**
 * @author MaxThlon
 */
public abstract class MainApplicationConfiguration {
  protected static MainApplicationConfiguration _instance;

  protected MainApplicationConfiguration() {
    _instance=this;
  }

  public static MainApplicationConfiguration getInstance()
  {
    return _instance;
  }

  /**
   * Get the application path configuration.
   * @return the application path configuration.
   */
  public abstract ApplicationPathConfiguration getAppPathConfiguration();
}
