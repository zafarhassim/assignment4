import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Link {
    // (could be other items)
    private String genre;
    // data item public
    private String movie;
    Link next;
    // next link in list // ------------------------------------------------------------

    public Link(String it, String str)                 // constructor
    { genre= it;
        movie = str;
    } // ------------------------------------------------------------

    public String getKey()
    { return genre; } // ------------------------------------------------------------

    public String getValue()
    { return movie; }

    public void displayLink()   throws IOException
    { String homework = "data/homework.txt";
        File f = new File(homework);
        FileWriter fw = new FileWriter(f, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(genre + " " + movie+ " ");
        System.out.print(genre + " " + movie+ " ");

        pw.close();
    }

}  // end class Link