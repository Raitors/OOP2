public class ServiceStation {
    public void check(Service service) {
        service.doService();
    }

    public void check(Service[] services) {
        for (Service service : services) {
            service.doService();
        }
    }
}