@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.v("mySuperTag", "Hello, Verbose");
    Log.d("mySuperAnotherTag", "Hello, Debug");
    Log.i("oneMoreTag", "Hello, Info");
    Log.w("myTag", "Hello, Warn");
    Log.e("myTag", "Hello, Error");
    Log.wtf("myTag", "What a Terrible Failure!");
}

