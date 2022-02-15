package regeleditor;

public interface RegeleditorSchnittstelle
{
   void re_laden();
   boolean re_speichern();
   boolean getTopo();
   void regelDialog();
   String getRegel(); // Array von invers polnischen Anweisungen als chars => String
}
