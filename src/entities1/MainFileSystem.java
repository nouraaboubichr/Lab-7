/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities1;

/**
 *
 * @author hp
 */
public class MainFileSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FileSystem fs = new FileSystem();

        FileItem f1 = new FileItem("doc.txt", 1200);
        FileItem f2 = new FileItem("image.png", 450000);
        FileItem f3 = new FileItem("notes.pdf", 80000);

        Directory home = new Directory("home");
        home.add(f1);
        home.add(f2);

        Directory docs = new Directory("docs");
        docs.add(f3);
        home.add(docs);

        fs.addRoot(home);
        fs.addRoot(new FileItem("readme.md", 3000));

        fs.listAll();
        System.out.println("Taille totale : " + fs.totalSize() + " B");
    }
    
}
