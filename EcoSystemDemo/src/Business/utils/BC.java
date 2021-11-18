/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.utils;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.event.CellEditorListener;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author shivibhatt
 */
//

public class BC extends JButton implements TableCellRenderer, TableCellEditor {
  private int selectedRow;
  private int selectedColumn;
  Vector<TBL> listener;

  public BC(String text) {
    super(text); 
    listener = new Vector<TBL>();
    addActionListener(new ActionListener() { 
      public void actionPerformed( ActionEvent e ) { 
        for(TBL l : listener) { 
          l.tBC(selectedRow, selectedColumn);
        }
      }
    });
  }


  public void addTBL( TBL l ) {
    listener.add(l);
  }

  public void removeTBL( TBL l ) { 
    listener.remove(l);
  }

  @Override 
  public Component getTableCellRendererComponent(JTable table,
    Object value, boolean isSelected, boolean hasFocus, int row, int col) {
    return this;
  }

  @Override
  public Component getTableCellEditorComponent(JTable table,
      Object value, boolean isSelected, int row, int col) {
    selectedRow = row;
    selectedColumn = col;
    return this;
  } 

  @Override
  public void addCellEditorListener(CellEditorListener arg0) {      
  } 

  @Override
  public void cancelCellEditing() {
  } 

  @Override
  public Object getCellEditorValue() {
    return "";
  }

  @Override
  public boolean isCellEditable(EventObject arg0) {
    return true;
  }

  @Override
  public void removeCellEditorListener(CellEditorListener arg0) {
  }

  @Override
  public boolean shouldSelectCell(EventObject arg0) {
    return true;
  }

  @Override
  public boolean stopCellEditing() {
    return true;
  }

}

