
    class A
    {
        int a=10;
    }
    class Test extends A {
        int a = 20;

        void show() {
            System.out.println(super.a);
            System.out.println(a);
        }
        public static void main(String[] args) {
            Test ob=new Test();
            ob.show();
        }
    }



