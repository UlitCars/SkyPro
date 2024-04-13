import java.util.Random;

public class App {

    public static void main(String[] args) {
        //Заполняем список авторов
        Author author1 = new Author("Пономаренко", "Виктор", "Викторович");
        Author author2 = new Author("Цендровский", "Олег", "Юрьевич");
        //Заполняем список книг
        Book book1 = new Book("«Методика 7 радикалов»", author1, 2023);
        Book book2 = new Book("«Действие вместо реакции»", author2, 2023);
        //Выводим результат
        System.out.println("Название первой книги - " + book1.getNameBook() + " Автор - " + author1.getFirstName()
                + " " + author1.getMidName() + " " + author1.getLostName() + " Год издания :" + book1.getYears());
        System.out.println("Название второй книги - " + book2.getNameBook() + " Автор - " + author2.getFirstName() + " " +
                author2.getMidName() + " " + author2.getLostName() + " Год издания :" + book2.getYears());
        //Меняем год издания первой книги и проверяем
        book1.setYears(2024);
        System.out.println("book1.getYears() = " + book1.getYears());
        //Проверяем остальные методы "set"
        book1.setNameBook("Методика");
        System.out.println("book1.getNameBook() = " + book1.getNameBook());
        author2.setLostName("Валерьевич");
        System.out.println("author2.getLostName() = " + author2.getLostName());

        System.out.println("book2.toStringBook() = " + book2.toStringBook());

    }
}
