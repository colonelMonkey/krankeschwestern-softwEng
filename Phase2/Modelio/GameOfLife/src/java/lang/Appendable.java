package java.lang;

import java.io.IOException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("00d00398-0000-2b5e-0000-000000000000")
public interface Appendable {
    @objid ("0b949afd-551c-4fb2-a440-6aab7063ecce")
    Appendable append(CharSequence p0) throws IOException;

    @objid ("3deefa42-beaa-4daf-883f-351721e0eab1")
    Appendable append(CharSequence p0, int p1, int p2) throws IOException;

    @objid ("28efaa7a-6ef3-46ed-8f26-e04a25476b48")
    Appendable append(char p0) throws IOException;

}
