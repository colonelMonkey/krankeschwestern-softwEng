package java.util.function;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("bd22e8be-5eef-42d9-a9fb-aa7542462c95")
public interface LongPredicate {
    @objid ("ee5c1c29-cb73-43d0-a08b-b10aeb132b7b")
    LongPredicate and(LongPredicate p0);

    @objid ("92280629-ce98-44cf-b0dd-00a868cad6fe")
    LongPredicate negate();

    @objid ("715ba2e0-b6c9-4890-b945-f483e0c3cb27")
    LongPredicate or(LongPredicate p0);

    @objid ("e9c60e74-05cc-48d9-b7f4-4767cabf800d")
    boolean test(long p0);

    @objid ("5032039b-43e4-4ec3-a082-c8fc759ba22a")
    boolean lambda$and$0(LongPredicate p0, long p1);

    @objid ("8395190d-af47-4e3a-8f85-d41e1a265364")
    boolean lambda$negate$1(long p0);

    @objid ("9c005aa2-f5c6-4dda-a861-a3ac85e94204")
    boolean lambda$or$2(LongPredicate p0, long p1);

}
