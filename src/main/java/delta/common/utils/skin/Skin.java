package delta.common.utils.skin;

import java.nio.file.Path;
import java.util.Map;

/**
 * Skin
 * @author MaxThlon
 */
public class Skin {
  /**
   * PanelFile
   * @author MaxThlon
   */
  public static class PanelFile {
    /**
     * Element
     * @author MaxThlon
     */
    public static class Element {
      @SuppressWarnings("javadoc")
      public int _x,_y,_width,_height;
       
       /**
       * @param x
       * @param y
       * @param width
       * @param height
       */
      public Element(int x, int y, int width, int height) {
         _x=x; _y=y; _width=width; _height=height;
       }
     }
     
     /**
     * Map elementName, element
     */
    public Map<String, Element> _elements;
     
     /**
     * @param elements
     */
    public PanelFile(Map<String, Element> elements) {
       _elements=elements;
     }
   }
  
  /**
   * Map mapping name, mapping
   */
  public Map<String, Path> _mappings;
  /**
   * Map panel name, panel
   */
  public Map<String, PanelFile> _panelFiles;
  
  /**
   * @param mappings
   * @param panelFiles
   */
  public Skin(Map<String, Path> mappings,
              Map<String, PanelFile> panelFiles) {
    _mappings=mappings;
    _panelFiles=panelFiles;
  }
  
}
