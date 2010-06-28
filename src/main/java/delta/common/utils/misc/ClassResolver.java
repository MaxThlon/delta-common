package delta.common.utils.misc;

import org.apache.log4j.Logger;

import delta.common.utils.traces.UtilsLoggers;

/**
 * Object capable of finding classes that inherit from a superclass.
 * @author DAM
 * @param <T> Target class
 */
public class ClassResolver<T>
{
  private static final Logger _logger=UtilsLoggers.getUtilsLogger();

  private Class<? extends T> _targetClass;

  /**
   * Constructor.
   * @param targetClass Superclass of resolved classes.
   */
  public ClassResolver(Class<? extends T> targetClass)
  {
    _targetClass=targetClass;
  }

  /**
   * Find a class by name.
   * @param className Name of class to find.
   * @return A <tt>Class</tt> that inherits from the managed target class or <code>null</code> if not found.
   */
  @SuppressWarnings("unchecked")
  public Class<? extends T> findClass(String className)
  {
    Class<? extends T> ret=null;
    try
    {
      Class<?> clazz=Class.forName(className);
      if (_targetClass.isAssignableFrom(clazz))
      {
        ret=(Class<? extends T>)clazz;
      }
      else
      {
        _logger.error("Class "+className+" is not a subclass of "+_targetClass.getName());
      }
    }
    catch (Exception e)
    {
      _logger.error("Cannot load class "+className,e);
    }
    return ret;
  }
}
