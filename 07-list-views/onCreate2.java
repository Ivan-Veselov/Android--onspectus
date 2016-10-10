String [] history = getResources().getStringArray(R.array.default_history); // !!!

ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.my_super_list_item, history);

((ListView) findViewById(R.id.lvHistory)).setAdapter(adapter);
