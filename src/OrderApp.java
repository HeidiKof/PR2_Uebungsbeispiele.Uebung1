public class OrderApp {
    public static void main(String[] args) {
        Order od = new Order(4);

        Article a = new Article("Chocolate",10, 2.50);
        Article b = new Article("Tea", 5, 5.0);
        Article c = new Article("Jigsaw Puzzle", 2, 12.0);
        Article d = new Article("Crayons", 15, 10.0);

        od.addArticle(a);
        od.addArticle(b);
        od.addArticle(c);
        od.addArticle(d);
//        od.removeArticle(12);
//        System.out.println(od.articles[0]);
        System.out.println(od);
        System.out.println("od.findMostExpensiveArticle() = " + od.findMostExpensiveArticle());
        System.out.println("od.findMostExpensiveOrderPosition() = " + od.findMostExpensiveOrderPosition());
        System.out.println("od.getNrArticles() = " + od.getNrArticles());
        System.out.println("od.sumOrder() = " + od.sumOrder());
        System.out.println("od.calculateTax() = " + od.calculateTax());
        System.out.println("od.sumOrderWithTax() = " + od.sumOrderWithTax());
        od.removeArticle(3);
        System.out.println(od);
        System.out.println("od.getNrArticles() = " + od.getNrArticles());
    }
}