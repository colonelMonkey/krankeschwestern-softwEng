package java.awt.im;

import java.awt.Rectangle;
import java.awt.font.TextHitInfo;
import java.text.AttributedCharacterIterator.Attribute;
import java.text.AttributedCharacterIterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2936-0000-000000000000")
public interface InputMethodRequests {
    @objid ("a0ebfdcd-95b3-4375-96ba-34209a9fd47f")
    AttributedCharacterIterator cancelLatestCommittedText(List<Attribute> p0);

    @objid ("31ecf175-6a01-4ae3-97b5-6a34a1e68c2d")
    AttributedCharacterIterator getCommittedText(int p0, int p1, List<Attribute> p2);

    @objid ("46e6cb8c-8f4f-41b9-89df-455eba4a45f0")
    int getCommittedTextLength();

    @objid ("1ead2509-7e0b-47e2-aff4-2feb370b4f73")
    int getInsertPositionOffset();

    @objid ("3e94652e-a638-42ed-abe6-a2216425bab9")
    TextHitInfo getLocationOffset(int p0, int p1);

    @objid ("d7f759e7-b79b-4c9a-be4b-8e627496b7dd")
    AttributedCharacterIterator getSelectedText(List<Attribute> p0);

    @objid ("61001f0d-1c71-49ea-a217-88451deb5f6f")
    Rectangle getTextLocation(TextHitInfo p0);

}
