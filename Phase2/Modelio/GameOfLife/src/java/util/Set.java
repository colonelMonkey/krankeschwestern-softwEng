package java.util;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2ba3-0000-000000000000")
public interface Set extends Collection {
    @objid ("539e8725-a549-4d52-ba54-7fe733382762")
    boolean add(Object p0);

    @objid ("9b3a30ee-2c75-47b5-8aa6-246316f081eb")
    boolean addAll(Collection p0);

    @objid ("72e72083-0fbf-4ebc-a5f1-5fb97b1d4d86")
    void clear();

    @objid ("42a190f8-3f82-4261-955e-53f1ee3c8b6f")
    boolean contains(Object p0);

    @objid ("18a36da6-2ba8-4eb2-9785-a8bf905a46a4")
    boolean containsAll(Collection p0);

    @objid ("73008311-99a8-4e6c-8c89-51f1ae956bee")
    boolean equals(Object p0);

    @objid ("e7b07ab4-a74d-49f4-88c1-47a3d7df991b")
    int hashCode();

    @objid ("341a2236-d248-4008-be2b-d8e5ab422550")
    boolean isEmpty();

    @objid ("2a95e322-ab30-4fcd-ad31-652416ab7748")
    Iterator iterator();

    @objid ("e47410f2-6358-4680-a314-a4aa437d0fcb")
    boolean remove(Object p0);

    @objid ("6ad37ef2-d3fc-407e-a8f3-92d021ffb8bf")
    boolean removeAll(Collection p0);

    @objid ("c38a51b1-150f-4f0f-97c2-2c57e4120102")
    boolean retainAll(Collection p0);

    @objid ("3d374c49-482c-4c5e-a081-fe5d69579206")
    int size();

    @objid ("f8d40b9d-c0ac-4270-878c-844d606a4c2f")
    Spliterator spliterator();

    @objid ("c0aa0963-7d47-4fc4-a3b0-2b75e248a689")
    List<Object> toArray();

    @objid ("c2b92313-41e0-4c0e-84ea-1db742e3b35a")
    List<Object> toArray(List<Object> p0);

}
