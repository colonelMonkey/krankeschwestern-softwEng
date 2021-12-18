package java.awt.im.spi;

import java.awt.AWTEvent;
import java.awt.Rectangle;
import java.lang.Character.Subset;
import java.util.List;
import java.util.Locale;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2930-0000-000000000000")
public interface InputMethod {
    @objid ("3f4a6591-eefe-4e5c-8dc9-fb3fa482f44e")
    void activate();

    @objid ("15079098-dfa3-4f9f-9083-6408c315616d")
    void deactivate(boolean p0);

    @objid ("0d0b6104-6387-414c-9769-3773e3c72a86")
    void dispatchEvent(AWTEvent p0);

    @objid ("4a878398-358c-4808-b4ad-f21f8a623315")
    void dispose();

    @objid ("cb922db3-0e7f-4d98-92c0-91132a64a9ef")
    void endComposition();

    @objid ("3315ed33-9c91-4fc4-b55d-38f31cb085c3")
    Object getControlObject();

    @objid ("44ddd0d1-1f87-47ae-b304-720ab88b61b0")
    Locale getLocale();

    @objid ("98ef32cf-3789-4d6e-a2d3-36df9421ca2b")
    void hideWindows();

    @objid ("484e5604-4b78-4fa7-a536-eaa65ccf5f9c")
    boolean isCompositionEnabled();

    @objid ("8a494cd9-b8da-4ead-a01a-75c3621a36a1")
    void notifyClientWindowChange(Rectangle p0);

    @objid ("69654cf8-8d95-4d32-9f2e-3e6bf160dc0f")
    void reconvert();

    @objid ("3b0a25a3-1977-41da-bca2-e272b96f7eef")
    void removeNotify();

    @objid ("ea8eae40-1b19-4ec3-8d7a-15dd168aafa5")
    void setCharacterSubsets(List<Subset> p0);

    @objid ("04555cd7-152b-4ccb-a7d7-ed29b9c0b7cd")
    void setCompositionEnabled(boolean p0);

    @objid ("6da0172d-5bf5-4b37-8215-219065477816")
    void setInputMethodContext(InputMethodContext p0);

    @objid ("c446ad84-99fe-4d1e-be08-7ec58bfbf6f5")
    boolean setLocale(Locale p0);

}
