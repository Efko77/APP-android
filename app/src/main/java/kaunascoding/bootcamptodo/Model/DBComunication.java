package kaunascoding.bootcamptodo.Model;

import java.util.ArrayList;

public interface DBComunication {

    ArrayList<ItemVO> getAllItems();

    void addItem(String task);

    void deleteItem(ItemVO itemVO);

    void updateItem(ItemVO itemVO);
}
