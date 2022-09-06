class OuterClass {
    int x = 10;

//    class InnerClass { // Reguler class
//        int x = 5;
//    }

    static class InnerClass { // Static class
        int x = 5;

        public String greetings() {
            return "Hello";
        }
    }
//    private class InnerClass { // Private class tidak dapat di akses dari outer class
//        int x = 5;
//    }

}

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        System.out.println(innerClass.x + outerClass.x);

        OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass();
        System.out.println(innerClass1.greetings()); // Access method in innerclass
    }
}
