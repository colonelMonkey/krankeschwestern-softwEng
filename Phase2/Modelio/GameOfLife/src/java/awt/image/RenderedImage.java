package java.awt.image;

import java.awt.Rectangle;
import java.util.List;
import java.util.Vector;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2830-0000-000000000000")
public interface RenderedImage {
    @objid ("6ad48b63-cc43-472e-b6fd-2a92bb7dc50a")
    WritableRaster copyData(WritableRaster p0);

    @objid ("d50fae55-5bbe-4ad3-a32e-1fa09cec11eb")
    ColorModel getColorModel();

    @objid ("8e34a9fa-bfb7-4339-9e49-c26d9f7113de")
    Raster getData(Rectangle p0);

    @objid ("8ac73703-074d-42b2-9019-732dbb575f0e")
    Raster getData();

    @objid ("56486f00-7bd0-4330-bac5-51eb88a654c2")
    int getHeight();

    @objid ("453cc881-1a05-4f78-a870-bace4d08f323")
    int getMinTileX();

    @objid ("7bfa021c-5c32-4568-b1da-81ed307b9b36")
    int getMinTileY();

    @objid ("8531ece9-bb0d-438c-ad2e-cdc12cfb96a9")
    int getMinX();

    @objid ("4ba164d8-5928-4d52-8e6a-c4541896db6e")
    int getMinY();

    @objid ("ec976c47-bef6-49e1-84b7-3b359f1da148")
    int getNumXTiles();

    @objid ("a5ebc305-e134-4caf-9641-b44ca5326a0e")
    int getNumYTiles();

    @objid ("c526c6e8-5fd4-4c36-b403-b05fdc28d477")
    Object getProperty(String p0);

    @objid ("9145a1be-6c2b-48b7-b492-ec8ae76970d7")
    List<String> getPropertyNames();

    @objid ("a4518d6c-3fd7-4ecf-af2e-2a3396f7b8ba")
    SampleModel getSampleModel();

    @objid ("6930d50e-ab73-4388-aaf7-95e1d7b391e8")
    Vector getSources();

    @objid ("d6033100-bf45-43a6-afc5-9a19129a194f")
    Raster getTile(int p0, int p1);

    @objid ("b89a9cfa-7c56-4444-93ff-95259d4cad3c")
    int getTileGridXOffset();

    @objid ("cadf2d6f-47bf-4b27-a1d2-b16de89d3123")
    int getTileGridYOffset();

    @objid ("2bb9281c-a1c0-4b1e-9cc0-c0cdd2e8cf2c")
    int getTileHeight();

    @objid ("2d2bb3fc-0a50-4a3b-92a3-a292459ab578")
    int getTileWidth();

    @objid ("9048c97a-ad78-4f59-828d-11acf59d547c")
    int getWidth();

}
