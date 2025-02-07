/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import java.util.LinkedHashMap;

/**
 *
 * @author adria_6
 */
public class ItemList {
    LinkedHashMap<String, Item> itemsMap = new LinkedHashMap<>();

    public ItemList() {
    }
    public void addItem(Item item){
        itemsMap.put(item.getId(), item);
    }

    public LinkedHashMap<String, Item> getItemsMap() {
        return itemsMap;
    }
}
