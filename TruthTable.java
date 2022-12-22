package truthtable;

public class TruthTable {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("|          Conditional AND (&&)           |");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "Conditions", "Results");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "false && false", "false");
        System.out.printf("|  %-15s     |   %-15s|%n", "false && true", "false");
        System.out.printf("|  %-15s     |   %-15s|%n", "true && false", "false");
        System.out.printf("|  %-15s     |   %-15s|%n", "true && true", "true");
        System.out.println("-------------------------------------------");

        System.out.printf("%n%n");

        System.out.println("-------------------------------------------");
        System.out.println("|          Conditional OR  (||)           |");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "Conditions", "Results");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "false || false", "false");
        System.out.printf("|  %-15s     |   %-15s|%n", "false || true", "true");
        System.out.printf("|  %-15s     |   %-15s|%n", "true || false", "true");
        System.out.printf("|  %-15s     |   %-15s|%n", "true || true", "true");
        System.out.println("-------------------------------------------");

        System.out.printf("%n%n");

        System.out.println("-------------------------------------------");
        System.out.println("|         Boolean Logical OR (|)          |");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "Conditions", "Results");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "false | false", "false");
        System.out.printf("|  %-15s     |   %-15s|%n", "false | true", "true");
        System.out.printf("|  %-15s     |   %-15s|%n", "true | false", "true");
        System.out.printf("|  %-15s     |   %-15s|%n", "true | true", "true");
        System.out.println("-------------------------------------------");



        System.out.printf("%n%n");

        System.out.println("-------------------------------------------");
        System.out.println("|        Boolean Exclusive OR (^)         |");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "Conditions", "Results");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "false ^ false", "false");
        System.out.printf("|  %-15s     |   %-15s|%n", "false ^ true", "true");
        System.out.printf("|  %-15s     |   %-15s|%n", "true ^ false", "true");
        System.out.printf("|  %-15s     |   %-15s|%n", "true ^ true", "false");
        System.out.println("-------------------------------------------");


        System.out.printf("%n%n");

        System.out.println("-------------------------------------------");
        System.out.println("|              Logical NOT (!)            |");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", "Conditions", "Results");
        System.out.println("|-----------------------------------------|");
        System.out.printf("|  %-15s     |   %-15s|%n", " !false", "true");
        System.out.printf("|  %-15s     |   %-15s|%n", " !true", "false");
        System.out.println("-------------------------------------------");



    }
}
