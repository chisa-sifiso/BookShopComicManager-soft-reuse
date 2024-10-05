package za.zc.tut.bookshop;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import za.ac.tut.comicnovel.ComicNovel;

public class BookShop {

    public static String globalDetails(ArrayList<ComicNovel> novels) {
        String str = "";

        System.out.println("The list of comic novels with its search codes:");
        for (int i = 0; i < novels.size(); i++) {
            str += novels.get(i).getTitle() + " => " + novels.get(i).getCode() + "\n";

        }
        return str;
    }

    public static boolean isFirstEdition(ArrayList<ComicNovel> novels, String userCode) {
        boolean valid = false;

        for (int i = 0; i < novels.size(); i++) {

            if (novels.get(i).getCode().substring(2).equals(userCode)) {
                  //  System.out.println(novels.get(i).getCode().substring(2));
                valid = true;
            }

        }

        return valid;
    }

    public static void main(String[] args) {
        String[] bookInfo = {"The Stupidest Angel#2#CM002",
            "Vile Bodies#8#EW008",
            "Cold Comfort Farm#1#SG001",
            "Lightning Rods#2#HDW002",
            "A Complicated Kindness#1#MT001",
            "Auntie Mame#9#PD009",
            "Catch-22#5#JH005",
            "The Color of Magic#1#TP001",
            "Lucky Jim#3#KA003"};

        ArrayList<ComicNovel> books = new ArrayList<>();

        for (int i = 0; i < bookInfo.length; i++) {
            String[] splits = bookInfo[i].split("#");
            ComicNovel cn = new ComicNovel(splits[0], Integer.parseInt(splits[1]), splits[2]);

            books.add(cn);
        }
        System.out.println(globalDetails(books));
        
        String userCode=" ";
      
   
        String input=JOptionPane.showInputDialog("Enter the code of a comic novel:");
         boolean Bcode=isFirstEdition( books,  input);
       if(Bcode){
           System.out.println("The comic novel with global code "+input+" is a first edition and is a collectors item");
       }else{
                      System.out.println("The comic novel with global code "+input+" is NOT a first edition and is not a collectors item");

       }
    }

}
