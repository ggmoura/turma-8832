package br.com.osi;

import javax.swing.JTable;

public class FTable extends JTable {  
    
    /** Creates a new instance of FTable */  
    public FTable() {  
        super();  
    }  
    public boolean isCellEditable(int row, int column) {  
        return false;  
    }  
      
}  