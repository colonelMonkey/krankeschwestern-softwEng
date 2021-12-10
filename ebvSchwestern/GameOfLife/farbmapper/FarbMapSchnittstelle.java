package farbmapper;

import java.awt.Color;

public interface FarbMapSchnittstelle
{
  Color getFarbe(int zustand);
  void farbverlaufDialog();
}
