public boolean onContextItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.contextmenu_backspace:
            backspace();
            break;
        case R.id.contextmenu_clearall:
            clear();
            break;
        case R.id.contextmenu_disable:
            clearButtonsEnabled = false;
            break;
        default:
            Log.e("myTag", "unknown context menu item");
    }
    return super.onContextItemSelected(item);
}