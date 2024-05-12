import java.util.*;

public class TestProgram {
    public static void main(String[] args) {

        Map<String, ResourceBorrower> resourceTypes = new HashMap<>();
        resourceTypes.put("manga", new ResourceType());
        resourceTypes.put("dictionary", new ResourceType());
        resourceTypes.put("comic", new ResourceType());
        resourceTypes.put("biography", new ResourceType());

        Student stud1 = new Student("Angelo");
        Student stud2 = new Student("Ramona Flowers");
        Student stud3 = new Student("Liza Soberano");

        Resources manga = new Resources("manga", "Jujutsu Kaisen");
        Resources dictionary = new Resources("dictionary", "Merriam-Webster");
        Resources comic = new Resources("comic", "The Amazing Spiderman");
        Resources biography = new Resources("biography", "Biography of Jose Rizal");

        ResourceProcessor resourceProcessor = new ResourceProcessor(resourceTypes);

        //prints
        System.out.println();
        System.out.println("   ======= Welcome to the Library System =======");
        System.out.println();
        resourceProcessor.resourceBorrower(stud1, manga);
        System.out.println();
        resourceProcessor.resourceBorrower(stud2, dictionary);
        System.out.println();
        resourceProcessor.resourceBorrower(stud2, comic);
        System.out.println();
        resourceProcessor.resourceBorrower(stud3, biography);
        System.out.println();
        resourceProcessor.resourceBorrower(stud1, comic);
        System.out.println();
        resourceProcessor.resourceBorrower(stud2, biography);
    }
}