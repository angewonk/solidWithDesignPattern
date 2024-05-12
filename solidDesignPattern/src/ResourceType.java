public class ResourceType implements ResourceBorrower {
    public void borrowResource(Student student, Resources resources) {
        System.out.println(student.getName() + " requests to borrow the " +
                resources.getResourceType() + " book : " + resources.getTitle());
    }
}