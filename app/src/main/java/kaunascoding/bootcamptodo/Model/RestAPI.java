package kaunascoding.bootcamptodo.Model;

import java.util.ArrayList;
import java.net.*;
import java.util.Scanner;

public class RestAPI implements DBComunication {

    public static final String URL = "http://192.168.100.1";
    public static final String ALL_ITEMS = "/items";
    public static final String DELETE_ITEM = "/item/delete/{id}";
    public static final String UPDATE_ITEM = "/item/edit{id}";
    public static final String ADD_ITEM = "/item/add";


    @Override
    public ArrayList<ItemVO> getAllItems() {
        ArrayList<ItemVO> result = new ArrayList<>();

        URL url = null;
        try {
            url = new URL(RestAPI.URL + RestAPI.ALL_ITEMS);
            Scanner sc = new Scanner(url.openStream());
            int i = 0;
            while (sc.hasNext()) {
                ItemVO item = new ItemVO();
                item.id = i++;
                item.done = sc.nextInt();
                item.title = sc.nextLine();
                result.add(item);
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public void addItem(String task) {

    }

    @Override
    public void deleteItem(ItemVO itemVO) {

    }

    @Override
    public void updateItem(ItemVO itemVO) {

    }
}
