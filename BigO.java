class BigO{
    public static void main(String[] args) {
        // Hitung kecepatan matrix
        int sekianKali = 7;
        int barisKolom = 1000;
        for (int i = 0; i < sekianKali; i++) {
            System.out.println("\nmatrix " + barisKolom + "x" + barisKolom);
            MyMatrix mA = new MyMatrix(barisKolom, barisKolom);
            HitungWaktu.startTime();
            mA.randomMatrix();
            HitungWaktu.endTime();
            HitungWaktu.runTime();
            barisKolom += 1000;
        }
    }
}