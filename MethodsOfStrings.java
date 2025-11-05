public class MethodsOfStrings {
    public static void main(String[] args) {
        String firstName = "Bhabin";
        String lastName = "Dulal";
        String fullName = firstName + " " + lastName;

        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
    }
}
