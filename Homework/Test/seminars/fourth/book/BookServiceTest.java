package seminars.fourth.book;


import org.junit.jupiter.api.Test;
import java.util.List;
import static org.mockito.Mockito.*;

class BookServiceTest {
    BookRepository bookRepositoryMock = mock(BookRepository.class);
    BookService bookService = new BookService(bookRepositoryMock);
    @Test
    void testFindById() {
        String id = "3";
        when(bookService.findBookById(id)).thenReturn(new Book("3", "The Green Mile", "Stephen King"));
    }

    @Test
    void testFindAllBooks() {
        List<Book> allBooks = mock(List.class);
        allBooks.add(new Book("1", "title1", "author1"));
        allBooks.add(new Book("2", "title2", "author2"));
        allBooks.add(new Book("3", "title3", "author3"));
        verify(allBooks, times(3)).add(any());
        when(bookService.findAllBooks()).thenReturn(allBooks);
    }
}