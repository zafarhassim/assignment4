import java.io.IOException;

class HashTable {
    private static int arraySize;
    public SortedList[] hashArray;   // array of lists
    //public int arraySize; // ------------------------------------------------------------

    public HashTable(int size)        // constructor
    {
        arraySize = size;
        hashArray = new SortedList[arraySize];  // create array
        for (int j = 0; j < arraySize; j++)          // fill array
            hashArray[j] = new SortedList();     // with lists
    }

    public void displayTable() throws IOException {
        for (int j = 0; j < arraySize; j++) // for each cell,
        {
            System.out.print(j + ". "); // display cell number
            hashArray[j].displayList(); // display list
        }
    }


        public static int hashFunc(String key) {
            int hashVal = 0;
            for(int j=0; j<key.length(); j++)    // left to right
            { int letter = key.charAt(j) - 96;  // get char code
             hashVal = (hashVal * 27 + letter) % arraySize; // mod
            } return hashVal;
    }

    public void insert(String genre, String movie)  // insert a link
    {   Link theLink = new Link(genre, movie);
        String key = theLink.getKey();
        int hashVal = hashFunc(key);   // hash the key
        hashArray[hashVal].insert(theLink); // insert at hashVal
    }

    public void delete(String key)       // delete a link
    {
        int hashVal = hashFunc(key);   // hash the key
        hashArray[hashVal].delete(key); // delete link
    }

    public void find(String key)         // find link
    {
        int hashVal = hashFunc(key);   // hash the key
        Link theLink = hashArray[hashVal].find(key);
        System.out.println(theLink.getValue());
        // return link
    }

}
