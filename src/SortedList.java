import java.io.IOException;

public class SortedList {
    private Link first; // ref to first list item // ------------------------------------------------------------

    public void SortedList()          // constructor
    { first = null; } // ------------------------------------------------------------

    public void insert(Link theLink)  // insert link, in order
    {
        String key = theLink.getKey();
        Link previous = null;          // start at first
        Link current = first; // until end of list,
        while (current != null && key.compareTo(current.getKey()) >= 0) {
            previous = current;
            current = current.next;
        }
        if (previous == null)
            first = theLink;            //    first --> new link
        else {                         // not at beginning,
            previous.next = theLink;    //    prev --> new link
            theLink.next = current;        // new link -->
        }  // end insert() //
    }
        // ------------------------------------------------------------
        public void delete(String key){                              // (assumes non-empty list)
        Link previous = null;          // start at first
        Link current = first; // until end of list,
        while (current != null && key.compareTo(current.getKey()) >= 0) {
            previous = current;
            current = current.next;
        }
        if (previous == null)             //   if beginning of list
            first = first.next;         //      delete first link
         else
        previous.next = current.next; //    delete current link }  // end delete()
    }

    public Link find(String key){
        Link current = first;          // start at first // until end of list,
        while(current != null && key.compareTo(current.getKey()) >= 0) {                           // or key too small,
            if(current.getKey().equals(key) )    // is this the link?
                return current;          // found it, return link
            current = current.next;     // go to next item
             } return null;                   // didn’t find it
        }  // end find() // ------------------------------------------------------------

    public void displayList() throws IOException {
       // System.out.print("List (first-->last) }: ");
        Link current = first;       // start at beginning of list
        while(current != null)      // until end of list,
        { current.displayLink();   // print data
          current = current.next;  // move to next link
          } System.out.println("");
    }
}