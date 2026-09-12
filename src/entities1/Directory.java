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
public class Directory extends FsItem {

    private FsItem[] children;
    private int count;

    public Directory(String name) {
        super(name);
        children = new FsItem[4];
        count = 0;
    }

    public void add(FsItem item) {

        if (count == children.length) {
            FsItem[] tmp = new FsItem[children.length * 2];
            for (int i = 0; i < children.length; i++) {
                tmp[i] = children[i];
            }
            children = tmp;
        }

        children[count] = item;
        count++;
    }

    public long getSize() {
        long total = 0;

        for (int i = 0; i < count; i++) {
            total = total + children[i].getSize();
        }

        return total;
    }

    public void list(int indent) {

        System.out.println(espaces(indent) + this);

        for (int i = 0; i < count; i++) {
            FsItem f = children[i];

            if (f instanceof Directory) {
                Directory d = (Directory) f;
                d.list(indent + 1);
            } else {
                System.out.println(espaces(indent + 1) + f);
            }
        }
    }

    private String espaces(int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + "  ";
        }
        return s;
    }
}
