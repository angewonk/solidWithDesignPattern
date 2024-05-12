import java.util.*;

public class ResourceProcessor {
    private final Map<String, ResourceBorrower> resourceTypes;
    public void resourceBorrower(Student student, Resources resources) {
        String resourceType = resources.getResourceType();
        ResourceBorrower resourceBorrow = resourceTypes.get(resourceType);

        if (!resourceTypes.containsKey(resourceType)) {
            throw new IllegalArgumentException(resourceType + " resource type not found");
        }

        resourceBorrow.borrowResource(student, resources);
    }

    public ResourceProcessor(Map<String, ResourceBorrower> resourceTypes) {
        this.resourceTypes = resourceTypes;
    }


}