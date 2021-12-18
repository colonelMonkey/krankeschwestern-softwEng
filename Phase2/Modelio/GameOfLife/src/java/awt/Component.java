package java.awt;

import java.awt.event.ComponentListener;
import java.awt.event.FocusListener;
import java.awt.image.BufferStrategy;
import java.awt.image.ImageObserver;
import java.io.Serializable;
import javax.accessibility.AccessibleComponent;
import javax.accessibility.AccessibleContext;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-293f-0000-000000000000")
public abstract class Component implements ImageObserver, MenuContainer, Serializable {
    @objid ("a205439a-d3d4-45f0-9876-70a991c0dd2a")
    protected abstract class AccessibleAWTComponent extends AccessibleContext implements Serializable, AccessibleComponent {
        @objid ("89e3ad9a-c754-4f76-99b6-98e604d2a2af")
        protected class AccessibleAWTComponentHandler implements ComponentListener {
        }

        @objid ("eb40387f-b5f1-4277-8352-abaf33871fde")
        protected class AccessibleAWTFocusHandler implements FocusListener {
        }

    }

    @objid ("7872b7d7-409d-4306-a3dc-3a2de4068af1")
    protected class BltBufferStrategy extends BufferStrategy {
    }

    @objid ("62a013e3-b7b7-40d9-a60e-7e8aee2f1b38")
    protected class FlipBufferStrategy extends BufferStrategy {
    }

    @objid ("9ac167ef-2212-439b-9a1d-5d2592b21e1d")
    public enum BaselineResizeBehavior {
        ;
    }

}
