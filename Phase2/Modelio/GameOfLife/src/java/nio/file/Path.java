package java.nio.file;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchEvent.Modifier;
import java.util.Iterator;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2580001c-0002-3f2d-0000-000000000000")
public interface Path extends Comparable, Iterable, Watchable {
    @objid ("0ca209b8-64ad-4e4f-b112-b68339868768")
    int compareTo(Path p0);

    @objid ("7ae9789a-ec42-4800-a04a-0bb03af11353")
    int compareTo(Object p0);

    @objid ("f064fc5b-f2e7-457e-af5a-6d486a921aa4")
    boolean endsWith(Path p0);

    @objid ("5f32c009-f392-4ed6-afd6-86c34794d2fa")
    boolean endsWith(String p0);

    @objid ("175b62d1-269b-4539-8bab-032fba3e8f14")
    boolean equals(Object p0);

    @objid ("1dd3d047-cd93-4cb8-97da-54e6910046c3")
    Path getFileName();

    @objid ("ab4215f2-bb7b-412f-90b6-e5f3b6bb2d6b")
    FileSystem getFileSystem();

    @objid ("d5adc997-8e5d-4007-b89b-b1e431000637")
    Path getName(int p0);

    @objid ("f07f18f3-143f-41ea-91ad-48095c620eb7")
    int getNameCount();

    @objid ("7bf9739e-4367-43eb-98d5-662a5ddf878a")
    Path getParent();

    @objid ("a1faa968-1b83-422a-8440-def51159eee2")
    Path getRoot();

    @objid ("72ba09da-6727-4d71-a34b-1fd997c7289a")
    int hashCode();

    @objid ("86fab6e1-0285-43d1-aa47-8fdda9dabcb5")
    boolean isAbsolute();

    @objid ("fc879f5d-1963-4f9e-97af-4caf5c9e5860")
    Iterator iterator();

    @objid ("b8cdd33b-6151-4e8d-a2aa-21a1005fdafd")
    Path normalize();

    @objid ("48711289-60d3-40f4-991e-75d2e8a98af1")
    WatchKey register(WatchService p0, List<Kind> p1, List<Modifier> p2) throws IOException;

    @objid ("4c97c65c-45c7-4773-8c7a-51b464f78f7b")
    WatchKey register(WatchService p0, List<Kind> p1) throws IOException;

    @objid ("177a0e6f-0ccd-49dd-b131-99aa992765a9")
    Path relativize(Path p0);

    @objid ("307ac72f-09fb-463a-85ff-75dc01978d4b")
    Path resolve(Path p0);

    @objid ("40c0225c-5f6c-4587-af12-15ede2bb8518")
    Path resolve(String p0);

    @objid ("2e88aed7-f129-4418-be61-22038ebb82a5")
    Path resolveSibling(Path p0);

    @objid ("9c3bff26-f4e9-49e1-9f1b-c4ef40a78ed9")
    Path resolveSibling(String p0);

    @objid ("bee42474-46d9-4dbc-8ba7-8b288aab8676")
    boolean startsWith(String p0);

    @objid ("28175554-6c53-4b1f-898c-2d0cf75a0e92")
    boolean startsWith(Path p0);

    @objid ("b7779ea4-3068-4c22-a1b2-043f92d164a3")
    Path subpath(int p0, int p1);

    @objid ("28c586d1-2539-48e6-a039-8d0e1b6e7f53")
    Path toAbsolutePath();

    @objid ("b52ec2fd-3fad-4fce-b7d2-23dd5056e5c6")
    File toFile();

    @objid ("50ec6d5f-7eff-4e9e-81fd-9844becf3317")
    Path toRealPath(List<LinkOption> p0) throws IOException;

    @objid ("d1eefada-9d93-4912-b5ec-3637022140fc")
    String toString();

    @objid ("1a6af296-b50b-4985-a705-f01b1146549a")
    URI toUri();

}
