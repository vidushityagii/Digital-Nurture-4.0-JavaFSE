package Mocking.Exercise2;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void fetchData() {
        api.getData(); // This call will be verified in the test
    }
}
