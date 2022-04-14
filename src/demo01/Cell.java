package demo01;

/**
 * @author xh
 * @date 2022/4/10
 * @apiNote
 */

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.util.Objects;

/**
 * 编写小方块类
 * 属性：行、列、每个小方格的图片
 * 方法：左移一格、右移一格、下落一格
 *
 */
public class Cell {
    private int row;
    private int column;
    private  BufferedImage image;

    public Cell() {
    }


    public Cell(int row, int column, BufferedImage image) {
        this.row = row;
        this.column = column;
        this.image = image;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cell cell = (Cell) o;
        return row == cell.row && column == cell.column && Objects.equals(image, cell.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column, image);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", column=" + column +
                ", image=" + image +
                '}';
    }

    //编写左移一格方法
    public void left(){
        column--;
    }

    //编写向右移方法
    public void right(){
        column++;
    }

    //编写下落一格方法
    public void down(){
        row++;
    }
































}
