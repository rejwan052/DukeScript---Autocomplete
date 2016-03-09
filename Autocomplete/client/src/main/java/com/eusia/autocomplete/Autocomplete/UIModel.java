/**
 * ***********************************************************
 * Copyright (c) 2012-2016, EUSIA BD LTD. and/or its affiliates. All rights reserved.
 * EUSIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 * ************************************************************
 */

package com.eusia.autocomplete.Autocomplete;

import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.OnPropertyChange;
import net.java.html.json.Property;

/**
 * Generates UI class that provides the application logic model for the HTML
 * page.
 * 
 * @author Imtiaz Kabir
 * @since 01/01/2016
 * @version 1.0.1
 * 
 */
@Model(className = "UI", targetId = "", properties = {
    @Property(name = "keyword", type = String.class), // Binded as textInput : take the input
    @Property(name = "items", type = Item.class, array = true), // contains all the items : Loading when call onPageLoad()
    @Property(name = "selecteditems", type = Item.class, array = true), // contains selected items: filtered by keyword at @OnPropertyChange("keyword")    
    @Property(name = "selecteditem", type = Item.class), // contains single item from selected items list
    @Property(name = "displayclass", type = String.class), // selected items list display controller
})
public class UIModel {

    @Model(className = "Item", targetId = "", properties = {
        @Property(name = "id", type = int.class),// id is used to identify each item
        @Property(name = "name", type = String.class)
    })
    public static class ItemModel {

        /**
         * This function is used to select a single element from the list of
         * autocomplete suggestion
         *
         */
        @Function
        static void selectItem(Item item) {
            // keyword is binded as textInput, thats why the name of selected element is set into the keyword when selected.
            ui.setKeyword(item.getName());
            // "selecteditem" contains the item selected from the autocomplete suggestion list.
            Item selectedItem = new Item();
            selectedItem.setId(item.getId());
            selectedItem.setName(item.getName());
            // set the data of selected item to the "selecteditem"
            ui.setSelecteditem(selectedItem);
            // when selected turn off the display of suggestion list
            ui.setDisplayclass("none");
        }
    }

    /**
     *
     * this method is used for filtering the unsorted list it takes "keyword" as
     * input and return a filtered list named "selecteditems"
     *
     * here an integer named "count" is used to control the maximum display
     * items. when we get a filtered list contains more than 5 itms then it
     * shows the top 5 items in the list.
     *
     */
    @OnPropertyChange("keyword")
    static void checkKeyword(UI ui) {
        int count = 0;
        String key = ui.getKeyword();
        ui.getSelecteditems().clear();
        ui.setDisplayclass("none");
        if (null == key || key.isEmpty()) {
            ui.setDisplayclass("none");
        } else {
            
            int totalItems = ui.getItems().size();
            for (int i = 0; i < totalItems; i++) {
                int mainListItemId = ui.getItems().get(i).getId();
                String mainListItemName = ui.getItems().get(i).getName();
                if ((mainListItemName.toLowerCase()).startsWith(key.toLowerCase())) {
                    if (count >= 5) {
                        break;
                    } else {
                        Item item = new Item();
                        item.setId(mainListItemId);
                        item.setName(mainListItemName);
                        ui.getSelecteditems().add(item);
                        count++;
                    }
                    ui.setDisplayclass("block");
                }
            }
        }
    }

    private static UI ui;

    public static UI getui() {
        return ui;
    }

    static void onPageLoad() throws Exception {
        ui = new UI();
        ui.setKeyword("");

        Item item1 = new Item();
        item1.setId(1);
        item1.setName("ABANDON");
        ui.getItems().add(item1);

        Item item2 = new Item();
        item2.setId(1);
        item2.setName("ABILITY");
        ui.getItems().add(item2);

        Item item3 = new Item();
        item3.setId(1);
        item3.setName("ABOUT");
        ui.getItems().add(item3);

        Item item4 = new Item();
        item4.setId(1);
        item4.setName("ABROAD");
        ui.getItems().add(item4);

        Item item5 = new Item();
        item5.setId(1);
        item5.setName("ACCOUNTANT");
        ui.getItems().add(item5);

        Item item6 = new Item();
        item6.setId(1);
        item6.setName("ASTROLOGY");
        ui.getItems().add(item6);

        Item item7 = new Item();
        item7.setId(1);
        item7.setName("APPLE");
        ui.getItems().add(item7);

        Item item8 = new Item();
        item8.setId(1);
        item8.setName("ANATOMY");
        ui.getItems().add(item8);

        Item item9 = new Item();
        item9.setId(1);
        item9.setName("ACCEPTANCE");
        ui.getItems().add(item9);

        Item item10 = new Item();
        item10.setId(1);
        item10.setName("ABOVE");
        ui.getItems().add(item10);

        ui.setDisplayclass("none");
        ui.applyBindings();
    }

}
