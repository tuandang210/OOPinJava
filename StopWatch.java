public class StopWatch {
    double startTime;
    double endTime;

    StopWatch(){
    }

    void startTime(){
        this.startTime=System.currentTimeMillis();
    }
    void endTime(){
        this.endTime=System.currentTimeMillis();
    }

    double getElapsedTime() {
        return endTime-startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        stopWatch.startTime();

        for (int i=0;i<10000;i++){
            for (int j=0; j<10000;j++){
                System.out.println(i);
            }
        }

        stopWatch.endTime();
        System.out.println(stopWatch.getElapsedTime());
    }
}
