public class stringmethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Length of the string
        int length = str.length();
        System.out.println("Length: " + length);
        
        // Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase: " + upperCaseStr);
        
        // Convert to lowercase
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseStr);
        
        // Check if the string contains a substring
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // Replace a substring
        String replacedStr = str.replace("World", "Java");
        System.out.println("Replaced: " + replacedStr);
        
        // Split the string into an array
        String[] words = str.split(", ");
        System.out.println("Split: ");
        for (String word : words) {
            System.out.println(word);
        }
        
        // Trim whitespace from the string
        String trimmedStr = "   Hello, Java!   ".trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");
    }
}
