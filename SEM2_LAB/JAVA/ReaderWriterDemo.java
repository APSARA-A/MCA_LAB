class SharedData {
    private String data;
    private boolean isWritten = false;

    
    public synchronized void write(String value) {
        while (isWritten) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        data = value;
        System.out.println("Writer wrote: " + data);
        isWritten = true;
        notify();
    }

    
    public synchronized void read() {
        while (!isWritten) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Reader read: " + data);
        isWritten = false;
        notify();
    }
}

class Writer extends Thread {
    SharedData sd;

    Writer(SharedData sd) {
        this.sd = sd;
    }

    public void run() {
        sd.write("Hello Appu!");
    }
}


class Reader extends Thread {
    SharedData sd;

    Reader(SharedData sd) {
        this.sd = sd;
    }

    public void run() {
        sd.read();
    }
}

// Main Class
public class ReaderWriterDemo {
    public static void main(String[] args) {
        SharedData sd = new SharedData();

        Writer w = new Writer(sd);
        Reader r = new Reader(sd);

        w.start();
        r.start();
    }
}