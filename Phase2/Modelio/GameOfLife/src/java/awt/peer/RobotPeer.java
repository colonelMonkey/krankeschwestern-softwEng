package java.awt.peer;

import java.awt.Rectangle;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-28f0-0000-000000000000")
public interface RobotPeer {
    @objid ("92d26ad4-fd13-492d-91d4-cfad2da39389")
    void dispose();

    @objid ("e0fa06a1-f3e6-4630-9d64-b37466e020bd")
    int getRGBPixel(int p0, int p1);

    @objid ("09bf633c-8056-40c4-9da1-44930e6bc947")
    List<Integer> getRGBPixels(Rectangle p0);

    @objid ("5b728632-6341-4318-acb9-35211394390d")
    void keyPress(int p0);

    @objid ("22927a12-d3a7-425c-a9ee-749115b03b40")
    void keyRelease(int p0);

    @objid ("adf9c971-a2ee-4184-bb51-1421b04a42c4")
    void mouseMove(int p0, int p1);

    @objid ("182f02f4-d764-47a6-b891-d3c68d3644c9")
    void mousePress(int p0);

    @objid ("75dcac97-79dd-49ed-af42-eda2c4ae5a33")
    void mouseRelease(int p0);

    @objid ("168312f0-4d2b-4a18-8b55-72ee1c080e16")
    void mouseWheel(int p0);

}
