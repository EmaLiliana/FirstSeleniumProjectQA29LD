public class MainLoginTest {


    public static void main(String[] args) throws InterruptedException {

       LoginTest loginTest = new LoginTest();

       loginTest.loginWithValidData();

    }


    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
