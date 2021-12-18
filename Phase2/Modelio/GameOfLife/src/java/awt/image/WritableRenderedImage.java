package java.awt.image;

import java.awt.Point;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2835-0000-000000000000")
public interface WritableRenderedImage extends RenderedImage {
    @objid ("1e9a90fe-31a7-4810-8032-abdd0b62468c")
    void addTileObserver(TileObserver p0);

    @objid ("7ca24778-5f9d-4186-bd21-da8af8755984")
    WritableRaster getWritableTile(int p0, int p1);

    @objid ("12b8697d-6f43-4bec-9619-527a0eb5b5f8")
    List<Point> getWritableTileIndices();

    @objid ("a7323384-bbdf-4166-8cf4-26baa104545e")
    boolean hasTileWriters();

    @objid ("29e336e6-7649-4f03-a45a-79d7b2033aac")
    boolean isTileWritable(int p0, int p1);

    @objid ("c81d3d21-ee8b-44e0-8060-6c180388fb82")
    void releaseWritableTile(int p0, int p1);

    @objid ("94be195a-d8f4-4152-9896-b43437483273")
    void removeTileObserver(TileObserver p0);

    @objid ("442d5a05-18a9-4fff-a946-f5e502a88c7d")
    void setData(Raster p0);

}
