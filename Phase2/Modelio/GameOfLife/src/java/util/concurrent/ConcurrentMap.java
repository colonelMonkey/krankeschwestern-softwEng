package java.util.concurrent;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2be7-0000-000000000000")
public interface ConcurrentMap extends Map {
    @objid ("e99bdedd-8a3c-433d-b13b-a52d789d5351")
    Object compute(Object p0, BiFunction p1);

    @objid ("f8f30086-8c17-46f5-addc-74a44da008a7")
    Object computeIfAbsent(Object p0, Function p1);

    @objid ("719cb66c-6ee7-42d7-a91e-a4bcf8ea17bb")
    Object computeIfPresent(Object p0, BiFunction p1);

    @objid ("d80bd9b9-7511-4788-a681-d3ccbebc67a3")
    void forEach(BiConsumer p0);

    @objid ("e9e35aa7-f483-420f-8928-e65e02465543")
    Object getOrDefault(Object p0, Object p1);

    @objid ("43dc742e-1907-4935-933d-681906355035")
    Object merge(Object p0, Object p1, BiFunction p2);

    @objid ("1fa43211-b8ac-49a1-aa1b-7494b0f4253f")
    Object putIfAbsent(Object p0, Object p1);

    @objid ("40f47655-381d-4a8e-8162-7684f2f73861")
    boolean remove(Object p0, Object p1);

    @objid ("14d025b0-f513-415f-9900-051565160aa0")
    boolean replace(Object p0, Object p1, Object p2);

    @objid ("eab3ad60-1b69-4657-96a2-e57ba2d2807e")
    Object replace(Object p0, Object p1);

    @objid ("48b4d958-f3e9-4ebf-bd5a-6941582c3e55")
    void replaceAll(BiFunction p0);

    @objid ("6d961e15-ab03-43f4-9402-bc7bc9ed242a")
    void lambda$replaceAll$0(BiFunction p0, Object p1, Object p2);

}
