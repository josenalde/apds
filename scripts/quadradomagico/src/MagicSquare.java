//by Josenalde Oliveira@2024
//OBI Magic Square
import java.util.Scanner;
import java.util.Arrays;

public class MagicSquare {
    private int dim;
    private int [][] Q;
    private int magicNumber;
        
    public MagicSquare() {

    }

    public MagicSquare(int dim) {
        this.dim = dim;
        this.Q = new int[dim][dim];
        this.magicNumber = 0;
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }

    public int getMagicNumber() {
        return magicNumber;
    }

    private void setMagicNumber(int magicNumber) {
        this.magicNumber = magicNumber;
    }

    public int[][] getQ() {
        return Q;
    }

    public void setQ(int[][] q) {
        this.Q = q;
    }

    public void getNumbers() {
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                this.Q[i][j] = cin.nextInt();
            }
        }
        cin.close();
    }

    public void showSquare() {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(Q[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int checkRows() {
        int [] rowSums = new int[dim];
        int i = 0, j, sumActualRow;
        while (i < dim) {
            j = 0; // initial col (0)
            sumActualRow = 0;
            while (j < dim) {
                sumActualRow += Q[i][j];
                j++; // increment col
            }
            rowSums[i] = sumActualRow;
            i++; // increment line
        }
        System.out.println(Arrays.toString(rowSums)); //just for debugging
        int first = rowSums[0];
        for (i = 1; i < dim; i++) {
            if (rowSums[i] != first) break;
        }
        return first;
    }

    public int checkCols() {
        int [] colSums = new int[dim];
        int i = 0, j, sumActualCol;
        while (i < dim) {
            j = 0; // initial row (0)
            sumActualCol = 0;
            while (j < dim) {
                sumActualCol += Q[j][i];
                j++; // increment row
            }
            colSums[i] = sumActualCol;
            i++; // increment col
        }
        System.out.println(Arrays.toString(colSums)); //just for debugging
        int first = colSums[0];
        for (i = 1; i < dim; i++) {
            if (colSums[i] != first) break;
        }
        return first;
    }

    public int checkDiagonals() {
        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if (i==j) sumMainDiagonal += Q[i][j]; // test if an element belongs to main diagonal
                if (i + j == dim-1) sumSecondaryDiagonal += Q[i][j];
            }
        }
        System.out.println("sumMainDiagonal: " + sumMainDiagonal + ", sumSecondaryDiagonal: " + sumSecondaryDiagonal);
        if (sumMainDiagonal == sumSecondaryDiagonal) {
            return sumMainDiagonal;
        } else return 0;
    }

    public int isMagicSquare() {
        int c = checkCols();
        int r = checkRows();
        int d = checkDiagonals();

        if (c == r) {
            if (r == d) {
                setMagicNumber(checkRows());
                return getMagicNumber();
            } else return 0;
        } else return 0;
    }
}
