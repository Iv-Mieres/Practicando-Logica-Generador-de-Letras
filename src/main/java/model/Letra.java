package model;

public class Letra implements ILetra {

    private char letra[][];
    private char letraE[][];

    public Letra() {
    }

    public Letra(char[][] letra, char[][] letraE) {
        this.letra = letra;
        this.letraE = letraE;
    }

    public char[][] getLetra() {
        return letra;
    }

    public void setLetra(char[][] letra) {
        this.letra = letra;
    }

    public char[][] getLetraE() {
        return letraE;
    }

    public void setLetraE(char[][] letraE) {
        this.letraE = letraE;
    }

    @Override
    public void crearT() throws InterruptedException {
        for (int fila = 0; fila < letra.length; fila++) {
            for (int columna = 0; columna < letra[0].length; columna++) {
                if (fila == 0) letra[fila][columna] = '*';
                else if (fila > 0 && columna == 3) letra[fila][columna] = '*';
                else letra[fila][columna] = ' ';
                System.out.print(letra[fila][columna]);
                Thread.sleep(100);
            }
            System.out.println();
        }
    }

    @Override
    public void crearO() throws InterruptedException {
        for (int fila = 0; fila < letra.length; fila++) {
            for (int columna = 0; columna < letra[0].length; columna++) {
                if (fila == 0 || fila == 3) letra[fila][columna] = '*';
                else if (fila >= 0 && columna == 0 || fila >= 0 && columna == 6) letra[fila][columna] = '*';
                else letra[fila][columna] = ' ';
                System.out.print(letra[fila][columna]);
                Thread.sleep(100);
            }
            System.out.println();
        }
    }

    @Override
    public void crearD() throws InterruptedException {

        for (int fila = 0; fila < letra.length; fila++) {
            for (int columna = 0; columna < letra[0].length; columna++) {
                if (fila == 0 || fila == 3) letra[fila][columna] = '*';
                else if (fila >= 0 && columna == 2 || fila >= 0 && columna == 6) letra[fila][columna] = '*';
                else letra[fila][columna] = ' ';
                System.out.print(letra[fila][columna]);
                Thread.sleep(100);
            }
            System.out.println();
        }
    }

    @Override
    public void crearC() throws InterruptedException {
        for (int fila = 0; fila < letra.length; fila++) {
            for (int columna = 0; columna < letra[0].length; columna++) {
                if (fila == 0 || fila == 3) letra[fila][columna] = '*';
                else if (fila >= 0 && columna == 0) letra[fila][columna] = '*';
                else letra[fila][columna] = ' ';
                System.out.print(letra[fila][columna]);
                Thread.sleep(100);
            }
            System.out.println();
        }
    }

    @Override
    public void crearE() throws InterruptedException {
        for (int fila = 0; fila < letraE.length; fila++) {
            for (int columna = 0; columna < letraE[0].length; columna++) {
                if (fila == 0 || fila == 4) letraE[fila][columna] = '*';
                else if (fila >= 0 && columna == 0 || fila == 2 && columna < 4) letraE[fila][columna] = '*';
                else letraE[fila][columna] = ' ';
                System.out.print(letraE[fila][columna]);
                Thread.sleep(100);
            }
            System.out.println();
        }
    }
}
