public class HitungWaktu{
    private long startTime;
    private long endTime;
    private long runTime;
    public void startTime() {
        this.startTime = System.nanoTime();
        // System.out.println("startTime : "+this.startTime);
    }
    public void endTime() {
        this.endTime = System.nanoTime();
        this.runTime = System.nanoTime() - this.startTime;
        // System.out.println("endTime   : " + this.endTime);
    }
    public void runTime() {
        System.out.println("runTime   : " + this.runTime);
    }
}