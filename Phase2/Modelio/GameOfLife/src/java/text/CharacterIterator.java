package java.text;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2de7-0000-000000000000")
public interface CharacterIterator extends Cloneable {
    @objid ("e6a792fc-9c71-4384-bc04-120db2b58cf9")
    Object clone();

    @objid ("7177be47-05f2-4044-9326-038b8ee8af89")
    char current();

    @objid ("c9648f15-f246-41e8-a6af-51bfe1fbd2d8")
    char first();

    @objid ("be526137-f6d7-4a1b-bade-eb6d08241011")
    int getBeginIndex();

    @objid ("4a1f4bf1-2d98-42a0-98ee-ddccc65c1c9e")
    int getEndIndex();

    @objid ("5e7eab47-0d79-4198-ba26-d834acac696e")
    int getIndex();

    @objid ("de0264c7-bc9a-43fb-badf-47a1d86c5124")
    char last();

    @objid ("b1b60501-47c6-4faf-966e-68ec08ec25f0")
    char next();

    @objid ("50ad896f-fde4-48f0-81ed-8c1ffd3ebab8")
    char previous();

    @objid ("832e5d46-59ff-4730-b732-ac4e3e5c0c4d")
    char setIndex(int p0);

}
