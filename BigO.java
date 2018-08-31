class BigO{
    public static void main(String[] args) {
        // Hitung kecepatan matrix
        for (int i = 1000; i <= 10000; i += 1000) {
            System.out.println("\nmatrix " + i + "x" + i);
            MyMatrix mA = new MyMatrix(i, i);
            HitungWaktu.startTime();
            mA.randomMatrix();
            HitungWaktu.endTime();
            HitungWaktu.runTime();
        }
    }
}