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

        // ------------------------------------------------

        // Bandingkan kecepatan fungsi rekursif dan non-rekursif
        MyLinkedList a = new MyLinkedList();
        MyLinkedList b = new MyLinkedList();

        for (int i = 1000; i <= 10000; i += 1000) {
            System.out.println("\n-----------------------\n");
            a.collapse();
            b.collapse();

            System.out.println("add rekursif " + i + "x");
            HitungWaktu.startTime();
            for (int j = 0; j < i; j++) {
                a.add(j);
            }
            HitungWaktu.endTime();
            HitungWaktu.runTime();

            System.out.println("\nadd non-rekursif " + i + "x");
            HitungWaktu.startTime();
            for (int j = 0; j < i; j++) {
                b.add2(j);
            }
            HitungWaktu.endTime();
            HitungWaktu.runTime();
        }
    }
}