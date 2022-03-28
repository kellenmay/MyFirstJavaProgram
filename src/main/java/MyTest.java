interface Sample {

    String change(int d);
}

class MyTest implements Sample {

    public String change(int s) {
        return "Hello";
    }
}