public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.method1();
        System.out.println("Hello, World!");
    }

    public void method1() throws Exception {
        System.out.println("method1");
        try {
            method2();
            return;
        } catch (Exception e) {
            System.out.println("method1 catch Exception");
        }
    }

    public void method2() throws Exception {
        System.out.println("method2");
        try {
            method3();
            System.out.println("method2 end");
            return;
        } catch (Exception e) {
            System.out.println("method2 catch Exception");
        }
    }

    public void method3() throws Exception {
        try {
            System.out.println("method3");
            method4();
            return;
        } catch (Exception e) {
            System.out.println("method3 catch Exception");
        }
    }

    public void method4() throws Exception {
        System.out.println("method4");
        throw new Exception("");
    }
}
