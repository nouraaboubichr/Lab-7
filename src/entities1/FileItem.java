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

public class FileItem extends FsItem {

    private long size;

    public FileItem(String name, long size) {
        super(name);
        this.size = size;
    }

    public long getSize() {
        return size;
    }
}
