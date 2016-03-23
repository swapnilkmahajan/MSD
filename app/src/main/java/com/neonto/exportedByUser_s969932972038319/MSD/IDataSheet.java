package com.neonto.exportedByUser_s969932972038319.MSD;

import java.util.ArrayList;
import java.util.HashMap;

public interface IDataSheet {

    public String getName();

    public ArrayList<HashMap<String, HashMap<String, Object>>> getRows();

    public void saveRowWithValues(HashMap<String, Object> values);
    public void updateRow(int row, HashMap<String, Object> values);
    public void deleteRow(int row);

    public void notifyRowsModified();


    public interface IDataSheetChangeListener {
        public void dataSheetUpdated(IDataSheet sheet);
    }

    public void addListener(IDataSheetChangeListener listener);
    public void removeListener(IDataSheetChangeListener listener);
}
