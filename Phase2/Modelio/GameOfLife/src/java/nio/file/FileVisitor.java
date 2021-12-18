package java.nio.file;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributes;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0007-147f-0000-000000000000")
public interface FileVisitor {
    @objid ("39aa3ee8-fb7f-4a95-9f1f-7b762b3c89d6")
    FileVisitResult postVisitDirectory(Object p0, IOException p1) throws IOException;

    @objid ("0782881f-16ed-4b42-a00c-536d8b483c3e")
    FileVisitResult preVisitDirectory(Object p0, BasicFileAttributes p1) throws IOException;

    @objid ("1daad409-c573-43de-9227-89d6802fda75")
    FileVisitResult visitFile(Object p0, BasicFileAttributes p1) throws IOException;

    @objid ("377e81ab-27eb-4307-8d4d-57a13d113ec9")
    FileVisitResult visitFileFailed(Object p0, IOException p1) throws IOException;

}
