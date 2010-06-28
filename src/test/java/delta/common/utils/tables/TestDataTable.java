package delta.common.utils.tables;

import java.util.Date;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestDataTable extends TestCase
{
  private static final String NAME_COLUMN="NAME";
  private static final String DATE_COLUMN="DATE";
  private static final int NB_ROWS=10;

  /**
   * Constructor.
   */
  public TestDataTable()
  {
    super("Data table test");
  }

  private DataTable buildTable()
  {
    DataTable table=new DataTable();

    // Name column
    table.addColumn(NAME_COLUMN);
    DataTableColumn nameColumn=table.getColumnByName(NAME_COLUMN);
    Assert.assertNotNull(nameColumn);
    // Date column
    table.addColumn(DATE_COLUMN);
    DataTableColumn dateColumn=table.getColumnByName(DATE_COLUMN);
    Assert.assertNotNull(dateColumn);

    return table;
  }

  private void fillTable(DataTable table)
  {
    DataTableColumn nameColumn=table.getColumnByName(NAME_COLUMN);
    int nameIndex=nameColumn.getIndex();
    DataTableColumn dateColumn=table.getColumnByName(DATE_COLUMN);
    int dateIndex=dateColumn.getIndex();
    for(int i=0;i<NB_ROWS;i++)
    {
     table.addRow();
     table.setData(i,nameIndex,"Nom "+i);
     table.setData(i,dateIndex,new Date(System.currentTimeMillis()+1000*i));
    }
  }

  public void testBuildTable()
  {
    DataTable table=buildTable();
    Assert.assertNotNull(table);
    fillTable(table);
    table.dump(System.out);
  }

  public void testSortTable()
  {
    DataTable table=buildTable();
    fillTable(table);
    DataTableSort sort=new DataTableSort();
    sort.addSort(DATE_COLUMN,Boolean.FALSE);
    table.sort(sort);
    table.dump(System.out);
  }
}
