String [] history = {"2*3=6", "3*3=9", "11*11=121"};

ArrayAdapter<String> adapter = new ArrayAdapter<>(this, 
                R.layout.my_super_list_item, history);
    
((ListView) findViewById(R.id.lvHistory)).setAdapter(adapter);
