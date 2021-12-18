package java.util;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("01ec0d38-0000-1bd1-0000-000000000000")
public interface Deque extends Queue {
    @objid ("e3247669-d8a4-48c8-8909-8b88fdedf1db")
    boolean add(Object p0);

    @objid ("5debac81-a058-4565-b978-1774ea211a6d")
    void addFirst(Object p0);

    @objid ("2be0ec62-3d72-440e-a145-4c22183a25c2")
    void addLast(Object p0);

    @objid ("d532303c-175a-420c-b270-2105e63830ef")
    boolean contains(Object p0);

    @objid ("e3129d0f-bd99-483a-a495-2a48ace17b74")
    Iterator descendingIterator();

    @objid ("cfae7a5a-e9be-4203-9ae6-79f8df0da19d")
    Object element();

    @objid ("dc901bcf-f89a-461b-b10d-aaa4e0961b25")
    Object getFirst();

    @objid ("aebe3e52-5775-4879-bbbc-5f05cec0939f")
    Object getLast();

    @objid ("32cef6ed-13a6-4dfc-9abf-07a37b6cec8d")
    Iterator iterator();

    @objid ("e4563013-adab-4eca-be85-1f454a8b067f")
    boolean offer(Object p0);

    @objid ("fbc40187-9605-47c2-a4e2-bdcbaac4d610")
    boolean offerFirst(Object p0);

    @objid ("cc0139e2-ea5e-44ee-bdb4-e16b72da105c")
    boolean offerLast(Object p0);

    @objid ("6002f133-219a-4ac8-b8e2-a8b4dfafb068")
    Object peek();

    @objid ("1167b702-28d6-4d39-bb0b-d7f4d899d962")
    Object peekFirst();

    @objid ("490756d8-3e98-41d7-8187-25d2f97c0880")
    Object peekLast();

    @objid ("b4b51d95-7d65-445e-a381-1f12b5afc96b")
    Object poll();

    @objid ("4a093308-d8dc-4c63-9107-c7cdca693048")
    Object pollFirst();

    @objid ("908744b6-f31d-4b4d-af59-4a54b1f1bf3e")
    Object pollLast();

    @objid ("30f118ac-6a2f-46d6-af6e-cb17b9e1c177")
    Object pop();

    @objid ("ecc8e3cc-c3fc-4f38-8393-c39f385d5c96")
    void push(Object p0);

    @objid ("7fc133ce-e720-4409-9928-9514d1d2193a")
    Object remove();

    @objid ("f2a3ede1-8d2d-4552-9c78-8be15fea0707")
    boolean remove(Object p0);

    @objid ("ea6387d0-844f-4391-920b-0de6c082c6cf")
    Object removeFirst();

    @objid ("e96a6945-aa57-4b69-8bfc-3dd0d70e988d")
    boolean removeFirstOccurrence(Object p0);

    @objid ("59060575-c8c2-423c-9f25-ce304f3f0492")
    Object removeLast();

    @objid ("6b71a669-eb28-4818-be3d-4615a1064996")
    boolean removeLastOccurrence(Object p0);

    @objid ("f1cfdc91-e2e6-475f-8b01-901233289015")
    int size();

}
