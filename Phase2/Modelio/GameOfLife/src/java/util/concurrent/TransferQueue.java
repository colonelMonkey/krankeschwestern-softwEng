package java.util.concurrent;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0006-b423-0000-000000000000")
public interface TransferQueue extends BlockingQueue {
    @objid ("b15edb60-5b7a-4f3b-b99f-b851ff10e991")
    int getWaitingConsumerCount();

    @objid ("d09157d3-53d6-464c-8d06-7175f43bf1fc")
    boolean hasWaitingConsumer();

    @objid ("bdaa66ba-c712-46d0-b922-f559c8f4f07a")
    void transfer(Object p0) throws InterruptedException;

    @objid ("ffaa9651-102b-4b22-8982-34638db767e9")
    boolean tryTransfer(Object p0);

    @objid ("b9b27d73-0d3d-4af8-8cd3-b3060e17cd83")
    boolean tryTransfer(Object p0, long p1, TimeUnit p2) throws InterruptedException;

}
