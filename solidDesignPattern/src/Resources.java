public class Resources {
    private final String resourceType;
    private final String title;

    public String getTitle() {
        return title;
    }

    public String getResourceType() {
        return resourceType;
    }

    public Resources(String resourceType, String title) {
        this.resourceType = resourceType;
        this.title = title;
    }


}