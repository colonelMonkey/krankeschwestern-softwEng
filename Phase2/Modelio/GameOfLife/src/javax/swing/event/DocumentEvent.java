package javax.swing.event;

import java.util.List;
import javax.swing.text.Document;
import javax.swing.text.Element;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2356-0000-000000000000")
public interface DocumentEvent {
    @objid ("2e423a62-5705-4b62-a143-8b5217ac811b")
    ElementChange getChange(Element p0);

    @objid ("1e222870-ae55-419c-8b93-ac8a5ca89267")
    Document getDocument();

    @objid ("4e58a20d-773c-4b43-8e76-1fcfb99f6dd6")
    int getLength();

    @objid ("3d6a0a4e-0edb-4e47-9383-51ca74c3f706")
    int getOffset();

    @objid ("5637b9d0-97bb-403e-9396-3ec1cf59d2b2")
    EventType getType();

    @objid ("00d00398-0000-2357-0000-000000000000")
    interface ElementChange {
        @objid ("d247f5a1-ec44-4e72-8302-7e2dedf350cb")
        List<Element> getChildrenAdded();

        @objid ("c2a16368-a37d-481d-bbea-0da839f079ed")
        List<Element> getChildrenRemoved();

        @objid ("2cabee8a-fc04-41a8-83e0-708a70f17162")
        Element getElement();

        @objid ("5c9ef4ea-ec80-4819-a533-3f4ea51b5183")
        int getIndex();

    }

    @objid ("00d00398-0000-2358-0000-000000000000")
    static final class EventType {
    }

}
