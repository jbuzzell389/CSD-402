

public class UseDivision {
    public static void main(String[] args) {
        // Two InternationalDivision instances
        InternationalDivision intDiv1 =
            new InternationalDivision("European Sales", 1001, "France", "French");
        InternationalDivision intDiv2 =
            new InternationalDivision("Asian Sales", 1002, "Japan", "Japanese");

        // Two DomesticDivision instances
        DomesticDivision domDiv1 =
            new DomesticDivision("Midwest Sales", 2001, "Nebraska");
        DomesticDivision domDiv2 =
            new DomesticDivision("East Coast Sales", 2002, "New York");

        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}