public boolean onContextItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case ContextMenu.COLOR_RED_ITEM_ID:
            display.setTextColor(Color.RED);
            break;
        case ContextMenu.COLOR_BLUE_ITEM_ID:
            display.setTextColor(Color.BLUE);
            break;
        case ContextMenu.VIEW_HISTORY_ITEM_ID:
            showHistory();
            break;
        default:
            Log.e("myTag", "unknown context menu item");
    }
    return super.onContextItemSelected(item);
}