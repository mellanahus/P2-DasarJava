// percobaan untuk mengambil hasil perubahan nilai dari suatu operasi matematis

public class B_OperaorB {
    public static void main(String[] args) {

        float total = 14000;
        System.out.println("Original investment : $"+total);
        // Increases by 40 percent the first year
        total = total+(total*.4F);
        System.out.println("After one years : $"+total);
        // Loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years : $"+total);
        // Increases by 12 percent the third year
        total = total + (total*.12F);
        System.out.println("After three years : $"+total);
    }
}
