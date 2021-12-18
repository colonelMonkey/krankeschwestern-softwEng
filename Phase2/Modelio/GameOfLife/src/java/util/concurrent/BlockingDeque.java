package java.util.concurrent;

import java.util.Deque;
import java.util.Iterator;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1b57-0000-000000000000")
public interface BlockingDeque extends BlockingQueue, Deque {
    @objid ("f0773507-684a-40fb-b6c8-e741018890b7")
    boolean add(Object p0);

    @objid ("2858f8b6-8b26-4147-8ead-709c0c671f52")
    void addFirst(Object p0);

    @objid ("4cb6df08-d714-4326-a0b7-8428b7960cc8")
    void addLast(Object p0);

    @objid ("ed448790-942d-4ceb-9c12-f8a862efe085")
    boolean contains(Object p0);

    @objid ("e1e87a89-d5aa-4568-8752-0c1755dac37f")
    Object element();

    @objid ("09fe7f54-93b9-44a0-a9ad-52f63fce0062")
    Iterator iterator();

    @objid ("fb403401-cc17-4470-b8d4-974cf983f41a")
    boolean offer(Object p0);

    @objid ("38df641a-4995-43c7-aae5-56fa41f50051")
    boolean offer(Object p0, long p1, TimeUnit p2) throws InterruptedException;

    @objid ("2f5a9219-73ef-4c6f-9ea2-311610400db6")
    boolean offerFirst(Object p0, long p1, TimeUnit p2) throws InterruptedException;

    @objid ("2e60b5bc-eacc-4a9f-a957-7ca086b126ad")
    boolean offerFirst(Object p0);

    @objid ("872cc9b4-28e9-4260-b798-a944e824346a")
    boolean offerLast(Object p0);

    @objid ("ed62dd6b-8491-4281-9b59-4e5e2e00716e")
    boolean offerLast(Object p0, long p1, TimeUnit p2) throws InterruptedException;

    @objid ("bdf651be-4850-45e2-8945-5f608585d81e")
    Object peek();

    @objid ("d7212252-46bd-436e-8172-69f5336d818f")
    Object poll(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("053ea054-ddb2-4f5a-8764-822d1686c2b5")
    Object poll();

    @objid ("38f20706-512c-48e1-8323-02ceefb82496")
    Object pollFirst(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("12d8d327-4377-4868-9a0a-a23cebf34e56")
    Object pollLast(long p0, TimeUnit p1) throws InterruptedException;

    @objid ("047f7cf2-828c-4d00-b309-87d9a226a1d6")
    void push(Object p0);

    @objid ("22cc6af7-fabb-4da9-be44-e1536741284d")
    void put(Object p0) throws InterruptedException;

    @objid ("81885d12-2a6b-4b40-8f4c-b07dd9d5c77f")
    void putFirst(Object p0) throws InterruptedException;

    @objid ("4252da3c-a965-466a-a0c4-f7c476d2bde8")
    void putLast(Object p0) throws InterruptedException;

    @objid ("93b9c574-7002-47af-9e7a-deb6f6d46d16")
    Object remove();

    @objid ("de83c4fc-7470-440d-a8a2-fd72177cacaf")
    boolean remove(Object p0);

    @objid ("61f0eafe-8434-4dd1-9efb-9deb18895974")
    boolean removeFirstOccurrence(Object p0);

    @objid ("52a3ef62-ed9f-4f1c-9905-828258bf509c")
    boolean removeLastOccurrence(Object p0);

    @objid ("54bbffaa-f733-49a6-ae76-8e7822083044")
    int size();

    @objid ("864f7611-0115-4235-9f03-431c80276035")
    Object take() throws InterruptedException;

    @objid ("f108ea59-b7c6-4b5e-bd66-ece511d9ed74")
    Object takeFirst() throws InterruptedException;

    @objid ("d7410d6c-8831-4dbe-bf31-d7511ea84802")
    Object takeLast() throws InterruptedException;

}
