package java.awt.peer;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.BufferCapabilities.FlipContents;
import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.PaintEvent;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.image.VolatileImage;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import sun.awt.CausedFocusEvent.Cause;
import sun.java2d.pipe.Region;

@objid ("00d00398-0000-28f2-0000-000000000000")
public interface ComponentPeer {
    @objid ("1326fa14-975b-4a4a-b8e5-4dc38432f9a2")
    void applyShape(Region p0);

    @objid ("4e08e44d-b161-42c0-af8f-6e734e965833")
    boolean canDetermineObscurity();

    @objid ("4a56484e-4288-45fb-a326-215d0509dbd2")
    int checkImage(Image p0, int p1, int p2, ImageObserver p3);

    @objid ("2f37928f-52c0-4a18-b51b-600faf84569a")
    void coalescePaintEvent(PaintEvent p0);

    @objid ("5af78792-9292-4e06-997d-79a20119f318")
    void createBuffers(int p0, BufferCapabilities p1) throws AWTException;

    @objid ("03e2d65f-377b-4590-b17f-3ba89051c2e1")
    Image createImage(int p0, int p1);

    @objid ("ed06c840-0fde-4f3b-8ebf-ba28899d8ee8")
    Image createImage(ImageProducer p0);

    @objid ("3cfa339c-9c24-4ef3-afb0-716db673541d")
    VolatileImage createVolatileImage(int p0, int p1);

    @objid ("30e93a5f-ed65-435b-9cbf-84fe3f9967f3")
    void destroyBuffers();

    @objid ("d9c46984-fe54-4a19-8ff8-a2716478a297")
    void dispose();

    @objid ("be993e9b-efdc-4706-bf82-5f3dc9f2f7da")
    void flip(int p0, int p1, int p2, int p3, FlipContents p4);

    @objid ("5c854105-f8ec-4b8a-be12-5b2c48662c3d")
    Image getBackBuffer();

    @objid ("c8391dd3-c8fd-4e4d-aa0c-74466ec3cbf1")
    ColorModel getColorModel();

    @objid ("07fcd19a-ac7a-4f2f-b019-29cac36e34ee")
    FontMetrics getFontMetrics(Font p0);

    @objid ("ec07e369-a46a-4cba-ad0e-b8441dc0650e")
    Graphics getGraphics();

    @objid ("2c1b5bcc-abbe-4396-aed1-e3f8bbe8eb4b")
    GraphicsConfiguration getGraphicsConfiguration();

    @objid ("96e48fae-13e2-4792-91b5-6a6f57c4dbb1")
    Point getLocationOnScreen();

    @objid ("8232baeb-310c-416d-bc75-e0af64c06a1d")
    Dimension getMinimumSize();

    @objid ("25c09837-dbf2-49ff-85a2-3d745095eefd")
    Dimension getPreferredSize();

    @objid ("82a978ba-3987-4b34-812e-10051a343ae1")
    void handleEvent(AWTEvent p0);

    @objid ("fd9383f2-0fd7-48ed-9440-242145013558")
    boolean handlesWheelScrolling();

    @objid ("a20f13a2-4fe7-4756-b3fe-796aa254bcac")
    boolean isFocusable();

    @objid ("1c684849-8598-4cd4-8596-89b5e0a1676e")
    boolean isObscured();

    @objid ("4e698255-2994-4c27-baba-d8dd2ec02aca")
    boolean isReparentSupported();

    @objid ("f5fb5f9b-3598-4a5c-a85b-4eb567074145")
    void layout();

    @objid ("0b655397-9dc3-42b9-8607-10d140492c81")
    void paint(Graphics p0);

    @objid ("e590e575-76b1-4afe-89d6-960fa10336c2")
    boolean prepareImage(Image p0, int p1, int p2, ImageObserver p3);

    @objid ("58926422-7a55-4596-a141-fc3930fae024")
    void print(Graphics p0);

    @objid ("95d456ac-1bc6-426b-b075-6400d78dfeea")
    void reparent(ContainerPeer p0);

    @objid ("976411f8-1d5d-4117-a6ca-80cfab431934")
    boolean requestFocus(Component p0, boolean p1, boolean p2, long p3, Cause p4);

    @objid ("6bee35b0-875b-4f7b-878f-d74418072fd1")
    void setBackground(Color p0);

    @objid ("e5c70d54-bae4-46fb-a6a9-780b2f427c70")
    void setBounds(int p0, int p1, int p2, int p3, int p4);

    @objid ("0f91e13f-b488-400c-b5f0-31ea1dcbea05")
    void setEnabled(boolean p0);

    @objid ("c796d449-a2ce-49c0-b85f-90affe3b40fe")
    void setFont(Font p0);

    @objid ("9a53ed9a-d8d6-4515-990c-c637a2104453")
    void setForeground(Color p0);

    @objid ("80614eae-dc13-4a1b-8c70-019961a8e0a2")
    void setVisible(boolean p0);

    @objid ("d224832c-2028-4dfb-add3-b766e44c3d97")
    void setZOrder(ComponentPeer p0);

    @objid ("b7c1e9e6-2902-41a6-9d4c-36bf07e561cc")
    void updateCursorImmediately();

    @objid ("aed34e8e-f5ce-4bc2-a86a-a9157d6dca9d")
    boolean updateGraphicsData(GraphicsConfiguration p0);

}
