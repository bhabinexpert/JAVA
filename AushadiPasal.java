public class AushadiPasal {
    public static void main(String[] args) {

        // 3 Medicines
        String m1 = "Paracetamol (प्यारासिटामोल)";
        String m2 = "Amoxicillin (एमोक्सिसिलिन)";
        String m3 = "Cetirizine (सेटिरिजिन)";

        // Header
        System.out.println("==============================================================");
        System.out.println("           AUSHADHI PASAL - INVENTORY REPORT");
        System.out.println("==============================================================");
        System.out.println("Medicine Name (Nepali Name)      | Price | Stock | Prescription");
        System.out.println("----------------------------------------------------------------");

        // Print each medicine with manual spacing
        System.out.println(m1 + "          | 2.5   |   150   |   No");
        System.out.println(m2 + "          | 15.0  |    80   |   Yes");
        System.out.println(m3 + "             | 5.75   |    00   |    No");

        // Footer
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Total Medicines: 3");
        System.out.println("=================================================================");
    }
}