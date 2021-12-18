package java.util;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2cdb-0000-000000000000")
public interface Collection extends Iterable {
    @objid ("90fbb039-3804-4f1e-b80d-15d732e03a24")
    boolean add(Object p0);

    @objid ("dd77b66e-abfb-4373-9587-54939e6e5879")
    boolean addAll(Collection p0);

    @objid ("cbcca270-48bb-4566-88e5-0051830a23f2")
    void clear();

    @objid ("7df33c15-5f41-4b72-9493-d32fd6fb7861")
    boolean contains(Object p0);

    @objid ("b0f1349b-efcc-4864-b76b-e0683dbe9c58")
    boolean containsAll(Collection p0);

    @objid ("48fee764-3751-4b98-80f8-6f5e1754fddd")
    boolean equals(Object p0);

    @objid ("2d8f23b0-301b-4dfe-8883-6c74d0708bd7")
    int hashCode();

    @objid ("169f6f66-ab6a-468d-92ea-452d45d0d360")
    boolean isEmpty();

    @objid ("1dc87bb3-e32c-4aca-839e-6a3084068277")
    Iterator iterator();

    @objid ("50846885-0b6f-4e0b-8eb0-772bc24a3e17")
    Stream parallelStream();

    @objid ("e132caf1-6700-4306-b4ea-10a90739b48f")
    boolean remove(Object p0);

    @objid ("3c035c84-ca7a-4727-a2ae-834978f7fff2")
    boolean removeAll(Collection p0);

    @objid ("f541b7a1-2043-4c58-8940-b2a1346dfd25")
    boolean removeIf(Predicate p0);

    @objid ("c2272d6b-74c9-4bb0-9395-57e0e1dd975b")
    boolean retainAll(Collection p0);

    @objid ("4225d79e-7607-4f6e-8791-bf2b266529a6")
    int size();

    @objid ("6de38c4f-a276-4a4a-9e4c-1ee6042cf561")
    Spliterator spliterator();

    @objid ("1ffd0662-5ad1-4780-8c69-ffd431fc242b")
    Stream stream();

    @objid ("d30c55c5-be28-47d9-be8a-43aa29487785")
    List<Object> toArray(List<Object> p0);

    @objid ("67365802-f095-4f87-9537-686f00bf0fde")
    List<Object> toArray();

}
