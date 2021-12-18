package javax.swing.text;

import java.awt.Graphics;
import java.awt.Point;
import javax.swing.event.ChangeListener;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-202b-0000-000000000000")
public interface Caret {
    @objid ("0c6c769e-d222-4775-8751-faeabef8e09c")
    void addChangeListener(ChangeListener p0);

    @objid ("35ba7d2e-34d9-42ee-acfd-c35aa20ce761")
    void deinstall(JTextComponent p0);

    @objid ("2884d6df-0667-45ab-a2a6-ce1fbfce824b")
    int getBlinkRate();

    @objid ("8f80f72d-a6e9-4141-a463-e8a470f06237")
    int getDot();

    @objid ("7a574362-d378-4c97-80d8-8f464bee6b7c")
    Point getMagicCaretPosition();

    @objid ("3eac81b9-dac6-4d5e-a1c8-fb4c8f4dd31d")
    int getMark();

    @objid ("11c456a6-53b3-4924-8eda-670235bdc07b")
    void install(JTextComponent p0);

    @objid ("3279bd96-7bb8-4620-b474-d89096f45195")
    boolean isSelectionVisible();

    @objid ("17c3fcac-6cbc-4ca2-88c2-e034d7bca442")
    boolean isVisible();

    @objid ("29c940d6-377d-4d14-8493-d0223db96b21")
    void moveDot(int p0);

    @objid ("24be4cf7-3741-40cf-a813-c89bc1e57947")
    void paint(Graphics p0);

    @objid ("79083279-a827-49e1-a4b4-785c5fe7e854")
    void removeChangeListener(ChangeListener p0);

    @objid ("e2633895-1e9d-4ab1-8e67-2c0e9b09a83b")
    void setBlinkRate(int p0);

    @objid ("b492db4e-3294-4373-b6c9-e344cd8d4297")
    void setDot(int p0);

    @objid ("2b6aafc0-fc7d-4b81-9056-e2ed635c5c9f")
    void setMagicCaretPosition(Point p0);

    @objid ("692b8991-3d1d-4c8c-82c6-5b9b901c003b")
    void setSelectionVisible(boolean p0);

    @objid ("51763b8b-6d8f-4208-afed-25946dc8d512")
    void setVisible(boolean p0);

}
