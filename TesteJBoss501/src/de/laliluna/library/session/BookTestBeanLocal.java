package de.laliluna.library.session;

import javax.ejb.Local;

@Local
public interface BookTestBeanLocal{

   public int somaLocal(int x, int y);
}
