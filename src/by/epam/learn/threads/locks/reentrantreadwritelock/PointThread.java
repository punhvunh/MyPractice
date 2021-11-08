package by.epam.learn.threads.locks.reentrantreadwritelock;

public class PointThread extends Thread {
    private PointManager pointManager;
    private Point point;
    private boolean writeStatus;

    public PointThread(PointManager pointManager, Point point, boolean writeStatus) {
        this.pointManager = pointManager;
        this.point = point;
        this.writeStatus = writeStatus;
    }

    @Override
    public void run() {
        if(writeStatus){
            pointManager.randomChangePoint(point);
        } else {
            pointManager.length(point);
        }
    }
}
