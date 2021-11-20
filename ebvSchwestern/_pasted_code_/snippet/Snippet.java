package snippet;

public class Snippet
{
  protected JLabel getLbTextEingabe()
    {
      if (lbTextEingabe == null)
      {
        lbTextEingabe = new JLabel("Text:");
        lbTextEingabe.setBounds(10, 10, 40, 20);
      }
      return lbTextEingabe;
    }
}

