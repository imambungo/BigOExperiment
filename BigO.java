class BigO{
    public static void main(String[] args) {
        HitungWaktu a = new HitungWaktu();

        // Hitung kecepatan matrix
        int sekianKali = 7;
        int barisKolom = 1000;
        for (int i = 0; i < sekianKali; i++) {
            System.out.println("\nmatrix " + barisKolom + "x" + barisKolom);
            MyMatrix mA = new MyMatrix(barisKolom, barisKolom);
            a.startTime();
            mA.randomMatrix();
            a.endTime();
            a.runTime();
            barisKolom += 1000;
        }
    }
}