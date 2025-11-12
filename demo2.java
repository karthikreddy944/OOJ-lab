class book{
    String name;
    String author;
    double price;
    int num_pages;
    public book(String n, String a, double p, int no_of){
        name=n;
        author=a;
        price=p;
        num_pages=no_of;
    }
    public void setdetials(String n1,String a1,double p1,int no_of1){
        name=n1;
        author=a1;
        price=p1;
        num_pages=no_of1;
    }
    public void getdetials(){
        System.out.println("Name of Book: "+name);
        System.out.println("Author of the Book: "+author);
        System.out.println("Price of the Book: "+price);
        System.out.println("No.of pages in the Book: "+num_pages);
    }
    public String toString(){
      return "Book Name: "+name+ ","+ "Author Name: "+author +","+"Prices: "+price+","+"No.of pages: "+num_pages+".";
    }
}

class demo2{
    public static void main(String arr[]){
        book b1=new book("Avengers","James",1000.0,340);
        b1.setdetials("DC","Brown",1200.0,560);
        b1.getdetials();
        System.out.println("Using toString method:");
        System.out.println(b1);
    }
}