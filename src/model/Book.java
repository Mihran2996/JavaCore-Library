package model;

public class Book {
    private String title;
    private String outerName;
    private int price;
    private int count;

    public Book(String title, String outerName, int price, int count) {
        this.title = title;
        this.outerName = outerName;
        this.price = price;
        this.count = count;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public String getOuterName() {
        return outerName;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setOuterName(String outerName) {
        this.outerName = outerName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//ete erku object gtnvumen nuyn darakum veradardzra true;
        if (o == null || getClass() != o.getClass()) return false;//ete unene tarber classner,gtnvumen tarber peqijnerum veradardzra false
//ete ekac object@ chi mtnum verevi erku paymani apa ancnume nerqevi payman caste anum dardznum book tipi ev sksum stugel
        Book book = (Book) o;

        if (price != book.price) return false;
        if (count != book.count) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return outerName != null ? outerName.equals(book.outerName) : book.outerName == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (outerName != null ? outerName.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + count;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", outerName='" + outerName + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}

