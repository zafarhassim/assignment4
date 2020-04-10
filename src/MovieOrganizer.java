import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieOrganizer {
    public static void main(String[] args) throws IOException {
        String movies = "data/movies.csv";
        String homework = "data/homework.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(movies));

        File file = new File(homework);
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        String line = "";
        String cvsSplitBy = ",";
        String[] singer;
        final int size = 101; ///This is just an arbitrary size
        String[] original = new String[size];
        String[] original2 = new String[size];
        String[] name = new String[size - 1];
        String[] genre = new String[size - 1];
        int j = 0;

        while ((line = bufferedReader.readLine()) != null) {
            singer = line.split(cvsSplitBy);
            original[j] = singer[1].toLowerCase().trim();
            original2[j] = singer[2].toLowerCase();
            // System.out.println(original[j]);
            j++;
            if (j == size)
                break;
        }

        //adjust array to get names only
        for (int i = 0; i <= name.length - 1; i++) {
            name[i] = original[i + 1];
            // System.out.println(name[i]);
        }

        //adjust array to get genre only
        for (int i = 0; i <= name.length - 1; i++) {
            genre[i] = original2[i + 1];
            //   System.out.println(genre[i]);
        }

        //declare integers of for occurrence
        int actionInt = 0, actionInt76 = 0, actionInt94 = 0, actionInt95 = 0, actionInt96 = 0;
        int animationInt = 0, animationInt76 = 0, animationInt94 = 0, animationInt95 = 0, animationInt96 = 0;
        int childrenInt = 0, childrenInt76 = 0, childrenInt94 = 0, childrenInt95 = 0, childrenInt96 = 0;
        int comedyInt = 0, comedyInt76 = 0, comedyInt94 = 0, comedyInt95 = 0, comedyInt96 = 0;
        int crimeInt = 0, crimeInt76 = 0, crimeInt94 = 0, crimeInt95 = 0, crimeInt96 = 0;
        int documentaryInt = 0, documentaryInt76 = 0, documentaryInt94 = 0, documentaryInt95 = 0, documentaryInt96 = 0;
        int dramaInt = 0, dramaInt76 = 0, dramaInt94 = 0, dramaInt95 = 0, dramaInt96 = 0;
        int fantasyInt = 0, fantasyInt76 = 0, fantasyInt94 = 0, fantasyInt95 = 0, fantasyInt96 = 0;
        int horrorInt = 0, horrorInt76 = 0, horrorInt94 = 0, horrorInt95 = 0, horrorInt96 =0;
        int musicalInt = 0, musicalInt76 = 0, musicalInt94 = 0, musicalInt95 = 0, musicalInt96 =0;
        int mysteryInt = 0, mysteryInt76 = 0, mysteryInt94 = 0, mysteryInt95 = 0, mysteryInt96 = 0;
        int romanceInt = 0, romanceInt76 = 0, romanceInt94 = 0, romanceInt95 = 0, romanceInt96 = 0;
        int scifiInt = 0, scifiInt76 = 0, scifiInt94 = 0, scifiInt95 = 0, scifiInt96 = 0;
        int thrillerInt = 0, thrillerInt76 = 0, thrillerInt94 = 0, thrillerInt95 = 0, thrillerInt96 = 0;
        int warInt = 0, warInt76 = 0, warInt94 = 0, warInt95 = 0, warInt96 = 0;
        
        //count amount of movies in genre and store into hashmap
        HashTable hashTable = new HashTable(name.length);
        for (int x = 0; x <= name.length - 1; x++) {
            String string = genre[x];
            String[] gen = string.split("\\|");
            for (String a : gen) {
                //if (a.equals("adventure")) {
                  //  hashTable.insert("adventure: ", name[x]);
                //}
                if (a.equals("action")) {
                    hashTable.insert("action: ", name[x]);
                    actionInt++;
                }
                if (a.equals("animation")) {
                    hashTable.insert("animation: ", name[x]);
                    animationInt++;
                }
                if(a.equals("children")){
                    hashTable.insert("children: ", name[x]);
                    childrenInt++;
                }
                if (a.equals("comedy")) {
                    hashTable.insert("comedy: ", name[x]);
                    comedyInt++;
                }
                if (a.equals("crime")) {
                    hashTable.insert("crime: ", name[x]);
                    crimeInt++;
                }
                if (a.equals("documentary")) {
                    hashTable.insert("documentary: ", name[x]);
                    documentaryInt++;
                }
                if (a.equals("drama")) {
                    hashTable.insert("drama: ", name[x]);
                    dramaInt++;
                }
                if (a.equals("fantasy")) {
                    hashTable.insert("fantasy: ", name[x]);
                    fantasyInt++;
                }
                if (a.equals("film-noir")) {
                    hashTable.insert("film-noir: ", name[x]);
                    //there are no film-noir moives
                }
                if (a.equals("horror")) {
                    hashTable.insert("horror: ", name[x]);
                    horrorInt++;
                }
                if (a.equals("musical")) {
                    hashTable.insert("musical: ", name[x]);
                    musicalInt++;
                }
                if (a.equals("mystery")) {
                    hashTable.insert("mystery: ", name[x]);
                    mysteryInt++;
                }
                if (a.equals("romance")) {
                    hashTable.insert("romance: ", name[x]);
                    romanceInt++;
                }
                if (a.equals("sci-fi")) {
                    hashTable.insert("sci-fi: ", name[x]);
                    scifiInt++;
                }
                if (a.equals("thriller")) {
                    hashTable.insert("thriller: ", name[x]);
                    thrillerInt++;
                }
                if (a.equals("war")) {
                    hashTable.insert("war: ", name[x]);
                    warInt++;
                }
                if (a.equals("western")) {
                    hashTable.insert("western: ", name[x]);
                }
            }
        }

        //display hashmap
        hashTable.displayTable();

       //display occurence
        System.out.println();
        printWriter.println();
        printWriter.println("Since there were 100 movies taken into account, the average is equal to amount of times it occurred ");
        System.out.println("number of action movies: " + actionInt +" average action movies:" + actionInt+ "percent");
        printWriter.println("number of action movies: " + actionInt +" average action movies:" + actionInt+ "percent");
        System.out.println("number of animation movies: " + animationInt +" average animation movies:" + animationInt+ "percent");
        printWriter.println("number of animation movies: " + animationInt +" average animation movies:" + animationInt+ "percent");
        System.out.println("number of comedy movies: " + comedyInt +" average comedy movies:" + comedyInt+ "percent");
        printWriter.println("number of comedy movies: " + comedyInt +" average comedy movies:" + comedyInt+ "percent");
        System.out.println("number of crime movies: " + crimeInt +" average crime movies:" + crimeInt+ "percent");
        printWriter.println("number of crime movies: " + crimeInt +" average crime movies:" + crimeInt+ "percent");
        System.out.println("number of documentary movies: " + documentaryInt +" average documentary movies:" + documentaryInt+ "percent");
        printWriter.println("number of documentary movies: " + documentaryInt +" average documentary movies:" + documentaryInt+ "percent");
        System.out.println("number of drama movies: " + dramaInt +" average drama movies:" + dramaInt+ "percent");
        printWriter.println("number of drama movies: " + dramaInt +" average drama movies:" + dramaInt+ "percent");
        System.out.println("number of fantasy movies: " + fantasyInt +" average fantasy movies:" + fantasyInt+ "percent");
        printWriter.println("number of fantasy movies: " + fantasyInt +" average fantasy movies:" + fantasyInt+ "percent");
        System.out.println("number of horror movies: " + horrorInt +" average horror movies:" + horrorInt+ "percent");
        printWriter.println("number of horror movies: " + horrorInt +" average horror movies:" + horrorInt+ "percent");
        System.out.println("number of musical movies: " + musicalInt +" average musical movies:" + musicalInt+ "percent");
        printWriter.println("number of musical movies: " + musicalInt +" average musical movies:" + musicalInt+ "percent");
        System.out.println("number of mystery movies: " + mysteryInt +" average mystery movies:" + mysteryInt+ "percent");
        printWriter.println("number of mystery movies: " + mysteryInt +" average mystery movies:" + mysteryInt+ "percent");
        System.out.println("number of romance movies: " + romanceInt +" average romance movies:" + romanceInt+ "percent");
        printWriter.println("number of romance movies: " + romanceInt +" average romance movies:" + romanceInt+ "percent");
        System.out.println("number of sci-fi movies: " + scifiInt +" average sci-fi movies:" + scifiInt+ "percent");
        printWriter.println("number of sci-fi movies: " + scifiInt +" average sci-fi movies:" + scifiInt+ "percent");
        System.out.println("number of thriller movies: " + thrillerInt +" average thriller movies:" + thrillerInt+ "percent");
        printWriter.println("number of thriller movies: " + thrillerInt +" average thriller movies:" + thrillerInt+ "percent");
        System.out.println("number of war movies: " + warInt +" average war movies:" + warInt+ "percent");
        printWriter.println("number of war movies: " + warInt +" average war movies:" + warInt+ "percent");

        //get year for each movie
        String[] noTitle = new String[name.length];
        for (int r = 0; r <= name.length - 1; r++) {
            noTitle[r] = name[r].replaceAll("[a-z]", "");
            // System.out.println(noTitle[r]);
        }
        //Remove parentheses
        for (int y = 0; y <= name.length - 1; y++) {
            noTitle[y] = noTitle[y].replace(")", "");
            //System.out.println(noTitle[y]);
        }
        for (int h = 0; h <= name.length - 1; h++) {
            noTitle[h] = noTitle[h].replace("(", "").trim();
           // System.out.println(noTitle[h]);
        }

       // noTitle = Arrays.stream(noTitle).distinct().toArray(String[]::new);

        //System.out.println("Array after removing duplicates: "
          //      + Arrays.toString(noTitle));

        //find which cells contain each year
        int[]year1976 = new int[100];
        for(int m = 0; m <= name.length-1;m++){
            if(noTitle[m].equals("1976")){
                year1976[m] = m;
            }
        }
        //System.out.println(Arrays.toString(year1976));
        int[]year1994 = new int[100];
        for(int m = 0; m <= name.length-1;m++){
            if(noTitle[m].equals("1994")){
                year1994[m] = m;
            }
        }
        //System.out.println(Arrays.toString(year1994));
        int[]year1996 = new int[100];
        for(int m = 0; m <= name.length-1;m++){
            if(noTitle[m].equals("1996")){
                year1996[m] = m;
            }
        }
        //System.out.println(Arrays.toString(year1996));
        int[]year1995 = new int[100];
        for(int m = 0; m <= name.length-1;m++){
            if(noTitle[m].equals("1995")){
                year1995[m] = m;
            }
        }
        //System.out.println(Arrays.toString(year1995));

        //display occurence of genre per year
        int[] year19762 = {98};
        for (int z = 0; z <= year19762.length -1; z++){
            String string = genre[year19762[z]];
            String[] gen = string.split("\\|");
            for (String a : gen) {
                //if (a.equals("adventure")) {
                //  hashTable.insert("adventure: ", name[x]);
                //}
                if (a.equals("action")) {
                    actionInt76++;
                }
                if (a.equals("animation")) {
                    animationInt76++;
                }
                if(a.equals("children")){
                    childrenInt76++;
                }
                if (a.equals("comedy")) {
                    comedyInt76++;
                }
                if (a.equals("crime")) {
                    crimeInt76++;
                }
                if (a.equals("documentary")) {
                    documentaryInt76++;
                }
                if (a.equals("drama")) {
                    dramaInt76++;
                }
                if (a.equals("fantasy")) {
                    fantasyInt76++;
                }
                if (a.equals("film-noir")) {
                    //there are zero film-noir films
                }
                if (a.equals("horror")) {
                    horrorInt76++;
                }
                if (a.equals("musical")) {
                    musicalInt76++;
                }
                if (a.equals("mystery")) {
                    mysteryInt76++;
                }
                if (a.equals("romance")) {
                    romanceInt76++;
                }
                if (a.equals("sci-fi")) {
                    scifiInt76++;
                }
                if (a.equals("thriller")) {
                    thrillerInt76++;
                }
                if (a.equals("war")) {
                    warInt76++;
                }
                if (a.equals("western")) {
                    //there are no westerns
                }
            }
        }
        System.out.println("1976 movies");
        printWriter.println();
        printWriter.println("1976 movies");
        System.out.println("crime: "+ crimeInt76 +" drama: " + dramaInt76 + " thriller: " + thrillerInt76 );
        printWriter.println("crime: "+ crimeInt76 +" drama: " + dramaInt76 + " thriller: " + thrillerInt76 );

        int[] year19942 = {48, 52, 94};
        for (int z = 0; z <= year19942.length -1; z++){
            String string = genre[year19942[z]];
            String[] gen = string.split("\\|");
            for (String a : gen) {
                //if (a.equals("adventure")) {
                //  hashTable.insert("adventure: ", name[x]);
                //}
                if (a.equals("action")) {
                    actionInt94++;
                }
                if (a.equals("animation")) {
                    animationInt94++;
                }
                if(a.equals("children")){
                    childrenInt94++;
                }
                if (a.equals("comedy")) {
                    comedyInt94++;
                }
                if (a.equals("crime")) {
                    crimeInt94++;
                }
                if (a.equals("documentary")) {
                    documentaryInt94++;
                }
                if (a.equals("drama")) {
                    dramaInt94++;
                }
                if (a.equals("fantasy")) {
                    fantasyInt94++;
                }
                if (a.equals("film-noir")) {
                    //there are zero film-noir films
                }
                if (a.equals("horror")) {
                    horrorInt94++;
                }
                if (a.equals("musical")) {
                    musicalInt94++;
                }
                if (a.equals("mystery")) {
                    mysteryInt94++;
                }
                if (a.equals("romance")) {
                    romanceInt94++;
                }
                if (a.equals("sci-fi")) {
                    scifiInt94++;
                }
                if (a.equals("thriller")) {
                    thrillerInt94++;
                }
                if (a.equals("war")) {
                    warInt94++;
                }
                if (a.equals("western")) {
                    //there are no westerns
                }
            }
        }

        System.out.println("1994 movies");
        printWriter.println();
        printWriter.println("1994 movies");
        System.out.println("action: " + actionInt94 +" animation: " + animationInt94 + " comedy: " + comedyInt94 + " crime: " + crimeInt94 + " documentary: "+ documentaryInt94 + " drama: " + dramaInt94 + " fantasy: " + fantasyInt94 + " horror: " + horrorInt94 + " musical: " + musicalInt94 + " mystery: " + mysteryInt94 + " romance: " + romanceInt94 + " sci-fi:  " + scifiInt94 + " thriller: " + thrillerInt94 + " war: " + warInt94);
        printWriter.println("action: " + actionInt94 +" animation: " + animationInt94 + " comedy: " + comedyInt94 + " crime: " + crimeInt94 + " documentary: "+ documentaryInt94 + " drama: " + dramaInt94 + " fantasy: " + fantasyInt94 + " horror: " + horrorInt94 + " musical: " + musicalInt94 + " mystery: " + mysteryInt94 + " romance: " + romanceInt94 + " sci-fi:  " + scifiInt94 + " thriller: " + thrillerInt94 + " war: " + warInt94);

        int[] year19962 = {54,56, 57, 58, 59, 62, 66, 67, 71, 77, 78, 79, 81, 83, 84, 88, 89, 90, 91, 92, 95, 96};
        for (int z = 0; z <= year19962.length -1; z++){
            String string = genre[year19962[z]];
            String[] gen = string.split("\\|");
            for (String a : gen) {
                //if (a.equals("adventure")) {
                //  hashTable.insert("adventure: ", name[x]);
                //}
                if (a.equals("action")) {
                    actionInt96++;
                }
                if (a.equals("animation")) {
                    animationInt96++;
                }
                if(a.equals("children")){
                    childrenInt96++;
                }
                if (a.equals("comedy")) {
                    comedyInt96++;
                }
                if (a.equals("crime")) {
                    crimeInt96++;
                }
                if (a.equals("documentary")) {
                    documentaryInt96++;
                }
                if (a.equals("drama")) {
                    dramaInt96++;
                }
                if (a.equals("fantasy")) {
                    fantasyInt96++;
                }
                if (a.equals("film-noir")) {
                    //there are zero film-noir films
                }
                if (a.equals("horror")) {
                    horrorInt96++;
                }
                if (a.equals("musical")) {
                    musicalInt96++;
                }
                if (a.equals("mystery")) {
                    mysteryInt96++;
                }
                if (a.equals("romance")) {
                    romanceInt96++;
                }
                if (a.equals("sci-fi")) {
                    scifiInt96++;
                }
                if (a.equals("thriller")) {
                    thrillerInt96++;
                }
                if (a.equals("war")) {
                    warInt96++;
                }
                if (a.equals("western")) {
                    //there are no westerns
                }
            }
        }

        System.out.println("1996 movies");
        printWriter.println();
        printWriter.println("1996 movies");
        System.out.println("action: " + actionInt96 +" animation: " + animationInt96 + " comedy: " + comedyInt96 + " crime: " + crimeInt96 + " documentary: "+ documentaryInt96 + " drama: " + dramaInt94 + " fantasy: " + fantasyInt96 + " horror: " + horrorInt96 + " musical: " + musicalInt96 + " mystery: "+ musicalInt96 + " romance: " + romanceInt96 + " sci-fi:  " + scifiInt96 + " thriller: " + thrillerInt96 + " war: " + warInt96);
        printWriter.println("action: " + actionInt96 +" animation: " + animationInt96 + " comedy: " + comedyInt96 + " crime: " + crimeInt96 + " documentary: "+ documentaryInt96 + " drama: " + dramaInt94 + " fantasy: " + fantasyInt96 + " horror: " + horrorInt96 + " musical: " + musicalInt96 + " mystery: "+ musicalInt96 + " romance: " + romanceInt96 + " sci-fi:  " + scifiInt96 + " thriller: " + thrillerInt96 + " war: " + warInt96);

        int[]year19952 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 49, 50, 51, 53, 55, 60, 61, 63, 64, 65, 68, 69, 70, 72, 73, 74, 75, 76, 80, 82, 85, 86, 87, 93, 97, 99};
        for (int z = 0; z <= year19952.length -1; z++){
            String string = genre[year19952[z]];
            String[] gen = string.split("\\|");
            for (String a : gen) {
                //if (a.equals("adventure")) {
                //  hashTable.insert("adventure: ", name[x]);
                //}
                if (a.equals("action")) {
                    actionInt95++;
                }
                if (a.equals("animation")) {
                    animationInt95++;
                }
                if(a.equals("children")){
                    childrenInt95++;
                }
                if (a.equals("comedy")) {
                    comedyInt95++;
                }
                if (a.equals("crime")) {
                    crimeInt95++;
                }
                if (a.equals("documentary")) {
                    documentaryInt95++;
                }
                if (a.equals("drama")) {
                    dramaInt95++;
                }
                if (a.equals("fantasy")) {
                    fantasyInt95++;
                }
                if (a.equals("film-noir")) {
                    //there are zero film-noir films
                }
                if (a.equals("horror")) {
                    horrorInt95++;
                }
                if (a.equals("musical")) {
                    musicalInt95++;
                }
                if (a.equals("mystery")) {
                    mysteryInt95++;
                }
                if (a.equals("romance")) {
                    romanceInt95++;
                }
                if (a.equals("sci-fi")) {
                    scifiInt95++;
                }
                if (a.equals("thriller")) {
                    thrillerInt95++;
                }
                if (a.equals("war")) {
                    warInt95++;
                }
                if (a.equals("western")) {
                    //there are no westerns
                }
            }
        }

        System.out.println("1995 movies");
        printWriter.println();
        printWriter.println("1995 movies");
        System.out.println("action: " + actionInt95 +" animation: " + animationInt95 + " comedy: " + comedyInt95 + " crime: " + crimeInt95 + " documentary: "+ documentaryInt95 + " drama: " + dramaInt95 + " fantasy: " + fantasyInt95 + " horror: " + horrorInt95 + " musical: " + musicalInt95 + " mystery: "+ musicalInt95 + " romance: " + romanceInt95 + " sci-fi:  " + scifiInt95 + " thriller: " + thrillerInt95 + " war: " + warInt95);
        printWriter.println("action: " + actionInt95 +" animation: " + animationInt95 + " comedy: " + comedyInt95 + " crime: " + crimeInt95 + " documentary: "+ documentaryInt95 + " drama: " + dramaInt95 + " fantasy: " + fantasyInt95 + " horror: " + horrorInt95 + " musical: " + musicalInt95 + " mystery: "+ musicalInt95 + " romance: " + romanceInt95 + " sci-fi:  " + scifiInt95 + " thriller: " + thrillerInt95 + " war: " + warInt95);

        printWriter.close();
    }

    }


