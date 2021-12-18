package javax.swing.text;

import java.awt.Graphics;
import java.awt.Shape;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-204e-0000-000000000000")
public interface Highlighter {
    @objid ("59d9c181-9e47-49d5-8d88-b9fdbb025379")
    Object addHighlight(int p0, int p1, HighlightPainter p2) throws BadLocationException;

    @objid ("cb23f1f4-8aea-4b3d-ae8d-a4f4db550908")
    void changeHighlight(Object p0, int p1, int p2) throws BadLocationException;

    @objid ("efa29136-3690-462f-b048-abb055d52315")
    void deinstall(JTextComponent p0);

    @objid ("2692a46a-7593-4cb2-a412-b93d8961ed02")
    List<Highlight> getHighlights();

    @objid ("04a19584-af1c-472b-8eca-296b949a6239")
    void install(JTextComponent p0);

    @objid ("3cd25e68-284c-4b94-9863-da378be54525")
    void paint(Graphics p0);

    @objid ("7ca69b37-7f47-4458-9df0-cc90c9a6ea53")
    void removeAllHighlights();

    @objid ("1b10bb52-f00b-483f-9bf4-dec322f0220c")
    void removeHighlight(Object p0);

    @objid ("00d00398-0000-204f-0000-000000000000")
    interface Highlight {
        @objid ("1380aa0e-86f8-4fcb-82d8-04e4d1db0114")
        int getEndOffset();

        @objid ("bef61cf0-ec44-4d54-8294-45e3160411fe")
        HighlightPainter getPainter();

        @objid ("d516cc7d-3811-41a1-a1ca-6e4fb760d7a3")
        int getStartOffset();

    }

    @objid ("00d00398-0000-2050-0000-000000000000")
    interface HighlightPainter {
        @objid ("afcb6ca5-f041-403e-b84a-ac45f286ea7a")
        void paint(Graphics p0, int p1, int p2, Shape p3, JTextComponent p4);

    }

}
