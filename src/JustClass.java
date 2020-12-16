public class JustClass {
    @BeforeSuite
    public void start() {
        System.out.println("start");
    }

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test1");
    }

    @Test(priority = 5)
    public void test2() {
        System.out.println("Test2");
    }

    @Test(priority = 5)
    public void test3() {
        System.out.println("Test3");
    }

    @Test(priority = 10)
    public void test4() {
        System.out.println("Test4");
    }


    @AfterSuite
    public void stop() {
        System.out.println("stop");
    }

    @Test(priority = 8)
    public void test5() {
        System.out.println("Test5");
    }

    @Test(priority = 9)
    public void test6() {
        System.out.println("Test6");

    }
}
