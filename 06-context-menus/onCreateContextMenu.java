protected void onCreate(Bundle savedInstanceState) {
    
    //Some code
    
    // registerForContextMenu(view);
    
    registerForContextMenu(findViewById(R.id.numberField));
}

public void onCreateContextMenu(android.view.ContextMenu menu, View view_i, ContextMenuInfo menuInfo) {
    switch (view_i.getId()) {
        case R.id.numberField:
            // menu.add(groupId, itemId, order, label);
            menu.add(0, COLOR_BLUE_ITEM_ID, 2, "Blue");
            menu.add(0, COLOR_RED_ITEM_ID, 0, "Red");
            menu.add(1, VIEW_HISTORY_ITEM_ID, 100500, "View history");
            break;
    }
}