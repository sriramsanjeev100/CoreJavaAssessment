package org.LibraryManagement.service;

import org.LibraryManagement.entity.Book;
import org.LibraryManagement.entity.Member;
import org.LibraryManagement.exception.BookNotFoundException;
import org.LibraryManagement.exception.BookUnavailableException;
import org.LibraryManagement.exception.MemberNotFoundException;

public class BorrowService
{
    private final BookService bookService = new BookService();
    private final MemberService memberService = new MemberService();

    public void borrowBook(int memberId, int bookId) throws MemberNotFoundException, BookNotFoundException, BookUnavailableException
    {
        Member member = memberService.findMemberById(memberId);
        Book book = bookService.findBookById(bookId);
        if (book.getAvailableCopies() <= 0)
        {
            throw new BookUnavailableException("Book is unavailable.");
        }

        book.setAvailableCopies(book.getAvailableCopies() - 1);
        bookService.updateBook(book);
        System.out.println(Thread.currentThread().getName() + " -> " + member.getMemberName() + " borrowed " + book.getTitle());
    }
}