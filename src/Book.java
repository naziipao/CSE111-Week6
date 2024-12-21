public class Book {
    public static int total_books_sold;
    public static double total_revenue;
    public String title;
    public static int basePrice = 150;
    public static double discountPercentage;
    public static double afterDiscount;

    public Book(String s, double n) {
        title = s;
        discountPercentage = n / 100;
        total_books_sold++;
    }

    public static double discountedPrice() {
        afterDiscount = basePrice - basePrice * discountPercentage;
        total_revenue += afterDiscount;
        return afterDiscount;
    }

    public void bookDetails() {
        System.out.println("Title: " + title + "\nPrice after Discount: " + discountedPrice() + " TK");
    }
}

