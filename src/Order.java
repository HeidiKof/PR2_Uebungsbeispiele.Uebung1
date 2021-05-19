import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int capacityOrder) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return this.nrArticles;
    }

    public int getCapacityOrder() {
        return this.capacityOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "articles=" + Arrays.toString(articles) +
                '}';
    }

    public void addArticle(Article a) {
        if (nrArticles >= capacityOrder) {
            increaseArray();
        }
        articles[nrArticles++] = a;
    }

    private void increaseArray() {
        System.out.println("Capacity increased.");
        Article[] newArt = new Article[capacityOrder + 10];

        for (int i = 0; i < nrArticles; ++i) {
            newArt[i] = articles[i];
        }
        articles = newArt;
        capacityOrder = capacityOrder + 10;
    }

    public int findMostExpensiveArticle() {
        int index = 0;
        double mostExpensive = articles[index].getPrice();

        for (int i = 0; i < capacityOrder; i++) {
            if (articles[i] != null) {
                if (articles[i].getPrice() > mostExpensive) {
                    mostExpensive = articles[i].getPrice();
                    index = i;
                }
            }
        }
        return index + 1;
    }

    public int findMostExpensiveOrderPosition() {
        int index = 0;
        double mostExpensiveOrder = articles[index].getPrice() * articles[index].getNumber();

        for (int i = 0; i < capacityOrder; i++) {
            if (articles[i] != null) {
                if (articles[i].getPrice() * articles[i].getNumber() > mostExpensiveOrder) {
                    mostExpensiveOrder = articles[i].getPrice() * articles[i].getNumber();
                    index = i;
                }
            }
        }
        return index + 1;
    }

    public double sumOrder() {
        double sum = 0;
        for (Article a : articles) {
            if (a != null) {
                sum = sum + a.getPrice();
            }
        }
        return sum;
    }


    public double calculateTax() {
        double sumTax = 0;
        for (Article a : articles) {
            if (a != null) {
                if (a.getPrice() < 20) {
                    sumTax = sumTax + a.getPrice() * 0.05;
                } else {
                    sumTax = sumTax + a.getPrice() * 0.20;
                }
            }
        }
        return sumTax;
    }

    public double sumOrderWithTax() {
        return sumOrder() + calculateTax();
    }

    public void removeArticle(int nr) {
        if (nr > 0 && nr <= nrArticles)
            for (int i = nr - 1; i < capacityOrder - 1; i++) {
                articles[i] = articles[i + 1];
            }
        articles[nrArticles - 1] = null;
        --nrArticles;
    }
}

