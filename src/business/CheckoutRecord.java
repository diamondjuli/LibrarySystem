package business;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
    private LibraryMember libraryMember;
    private List<CheckoutEntry> entries = new ArrayList<CheckoutEntry>();

    void setLibraryMember(LibraryMember libraryMember) {
        this.libraryMember = libraryMember;
    }

    public void add(BookCopy book) {
        this.entries.add(new CheckoutEntry(book));
    }

	@Override
	public String toString() {
		return "CheckoutRecord [libraryMember=" + libraryMember + ", entries=" + entries + "]";
	}
    
    
}
