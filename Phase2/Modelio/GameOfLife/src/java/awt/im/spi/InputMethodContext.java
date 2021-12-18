package java.awt.im.spi;

import java.awt.Window;
import java.awt.font.TextHitInfo;
import java.awt.im.InputMethodRequests;
import java.text.AttributedCharacterIterator;
import javax.swing.JFrame;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2932-0000-000000000000")
public interface InputMethodContext extends InputMethodRequests {
    @objid ("d39f74b8-81f0-4048-a489-00be99f8a2e8")
    JFrame createInputMethodJFrame(String p0, boolean p1);

    @objid ("62d53984-481c-4e9d-a19f-a54df0e6c82a")
    Window createInputMethodWindow(String p0, boolean p1);

    @objid ("5d6a7c62-7c61-4ceb-b8b9-b50c25f17202")
    void dispatchInputMethodEvent(int p0, AttributedCharacterIterator p1, int p2, TextHitInfo p3, TextHitInfo p4);

    @objid ("b844faf1-a5ea-490e-a9c7-6f5b4b701883")
    void enableClientWindowNotification(InputMethod p0, boolean p1);

}
