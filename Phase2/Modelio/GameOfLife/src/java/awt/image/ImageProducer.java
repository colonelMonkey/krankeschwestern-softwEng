package java.awt.image;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2824-0000-000000000000")
public interface ImageProducer {
    @objid ("f494ab8b-0187-40d5-b52a-6f9635bed9c0")
    void addConsumer(ImageConsumer p0);

    @objid ("23930935-07a9-4889-808e-20c25ecf17ff")
    boolean isConsumer(ImageConsumer p0);

    @objid ("29a2add5-e7d6-4355-9e74-d6dc8ad5ee59")
    void removeConsumer(ImageConsumer p0);

    @objid ("400fd75a-f9a0-4c12-a400-7e9c8be436d0")
    void requestTopDownLeftRightResend(ImageConsumer p0);

    @objid ("14a32cd5-8c9e-434a-9d11-dd608c16f5df")
    void startProduction(ImageConsumer p0);

}
