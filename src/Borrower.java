public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    //instance variables :-
    public String name;
    public String [] arr1 = new String[3];
    public int insCount;
    public Borrower(String s){
        name = s;
    }

    public static void bookStatus(){
        System.out.println("Available Books: ");
        for(int i = 0; i<book_count.length; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }

    public void borrowBook(String s){
        for(int i = 0; i<book_name.length;i++){
            if(book_name[i].equals(s)){
                if(book_count[i] != 0){
                    book_count[i]--;
                    arr1[insCount] = s;
                    insCount++;
                }
                else{
                    System.out.println("This book is not available.");
                }
            }
        }
    }

    public static int remainingBooks(String s){
        for(int i = 0; i<book_count.length;i++){
            if(book_name[i].equals(s)){
                return book_count[i];
            }
        }
        return 0;
    }

    public void borrowerDetails(){
        System.out.println("Name: " + name + "\nBooks Borrowed:");
        for(int i =0 ;i<insCount; i++){
            System.out.println(arr1[i]);
        }
    }
}