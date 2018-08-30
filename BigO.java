import java.util.Random;
class BigO{
    public static void main(String[] args) {
        Random rand = new Random();
        HitungWaktu a = new HitungWaktu();
        int dimensi;

        // Hitung kecepatan matrix
        dimensi = 1000;
        System.out.println("\nmatrix " + dimensi + "x" + dimensi);
        MyMatrix mA = new MyMatrix(dimensi,dimensi);
        a.startTime();
        mA.randomMatrix();
        a.endTime();
        a.runTime();

        dimensi += 1000;
        System.out.println("\nmatrix " + dimensi + "x" + dimensi);
        MyMatrix mB = new MyMatrix(dimensi, dimensi);
        a.startTime();
        mB.randomMatrix();
        a.endTime();
        a.runTime();

        dimensi += 1000;
        System.out.println("\nmatrix " + dimensi + "x" + dimensi);
        MyMatrix mC = new MyMatrix(dimensi, dimensi);
        a.startTime();
        mC.randomMatrix();
        a.endTime();
        a.runTime();

        dimensi += 1000;
        System.out.println("\nmatrix " + dimensi + "x" + dimensi);
        MyMatrix mD = new MyMatrix(dimensi, dimensi);
        a.startTime();
        mD.randomMatrix();
        a.endTime();
        a.runTime();

        dimensi += 1000;
        System.out.println("\nmatrix " + dimensi + "x" + dimensi);
        MyMatrix mE = new MyMatrix(dimensi, dimensi);
        a.startTime();
        mE.randomMatrix();
        a.endTime();
        a.runTime();

        dimensi += 1000;
        System.out.println("\nmatrix " + dimensi + "x" + dimensi);
        MyMatrix mF = new MyMatrix(dimensi, dimensi);
        a.startTime();
        mF.randomMatrix();
        a.endTime();
        a.runTime();

        dimensi += 1000;
        System.out.println("\nmatrix " + dimensi + "x" + dimensi);
        MyMatrix mG = new MyMatrix(dimensi, dimensi);
        a.startTime();
        mG.randomMatrix();
        a.endTime();
        a.runTime();
    }
}