public void onCreateContextMenu(android.view.ContextMenu menu, View view_i, ContextMenuInfo menuInfo) {
    switch (v.getId()) {
        case R.id.btnClear:
            getMenuInflater().inflate(R.menu.context_menu, menu);
            break;
}