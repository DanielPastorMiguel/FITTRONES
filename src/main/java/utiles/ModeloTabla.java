package utiles;
import java.io.Serializable;
import javax.swing.table.DefaultTableModel;

public class ModeloTabla extends DefaultTableModel implements Serializable{
    
    public ModeloTabla(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }
    
    @Override
    public boolean isCellEditable(int row, int column){
        return false;
    }
    
    @Override
    public Class getColumnClass(int columna){
      return String.class;
   }
    
}
